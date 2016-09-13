/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import editormodel.diagram.edit.commands.SubStoryCreateCommand;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class StoryStorySubStoriesCompartmentItemSemanticEditPolicy extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StoryStorySubStoriesCompartmentItemSemanticEditPolicy() {
		super(EditormodelElementTypes.Story_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EditormodelElementTypes.SubStory_3001 == req.getElementType()) {
			return getGEFWrapper(new SubStoryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
