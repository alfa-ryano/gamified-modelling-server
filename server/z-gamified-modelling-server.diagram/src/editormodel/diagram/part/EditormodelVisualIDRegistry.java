/*
* 
*/
package editormodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import editormodel.EditormodelPackage;
import editormodel.Game;
import editormodel.diagram.edit.parts.DraggableItemDescriptionEditPart;
import editormodel.diagram.edit.parts.DraggableItemEditPart;
import editormodel.diagram.edit.parts.GameEditPart;
import editormodel.diagram.edit.parts.LevelCaseDescriptionEditPart;
import editormodel.diagram.edit.parts.LevelCaseEditPart;
import editormodel.diagram.edit.parts.LevelCaseLevelCaseDraggableItemsCompartmentEditPart;
import editormodel.diagram.edit.parts.LevelDescriptionEditPart;
import editormodel.diagram.edit.parts.LevelEditPart;
import editormodel.diagram.edit.parts.LevelLevelLevelCaseCompartmentEditPart;
import editormodel.diagram.edit.parts.LevelLevelObjectivesCompartmentEditPart;
import editormodel.diagram.edit.parts.ObjectiveDescriptionEditPart;
import editormodel.diagram.edit.parts.ObjectiveEditPart;
import editormodel.diagram.edit.parts.PathEditPart;
import editormodel.diagram.edit.parts.StoryDescriptionEditPart;
import editormodel.diagram.edit.parts.StoryEditPart;
import editormodel.diagram.edit.parts.StoryStorySubStoriesCompartmentEditPart;
import editormodel.diagram.edit.parts.SubStoryDescriptionEditPart;
import editormodel.diagram.edit.parts.SubStoryEditPart;
import editormodel.diagram.edit.parts.SubStorySubStoryLevelsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EditormodelVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "z-gamified-modelling-server.diagram/debug/visualID"; //$NON-NLS-1$

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
		return editormodel.diagram.part.EditormodelVisualIDRegistry.getVisualID(view.getType());
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
				EditormodelDiagramEditorPlugin.getInstance()
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
		if (EditormodelPackage.eINSTANCE.getGame().isSuperTypeOf(domainElement.eClass())
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
		String containerModelID = editormodel.diagram.part.EditormodelVisualIDRegistry.getModelID(containerView);
		if (!GameEditPart.MODEL_ID.equals(containerModelID) && !"editormodel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (GameEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = editormodel.diagram.part.EditormodelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GameEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GameEditPart.VISUAL_ID:
			if (EditormodelPackage.eINSTANCE.getStory().isSuperTypeOf(domainElement.eClass())) {
				return StoryEditPart.VISUAL_ID;
			}
			break;
		case StoryStorySubStoriesCompartmentEditPart.VISUAL_ID:
			if (EditormodelPackage.eINSTANCE.getSubStory().isSuperTypeOf(domainElement.eClass())) {
				return SubStoryEditPart.VISUAL_ID;
			}
			break;
		case SubStorySubStoryLevelsCompartmentEditPart.VISUAL_ID:
			if (EditormodelPackage.eINSTANCE.getLevel().isSuperTypeOf(domainElement.eClass())) {
				return LevelEditPart.VISUAL_ID;
			}
			break;
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			if (EditormodelPackage.eINSTANCE.getObjective().isSuperTypeOf(domainElement.eClass())) {
				return ObjectiveEditPart.VISUAL_ID;
			}
			break;
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
			if (EditormodelPackage.eINSTANCE.getLevelCase().isSuperTypeOf(domainElement.eClass())) {
				return LevelCaseEditPart.VISUAL_ID;
			}
			break;
		case LevelCaseLevelCaseDraggableItemsCompartmentEditPart.VISUAL_ID:
			if (EditormodelPackage.eINSTANCE.getDraggableItem().isSuperTypeOf(domainElement.eClass())) {
				return DraggableItemEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = editormodel.diagram.part.EditormodelVisualIDRegistry.getModelID(containerView);
		if (!GameEditPart.MODEL_ID.equals(containerModelID) && !"editormodel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (GameEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = editormodel.diagram.part.EditormodelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GameEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GameEditPart.VISUAL_ID:
			if (StoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryEditPart.VISUAL_ID:
			if (StoryDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StoryStorySubStoriesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubStoryEditPart.VISUAL_ID:
			if (SubStoryDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubStorySubStoryLevelsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelEditPart.VISUAL_ID:
			if (LevelDescriptionEditPart.VISUAL_ID == nodeVisualID) {
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
			if (ObjectiveDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelCaseEditPart.VISUAL_ID:
			if (LevelCaseDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LevelCaseLevelCaseDraggableItemsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DraggableItemEditPart.VISUAL_ID:
			if (DraggableItemDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StoryStorySubStoriesCompartmentEditPart.VISUAL_ID:
			if (SubStoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubStorySubStoryLevelsCompartmentEditPart.VISUAL_ID:
			if (LevelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			if (ObjectiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
			if (LevelCaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LevelCaseLevelCaseDraggableItemsCompartmentEditPart.VISUAL_ID:
			if (DraggableItemEditPart.VISUAL_ID == nodeVisualID) {
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
		if (EditormodelPackage.eINSTANCE.getPath().isSuperTypeOf(domainElement.eClass())) {
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
		case StoryStorySubStoriesCompartmentEditPart.VISUAL_ID:
		case SubStorySubStoryLevelsCompartmentEditPart.VISUAL_ID:
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
		case LevelCaseLevelCaseDraggableItemsCompartmentEditPart.VISUAL_ID:
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
		case DraggableItemEditPart.VISUAL_ID:
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
			return editormodel.diagram.part.EditormodelVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return editormodel.diagram.part.EditormodelVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return editormodel.diagram.part.EditormodelVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return editormodel.diagram.part.EditormodelVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return editormodel.diagram.part.EditormodelVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return editormodel.diagram.part.EditormodelVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
