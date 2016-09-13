/*
* 
*/
package editormodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import editormodel.diagram.edit.commands.DraggableItemCreateCommand;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class LevelCaseLevelCaseDraggableItemsCompartmentItemSemanticEditPolicy
		extends EditormodelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LevelCaseLevelCaseDraggableItemsCompartmentItemSemanticEditPolicy() {
		super(EditormodelElementTypes.LevelCase_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EditormodelElementTypes.DraggableItem_3005 == req.getElementType()) {
			return getGEFWrapper(new DraggableItemCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
