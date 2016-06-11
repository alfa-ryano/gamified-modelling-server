/*
* 
*/
package maineditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import maineditor.diagram.edit.commands.ObjectiveCreateCommand;
import maineditor.diagram.providers.MaineditorElementTypes;

/**
 * @generated
 */
public class LevelLevelObjectivesCompartmentItemSemanticEditPolicy extends MaineditorBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelObjectivesCompartmentItemSemanticEditPolicy() {
		super(MaineditorElementTypes.Level_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MaineditorElementTypes.Objective_3001 == req.getElementType()) {
			return getGEFWrapper(new ObjectiveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
