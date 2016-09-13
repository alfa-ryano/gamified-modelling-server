/*
 * 
 */
package editormodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import editormodel.diagram.providers.EditormodelElementTypes;
import editormodel.diagram.providers.EditormodelModelingAssistantProvider;

/**
 * @generated
 */
public class EditormodelModelingAssistantProviderOfLevelCaseEditPart extends EditormodelModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EditormodelElementTypes.DraggableItem_3005);
		return types;
	}

}
