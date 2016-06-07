/*
 * 
 */
package gamifiedmodelling.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import gamifiedmodelling.diagram.providers.GamifiedmodellingElementTypes;
import gamifiedmodelling.diagram.providers.GamifiedmodellingModelingAssistantProvider;

/**
 * @generated
 */
public class GamifiedmodellingModelingAssistantProviderOfGameEditPart
		extends GamifiedmodellingModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(GamifiedmodellingElementTypes.Level_2001);
		return types;
	}

}
