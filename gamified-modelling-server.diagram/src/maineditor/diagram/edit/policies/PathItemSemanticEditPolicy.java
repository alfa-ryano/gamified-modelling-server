/*
* 
*/
package maineditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import maineditor.diagram.providers.MaineditorElementTypes;

/**
 * @generated
 */
public class PathItemSemanticEditPolicy extends MaineditorBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PathItemSemanticEditPolicy() {
		super(MaineditorElementTypes.Path_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
