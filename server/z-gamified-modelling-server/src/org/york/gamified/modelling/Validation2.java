package org.york.gamified.modelling;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.IEclModule;
import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.york.gamified.modelling.model.Objective;
import org.york.gamified.modelling.model.Result;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
		// String temp =
		// Validation2.class.getProtectionDomain().getCodeSource().getLocation().getPath();
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
			// Model model = gson.fromJson(json, Model.class);
			//
			// ////
			// -------------------------------------------------------------------------------------------
			//
			// //
			// if (model.graph.edges != null) {
			// for (Edge edge : model.graph.edges) {
			// for (int i = 0; i < model.graph.nodes.size(); i++) {
			// Node node = model.graph.nodes.get(i);
			// if (edge.source != null && edge.source.ID != null &&
			// edge.source.ID.equals(node.ID)) {
			// RefNode refNode = new RefNode();
			// refNode.$ref = "//@nodes." + i;
			// edge.source = refNode;
			// }
			// if (edge.target != null && edge.target.ID != null &&
			// edge.target.ID.equals(node.ID)) {
			// RefNode refNode = new RefNode();
			// refNode.$ref = "//@nodes." + i;
			// edge.target = refNode;
			// }
			// }
			// }
			// }
			// String graphOnlyJsonString = gson.toJson(model.graph);

			//// ----------------------------------------------------------------------------
			JsonElement root = new JsonParser().parse(json);
			JsonObject graph = root.getAsJsonObject().get("graph").getAsJsonObject();
			String graphOnlyJsonString = graph.toString();

			//// ---------------------------------------------------------------------------
			// Put Modelling Package or EPackage Dynamically
			String packageName = graph.get("eClass").getAsString().split("#")[0];
			// String packageName = model.graph.eClass.split("#")[0];
			String fullClassName = packageName + "." + packageName.substring(0, 1).toUpperCase()
					+ packageName.substring(1, packageName.length()) + "Package";

			ClassLoader classLoader = Validation2.class.getClassLoader();
			Class modellingPackage = classLoader.loadClass(fullClassName);
			Object eInstance = modellingPackage.getField("eINSTANCE").get(modellingPackage);
			Method method = eInstance.getClass().getMethod("getNsURI", new Class[] {});

			ResourceSet currentResourceSet = new ResourceSetImpl();
			currentResourceSet.getPackageRegistry().put(method.invoke(eInstance, new Object[] {}).toString(), eInstance);
			// res.getPackageRegistry().put(ObjectmodellingPackage.eINSTANCE.getNsURI(),
			// ObjectmodellingPackage.eINSTANCE);
			currentResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new JsonResourceFactory());

			Resource currentResource = currentResourceSet.createResource(URI.createURI("file:///D:/MyJson2.json"));
			currentResource.load(new ByteArrayInputStream(graphOnlyJsonString.getBytes()), null);
			currentResource.save(null);
			// EList<EObject> list = r.getContents();

			///// --------------------------------------------------------------------------------------------

			// Load EVL module
			IEvlModule evlModule = new EvlModule();
			String source = "";
			if (root.getAsJsonObject().get("mode").getAsString().equals("PRODUCTION")) {
				// if (model.mode.equals("PRODUCTION")) {
				source = "../production/game/" + root.getAsJsonObject().get("level").getAsString() + "/objectives.evl";
			} else {
				source = "../development/game/" + root.getAsJsonObject().get("level").getAsString() + "/objectives.evl";
			}
			java.net.URI binUri = getFileURI(source);
			evlModule.parse(binUri);

			// create in memory Emf Model and add the model to Validation EVL
			InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel(currentResource);
			inMemoryEmfModel.setName(packageName);
			evlModule.getContext().getModelRepository().addModel(inMemoryEmfModel);

			// excute the module
			evlModule.execute();

			// create result Node Node for json
			Result validationResult = new Result();

			// do the validation
			List<UnsatisfiedConstraint> unsatisfiedConstraints = evlModule.getContext().getUnsatisfiedConstraints();
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
			evlModule.getContext().getModelRepository().dispose();

			//// -----------------------------------------------
			// Load ECL module
			try {
				String filePath = "";
				String eclFilePath = "";
				String xmiFilePath = "";
				String mode = "";
				String pathToEcl = getServletContext().getRealPath(File.separator);
				String pathToXmi = getServletContext().getRealPath(File.separator);
				if (root.getAsJsonObject().get("mode").getAsString().equals("PRODUCTION")) {
					mode = "production";
				} else {
					mode = "development";
				}

				filePath = "../" + mode + "/game/" + root.getAsJsonObject().get("level").getAsString()
						+ "/objectives.ecl";
				eclFilePath = ("\\" + mode + "\\game\\" + root.getAsJsonObject().get("level").getAsString()
						+ "\\objectives.ecl").replace("\\", File.separator);
				xmiFilePath = ("\\" + mode + "\\game\\" + root.getAsJsonObject().get("level").getAsString()
						+ "\\source.model").replace("\\", File.separator);

				pathToEcl = pathToEcl + eclFilePath;
				File f = new File(pathToEcl);

				if (f.exists() && !f.isDirectory()) {

					//// XMI
					pathToXmi = pathToXmi + xmiFilePath;
					File file = new File(pathToXmi);
					FileInputStream fis = new FileInputStream(file);
					byte[] data = new byte[(int) file.length()];
					fis.read(data);
					fis.close();
					String text = new String(data);

					ResourceSet refResourceSet = new ResourceSetImpl();
					refResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
							new XMIResourceFactoryImpl());
					Resource refResource = refResourceSet.createResource(URI.createURI("file:///D:/test.xmi"));
					refResource.load(new ByteArrayInputStream(text.getBytes()), null);
					refResource.save(null);
					
					InMemoryEmfModel refModel = new InMemoryEmfModel(refResource);
					refModel.setName("source");
					InMemoryEmfModel currentModel = new InMemoryEmfModel(currentResource);
					currentModel.setName("target");
					/// End XMI

					java.net.URI eclBinUri = getFileURI(filePath);
					
					IEclModule eclModule = new EclModule();
					eclModule.parse(eclBinUri);
					eclModule.getContext().getModelRepository().addModel(refModel);
					eclModule.getContext().getModelRepository().addModel(currentModel);
					eclModule.execute();
					List<Match> matchList = eclModule.getContext().getMatchTrace().getMatches();
					System.out.println();
					for (Match match : matchList) {
//						System.out.println(match.getLeft().toString() + " vs " + match.getRight().toString());
//						System.out.println(match.getRule().getBasename());
						System.out.println("######## Result: " + match.isMatching());
						validationResult.isLevelCompleted = validationResult.isLevelCompleted && match.isMatching();
					}
				} 

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			//// ----------------------------------------------

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
