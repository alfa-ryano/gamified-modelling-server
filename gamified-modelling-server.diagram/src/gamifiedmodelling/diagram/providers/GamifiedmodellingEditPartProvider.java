/*
 * 
 */
package gamifiedmodelling.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import gamifiedmodelling.diagram.edit.parts.GameEditPart;
import gamifiedmodelling.diagram.edit.parts.GamifiedmodellingEditPartFactory;
import gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry;

/**
 * @generated
 */
public class GamifiedmodellingEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public GamifiedmodellingEditPartProvider() {
		super(new GamifiedmodellingEditPartFactory(), GamifiedmodellingVisualIDRegistry.TYPED_INSTANCE,
				GameEditPart.MODEL_ID);
	}

}
