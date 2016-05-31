package org.york.gamified.modelling;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
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
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.york.gamified.modelling.model.Model;
import org.york.gamified.modelling.model.Node;

import com.google.gson.Gson;

import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelFactory;
import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage;
import gamifiedmodellingobjectmodel.ObjectModel;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validation() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected java.net.URI getFileURI(String fileName) throws URISyntaxException {
		String path = "";
		for (int i = 0; i < Epsilon.class.getName().split("\\.").length; i++) {
			path = path + "../";
		}
		path = path + fileName;
		java.net.URL url = Epsilon.class.getResource(path);
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

			StringBuilder stringBuilder = new StringBuilder();
			String result;
			while ((result = request.getReader().readLine()) != null) {
				stringBuilder.append(result);
			}

			String json = stringBuilder.toString();
			System.out.println(json);

			Gson gson = new Gson();
			Model model = gson.fromJson(json, Model.class);

			GamifiedmodellingobjectmodelPackage myPackage = GamifiedmodellingobjectmodelPackage.eINSTANCE;
			GamifiedmodellingobjectmodelFactory factory = GamifiedmodellingobjectmodelFactory.eINSTANCE;
			ObjectModel objectModel = factory.createObjectModel();
			for (Node node : model.nodes) {
				gamifiedmodellingobjectmodel.Object object = factory.createObject();
				object.setIdentity(node.identity);
				object.setName(node.objectName);
				objectModel.getObjects().add(object);
			}

			// create resource set and resource
			ResourceSet resourceSet = new ResourceSetImpl();
			// Register XML resource factory
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
					new XMIResourceFactoryImpl());

			String path = Epsilon.class.getProtectionDomain().getCodeSource().getLocation().getPath() 
					+ "../epsilon/models/ObjectModel.xmi";
			System.out.println(path);

			Resource resource = resourceSet.createResource(URI.createFileURI(path));
			// add the root object to the resource
			resource.getContents().add(objectModel);
			// serialize resource – you can specify also serialization
			// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
			resource.save(null);

			IEolExecutableModule module = new EolModule();
			String source = "epsilon/models/Validation.evl";
			java.net.URI binUri = getFileURI(source);
			module.parse(binUri);

//			EmfModel emfModel = new EmfModel();
//			StringProperties properties = new StringProperties();
//			properties.put(EmfModel.PROPERTY_NAME, "ObjectModel");
//			properties.put(EmfModel.PROPERTY_METAMODEL_URI, getFileURI("epsilon/models/ObjectModel.ecore").toString());
//			properties.put(EmfModel.PROPERTY_MODEL_URI, getFileURI("epsilon/models/ObjectModel.xmi").toString());
//			properties.put(EmfModel.PROPERTY_READONLOAD, true + "");
//			properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, true + "");
//			emfModel.load(properties, (IRelativePathResolver) null);
//
//			module.getContext().getModelRepository().addModel(emfModel);

			
			InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel(resource);
			inMemoryEmfModel.setName("ObjectModel");
			module.getContext().getModelRepository().addModel(inMemoryEmfModel);
			
			// List<Variable> parameters = new ArrayList<Variable>();
			// for (Variable parameter : parameters) {
			// module.getContext().getFrameStack().put(parameter);
			// }
			Object output; 
			output = module.execute();

			module.getContext().getModelRepository().dispose();

			if (json != null && json.length() > 0) {
				//response.setContentType("application/text");
				response.getWriter().append(json);
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
