/*
* 
*/
package gamifiedmodelling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import gamifiedmodelling.diagram.edit.commands.CaseCreateCommand;
import gamifiedmodelling.diagram.providers.GamifiedmodellingElementTypes;

/**
 * @generated
 */
public class LevelLevelCaseCompartmentItemSemanticEditPolicy extends GamifiedmodellingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelCaseCompartmentItemSemanticEditPolicy() {
		super(GamifiedmodellingElementTypes.Level_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GamifiedmodellingElementTypes.Case_3002 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
