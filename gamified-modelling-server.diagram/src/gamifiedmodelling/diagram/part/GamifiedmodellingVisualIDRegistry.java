/*
* 
*/
package gamifiedmodelling.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import gamifiedmodelling.Game;
import gamifiedmodelling.GamifiedmodellingPackage;
import gamifiedmodelling.diagram.edit.parts.CaseEditPart;
import gamifiedmodelling.diagram.edit.parts.CaseNameEditPart;
import gamifiedmodelling.diagram.edit.parts.GameEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelLevelCaseCompartmentEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelLevelObjectivesCompartmentEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelNameEditPart;
import gamifiedmodelling.diagram.edit.parts.ObjectiveEditPart;
import gamifiedmodelling.diagram.edit.parts.ObjectiveNameEditPart;
import gamifiedmodelling.diagram.edit.parts.PathEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GamifiedmodellingVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "gamified-modelling-server.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GameEditPart.MODEL_ID.equals(view.getType())) {
				return GameEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				GamifiedmodellingDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GamifiedmodellingPackage.eINSTANCE.getGame().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Game) domainElement)) {
			return GameEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry
				.getModelID(containerView);
		if (!GameEditPart.MODEL_ID.equals(containerModelID) && !"gamifiedmodelling".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (GameEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GameEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GameEditPart.VISUAL_ID:
			if (GamifiedmodellingPackage.eINSTANCE.getLevel().isSuperTypeOf(domainElement.eClass())) {
				return LevelEditPart.VISUAL_ID;
			}
			break;
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			if (GamifiedmodellingPackage.eINSTANCE.getObjective().isSuperTypeOf(domainElement.eClass())) {
				return ObjectiveEditPart.VISUAL_ID;
			}
			break;
		case LevelLevelCaseCompartmentEditPart.VISUAL_ID:
			if (GamifiedmodellingPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry
				.getModelID(containerView);
		if (!GameEditPart.MODEL_ID.equals(containerModelID) && !"gamifiedmodelling".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (GameEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GameEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GameEditPart.VISUAL_ID:
			if (LevelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelEditPart.VISUAL_ID:
			if (LevelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LevelLevelObjectivesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LevelLevelCaseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectiveEditPart.VISUAL_ID:
			if (ObjectiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseEditPart.VISUAL_ID:
			if (CaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			if (ObjectiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelLevelCaseCompartmentEditPart.VISUAL_ID:
			if (CaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GamifiedmodellingPackage.eINSTANCE.getPath().isSuperTypeOf(domainElement.eClass())) {
			return PathEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Game element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
		case LevelLevelCaseCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GameEditPart.VISUAL_ID:
			return false;
		case ObjectiveEditPart.VISUAL_ID:
		case CaseEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
