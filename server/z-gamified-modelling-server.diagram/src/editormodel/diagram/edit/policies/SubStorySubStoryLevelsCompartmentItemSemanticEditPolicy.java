/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import editormodel.diagram.edit.commands.LevelCreateCommand;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class SubStorySubStoryLevelsCompartmentItemSemanticEditPolicy extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SubStorySubStoryLevelsCompartmentItemSemanticEditPolicy() {
		super(EditormodelElementTypes.SubStory_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EditormodelElementTypes.Level_3002 == req.getElementType()) {
			return getGEFWrapper(new LevelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
