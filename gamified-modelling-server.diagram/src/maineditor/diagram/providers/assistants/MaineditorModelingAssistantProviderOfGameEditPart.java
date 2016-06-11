/*
 * 
 */
package maineditor.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import maineditor.diagram.providers.MaineditorElementTypes;
import maineditor.diagram.providers.MaineditorModelingAssistantProvider;

/**
 * @generated
 */
public class MaineditorModelingAssistantProviderOfGameEditPart extends MaineditorModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MaineditorElementTypes.Level_2001);
		return types;
	}

}
