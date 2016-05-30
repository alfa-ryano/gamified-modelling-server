/*
* 
*/
package gamifiedmodelling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import gamifiedmodelling.diagram.edit.commands.ObjectiveCreateCommand;
import gamifiedmodelling.diagram.providers.GamifiedmodellingElementTypes;

/**
 * @generated
 */
public class LevelLevelObjectivesCompartmentItemSemanticEditPolicy extends GamifiedmodellingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelObjectivesCompartmentItemSemanticEditPolicy() {
		super(GamifiedmodellingElementTypes.Level_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GamifiedmodellingElementTypes.Objective_3001 == req.getElementType()) {
			return getGEFWrapper(new ObjectiveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
