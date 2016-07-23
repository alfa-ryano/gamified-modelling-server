/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import editormodel.diagram.edit.commands.ObjectiveCreateCommand;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class LevelLevelObjectivesCompartmentItemSemanticEditPolicy extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelObjectivesCompartmentItemSemanticEditPolicy() {
		super(EditormodelElementTypes.Level_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EditormodelElementTypes.Objective_3001 == req.getElementType()) {
			return getGEFWrapper(new ObjectiveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
