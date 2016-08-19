package org.york.gamified.modelling;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.york.gamified.modelling.model.Edge;
import org.york.gamified.modelling.model.Model;
import org.york.gamified.modelling.model.Node;
import org.york.gamified.modelling.model.Objective;
import org.york.gamified.modelling.model.RefNode;
import org.york.gamified.modelling.model.Result;

import com.google.gson.Gson;

import objectmodelling.ObjectmodellingPackage;

/**
 * Servlet implementation class Validation2
 */
@WebServlet(description = "Validation2", urlPatterns = { "/Validation2" })
public class Validation2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validation2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected java.net.URI getFileURI(String fileName) throws URISyntaxException {
		String path = "";
		String temp = Validation2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		for (int i = 0; i < Validation2.class.getName().split("\\.").length; i++) {
			path = path + "../";
		}
		path = path + fileName;
		java.net.URL url = Validation2.class.getResource(path);
		java.net.URI binUri = url.toURI();
		java.net.URI uri = null;

		if (binUri.toString().indexOf("bin") > -1) {
			uri = new java.net.URI(binUri.toString().replaceAll("bin", "src"));
		} else {
			uri = binUri;
		}

		return uri;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			// Get json string
			StringBuilder stringBuilder = new StringBuilder();
			String result;
			while ((result = request.getReader().readLine()) != null) {
				stringBuilder.append(result);
			}
			String json = stringBuilder.toString();

			// convert json from client to pojo
			Gson gson = new Gson();
			Model model = gson.fromJson(json, Model.class);

			//// -------------------------------------------------------------------------------------------

			//
			if (model.graph.edges != null) {
				for (Edge edge : model.graph.edges) {
					for (int i = 0; i < model.graph.nodes.size(); i++) {
						Node node = model.graph.nodes.get(i);
						if (edge.source != null && edge.source.ID != null && edge.source.ID.equals(node.ID)) {
							RefNode refNode = new RefNode();
							refNode.$ref = "//@nodes." + i;
							edge.source = refNode;
						}
						if (edge.target != null && edge.target.ID != null && edge.target.ID.equals(node.ID)) {
							RefNode refNode = new RefNode();
							refNode.$ref = "//@nodes." + i;
							edge.target = refNode;
						}
					}
				}
			}
			String graphOnlyJsonString = gson.toJson(model.graph);

			//Put Modelling Package or EPackage Dynamically
			String packageName = model.graph.eClass.split("#")[0];
			String fullClassName = packageName + "." 
					+ packageName.substring(0, 1).toUpperCase() 
					+ packageName.substring(1, packageName.length())
					+ "Package";
			
			ClassLoader classLoader = Validation2.class.getClassLoader();
			Class modellingPackage =  classLoader.loadClass(fullClassName);
			Object eInstance = modellingPackage.getField("eINSTANCE").get(modellingPackage);
			Method method = eInstance.getClass().getMethod("getNsURI", new Class[]{});
			
			ResourceSet res = new ResourceSetImpl();
			res.getPackageRegistry().put(method.invoke(eInstance, new Object[]{}).toString(), eInstance);
			//res.getPackageRegistry().put(ObjectmodellingPackage.eINSTANCE.getNsURI(), ObjectmodellingPackage.eINSTANCE);
			res.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new JsonResourceFactory());

			Resource r = res.createResource(URI.createURI("file:///D:/MyJson2.json"));
			r.load(new ByteArrayInputStream(graphOnlyJsonString.getBytes()), null);
			r.save(null);
			// EList<EObject> list = r.getContents();

			///// --------------------------------------------------------------------------------------------

			// Load EVL module
			IEvlModule module = new EvlModule();
			String source = "";
			if (model.mode.equals("PRODUCTION")) {
				source = "../production/game/" + model.level + "/objectives.evl";
			} else {
				source = "../development/game/" + model.level + "/objectives.evl";
			}
			java.net.URI binUri = getFileURI(source);
			module.parse(binUri);

			// create in memory Emf Model and add the model to Validation EVL
			InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel(r);
			inMemoryEmfModel.setName(packageName);
			module.getContext().getModelRepository().addModel(inMemoryEmfModel);

			// excute the module
			module.execute();

			// create result Node Node for json
			Result validationResult = new Result();

			// do the validation
			List<UnsatisfiedConstraint> unsatisfiedConstraints = module.getContext().getUnsatisfiedConstraints();
			if (unsatisfiedConstraints.size() > 0) {
				for (UnsatisfiedConstraint unsatisfied : unsatisfiedConstraints) {
					Objective objective = new Objective();
					objective.name = unsatisfied.getConstraint().getName();
					objective.isCompleted = false;
					objective.message = unsatisfied.getMessage();
					validationResult.objectives.add(objective);
				}
				validationResult.isLevelCompleted = false;
			} else {
				validationResult.isLevelCompleted = true;
			}

			// cleaning the module
			module.getContext().getModelRepository().dispose();

			// convert Node to json
			String jsonString = "";
			jsonString = gson.toJson(validationResult);

			// returning the result
			if (jsonString != null && jsonString.length() > 0) {
				response.setContentType("application/json");
				response.getWriter().append(jsonString);
				response.getWriter().flush();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
