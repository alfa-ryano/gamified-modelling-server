/*
 * 
 */
package maineditor.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import maineditor.diagram.edit.parts.GameEditPart;
import maineditor.diagram.edit.parts.MaineditorEditPartFactory;
import maineditor.diagram.part.MaineditorVisualIDRegistry;

/**
 * @generated
 */
public class MaineditorEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MaineditorEditPartProvider() {
		super(new MaineditorEditPartFactory(), MaineditorVisualIDRegistry.TYPED_INSTANCE, GameEditPart.MODEL_ID);
	}

}
