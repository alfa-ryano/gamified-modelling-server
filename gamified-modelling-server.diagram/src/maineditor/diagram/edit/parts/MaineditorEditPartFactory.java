/*
 * 
 */
package maineditor.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import maineditor.diagram.part.MaineditorVisualIDRegistry;

/**
 * @generated
 */
public class MaineditorEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MaineditorVisualIDRegistry.getVisualID(view)) {

			case GameEditPart.VISUAL_ID:
				return new GameEditPart(view);

			case LevelEditPart.VISUAL_ID:
				return new LevelEditPart(view);

			case LevelNameEditPart.VISUAL_ID:
				return new LevelNameEditPart(view);

			case ObjectiveEditPart.VISUAL_ID:
				return new ObjectiveEditPart(view);

			case ObjectiveNameEditPart.VISUAL_ID:
				return new ObjectiveNameEditPart(view);

			case CaseEditPart.VISUAL_ID:
				return new CaseEditPart(view);

			case CaseNameEditPart.VISUAL_ID:
				return new CaseNameEditPart(view);

			case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
				return new LevelLevelObjectivesCompartmentEditPart(view);

			case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
				return new LevelLevelLevelCaseCompartmentEditPart(view);

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
