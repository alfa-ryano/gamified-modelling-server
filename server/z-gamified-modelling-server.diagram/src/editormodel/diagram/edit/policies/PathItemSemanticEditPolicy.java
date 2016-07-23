/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class PathItemSemanticEditPolicy extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PathItemSemanticEditPolicy() {
		super(EditormodelElementTypes.Path_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
