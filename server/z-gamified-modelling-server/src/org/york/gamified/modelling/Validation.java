package org.york.gamified.modelling;

import java.io.IOException;
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
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.york.gamified.modelling.model.Edge;
import org.york.gamified.modelling.model.Model;
import org.york.gamified.modelling.model.Node;
import org.york.gamified.modelling.model.Objective;
import org.york.gamified.modelling.model.Operation;
import org.york.gamified.modelling.model.Property;
import org.york.gamified.modelling.model.Result;

import com.google.gson.Gson;

import graphmodelling.GraphmodellingFactory;
import graphmodelling.Graph;

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
		for (int i = 0; i < Validation.class.getName().split("\\.").length; i++) {
			path = path + "../";
		}
		path = path + fileName;
		java.net.URL url = Validation.class.getResource(path);
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

			// map pojo to EMF model
			GraphmodellingFactory factory = GraphmodellingFactory.eINSTANCE;
			Graph Graph = factory.createGraph();

			if (model.nodes != null && model.nodes.size() > 0) {
				for (Node node : model.nodes) {
					graphmodelling.Node Node = factory.createNode();
					Node.setID(node.identity);
					Node.setName(node.nodeName);
					Node.setEntityClass(node.className);

					if (node.properties != null) {
						for (Property property : node.properties) {
							graphmodelling.Property Property = factory.createProperty();
							Property.setText(property.text);
							Property.setName(property.name);
							Property.setValue(property.value);
							Property.setType(property.valueType);
							Node.getProperties().add(Property);
						}
					}

					if (node.operations != null) {
						for (Operation operation : node.operations) {
							graphmodelling.Operation operation2 = factory.createOperation();
							operation2.setText(operation.text);
							operation2.setName(operation.name);
							Node.getOperations().add(operation2);
						}
					}

					Graph.getNodes().add(Node);
				}
			}

			if (model.edges != null && model.edges.size() > 0) {
				for (Edge edge : model.edges) {
					graphmodelling.Edge edge2 = factory.createEdge();
					edge2.setID(edge.identity);
					if (Graph.getNodes() != null && Graph.getNodes().size() > 0) {
						for (graphmodelling.Node node : Graph.getNodes()) {
							if (node.getID().equals(edge.sourceIdentity)) {
								edge2.setSource(node);
							}
							if (node.getID().equals(edge.targetIdentity)) {
								edge2.setTarget(node);
							}
						}
					}
					Graph.getEdges().add(edge2);
				}
			}

			// create resource set and resource
			ResourceSet resourceSet = new ResourceSetImpl();
			// Register XML resource factory
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
					new XMIResourceFactoryImpl());

			// save XMI of the model
			String path = "";
			if (model.mode.equals("PRODUCTION")) {
				path = Validation.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../production/game/"
						+ model.level + "/Graph.xmi";
			} else {
				path = Validation.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../development/game/"
						+ model.level + "/Graph.xmi";
			}
			Resource resource = resourceSet.createResource(URI.createFileURI(path));
			resource.getContents().add(Graph);
			resource.save(null);

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
			InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel(resource);
			inMemoryEmfModel.setName("Graph");
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
					objective.objectiveName = unsatisfied.getConstraint().getName();
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
