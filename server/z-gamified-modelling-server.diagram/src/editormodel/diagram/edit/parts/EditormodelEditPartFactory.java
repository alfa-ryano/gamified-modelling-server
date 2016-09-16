/*
 * 
 */
package editormodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import editormodel.diagram.part.EditormodelVisualIDRegistry;

/**
 * @generated
 */
public class EditormodelEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EditormodelVisualIDRegistry.getVisualID(view)) {

			case GameEditPart.VISUAL_ID:
				return new GameEditPart(view);

			case StoryEditPart.VISUAL_ID:
				return new StoryEditPart(view);

			case StoryDescriptionEditPart.VISUAL_ID:
				return new StoryDescriptionEditPart(view);

			case SubStoryEditPart.VISUAL_ID:
				return new SubStoryEditPart(view);

			case SubStoryDescriptionEditPart.VISUAL_ID:
				return new SubStoryDescriptionEditPart(view);

			case LevelEditPart.VISUAL_ID:
				return new LevelEditPart(view);

			case LevelDescriptionEditPart.VISUAL_ID:
				return new LevelDescriptionEditPart(view);

			case ObjectiveEditPart.VISUAL_ID:
				return new ObjectiveEditPart(view);

			case ObjectiveDescriptionEditPart.VISUAL_ID:
				return new ObjectiveDescriptionEditPart(view);

			case LevelCaseEditPart.VISUAL_ID:
				return new LevelCaseEditPart(view);

			case LevelCaseDescriptionEditPart.VISUAL_ID:
				return new LevelCaseDescriptionEditPart(view);

			case DraggableItemEditPart.VISUAL_ID:
				return new DraggableItemEditPart(view);

			case DraggableItemDescriptionEditPart.VISUAL_ID:
				return new DraggableItemDescriptionEditPart(view);

			case StoryStorySubStoriesCompartmentEditPart.VISUAL_ID:
				return new StoryStorySubStoriesCompartmentEditPart(view);

			case SubStorySubStoryLevelsCompartmentEditPart.VISUAL_ID:
				return new SubStorySubStoryLevelsCompartmentEditPart(view);

			case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
				return new LevelLevelObjectivesCompartmentEditPart(view);

			case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
				return new LevelLevelLevelCaseCompartmentEditPart(view);

			case LevelCaseLevelCaseDraggableItemsCompartmentEditPart.VISUAL_ID:
				return new LevelCaseLevelCaseDraggableItemsCompartmentEditPart(view);

			case PathEditPart.VISUAL_ID:
				return new PathEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
