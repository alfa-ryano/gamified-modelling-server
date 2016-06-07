/*
* 
*/
package gamifiedmodelling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import gamifiedmodelling.diagram.providers.GamifiedmodellingElementTypes;

/**
 * @generated
 */
public class PathItemSemanticEditPolicy extends GamifiedmodellingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PathItemSemanticEditPolicy() {
		super(GamifiedmodellingElementTypes.Path_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
