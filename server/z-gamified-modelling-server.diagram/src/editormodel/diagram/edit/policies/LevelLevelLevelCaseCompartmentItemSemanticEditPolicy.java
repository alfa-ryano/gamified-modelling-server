/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import editormodel.diagram.edit.commands.CaseCreateCommand;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class LevelLevelLevelCaseCompartmentItemSemanticEditPolicy extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelLevelCaseCompartmentItemSemanticEditPolicy() {
		super(EditormodelElementTypes.Level_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EditormodelElementTypes.Case_3002 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
