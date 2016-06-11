/*
* 
*/
package maineditor.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import maineditor.Game;
import maineditor.MaineditorPackage;
import maineditor.diagram.edit.parts.CaseEditPart;
import maineditor.diagram.edit.parts.CaseNameEditPart;
import maineditor.diagram.edit.parts.GameEditPart;
import maineditor.diagram.edit.parts.LevelEditPart;
import maineditor.diagram.edit.parts.LevelLevelLevelCaseCompartmentEditPart;
import maineditor.diagram.edit.parts.LevelLevelObjectivesCompartmentEditPart;
import maineditor.diagram.edit.parts.LevelNameEditPart;
import maineditor.diagram.edit.parts.ObjectiveEditPart;
import maineditor.diagram.edit.parts.ObjectiveNameEditPart;
import maineditor.diagram.edit.parts.PathEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MaineditorVisualIDRegistry {

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
		return maineditor.diagram.part.MaineditorVisualIDRegistry.getVisualID(view.getType());
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
				MaineditorDiagramEditorPlugin.getInstance()
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
		if (MaineditorPackage.eINSTANCE.getGame().isSuperTypeOf(domainElement.eClass())
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
		String containerModelID = maineditor.diagram.part.MaineditorVisualIDRegistry.getModelID(containerView);
		if (!GameEditPart.MODEL_ID.equals(containerModelID) && !"maineditor".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (GameEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = maineditor.diagram.part.MaineditorVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GameEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GameEditPart.VISUAL_ID:
			if (MaineditorPackage.eINSTANCE.getLevel().isSuperTypeOf(domainElement.eClass())) {
				return LevelEditPart.VISUAL_ID;
			}
			break;
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			if (MaineditorPackage.eINSTANCE.getObjective().isSuperTypeOf(domainElement.eClass())) {
				return ObjectiveEditPart.VISUAL_ID;
			}
			break;
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
			if (MaineditorPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
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
		String containerModelID = maineditor.diagram.part.MaineditorVisualIDRegistry.getModelID(containerView);
		if (!GameEditPart.MODEL_ID.equals(containerModelID) && !"maineditor".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (GameEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = maineditor.diagram.part.MaineditorVisualIDRegistry.getVisualID(containerView);
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
			if (LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
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
		if (MaineditorPackage.eINSTANCE.getPath().isSuperTypeOf(domainElement.eClass())) {
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
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
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
			return maineditor.diagram.part.MaineditorVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return maineditor.diagram.part.MaineditorVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return maineditor.diagram.part.MaineditorVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return maineditor.diagram.part.MaineditorVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return maineditor.diagram.part.MaineditorVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return maineditor.diagram.part.MaineditorVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
