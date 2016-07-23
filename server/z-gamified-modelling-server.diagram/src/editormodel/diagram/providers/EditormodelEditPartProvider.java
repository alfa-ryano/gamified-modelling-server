/*
 * 
 */
package editormodel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import editormodel.diagram.edit.parts.EditormodelEditPartFactory;
import editormodel.diagram.edit.parts.GameEditPart;
import editormodel.diagram.part.EditormodelVisualIDRegistry;

/**
 * @generated
 */
public class EditormodelEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public EditormodelEditPartProvider() {
		super(new EditormodelEditPartFactory(), EditormodelVisualIDRegistry.TYPED_INSTANCE, GameEditPart.MODEL_ID);
	}

}
