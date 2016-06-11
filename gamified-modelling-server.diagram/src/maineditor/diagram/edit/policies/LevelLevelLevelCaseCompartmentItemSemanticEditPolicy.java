/*
* 
*/
package maineditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import maineditor.diagram.edit.commands.CaseCreateCommand;
import maineditor.diagram.providers.MaineditorElementTypes;

/**
 * @generated
 */
public class LevelLevelLevelCaseCompartmentItemSemanticEditPolicy extends MaineditorBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelLevelLevelCaseCompartmentItemSemanticEditPolicy() {
		super(MaineditorElementTypes.Level_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MaineditorElementTypes.Case_3002 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
