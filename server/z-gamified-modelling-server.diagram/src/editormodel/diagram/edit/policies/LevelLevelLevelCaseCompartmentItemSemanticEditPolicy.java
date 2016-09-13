/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import editormodel.diagram.edit.commands.LevelCaseCreateCommand;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class LevelLevelLevelCaseCompartmentItemSemanticEditPolicy extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelLevelCaseCompartmentItemSemanticEditPolicy() {
		super(EditormodelElementTypes.Level_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EditormodelElementTypes.LevelCase_3004 == req.getElementType()) {
			return getGEFWrapper(new LevelCaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
