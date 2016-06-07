/*
 * 
 */
package gamifiedmodelling.diagram.providers;

import gamifiedmodelling.diagram.part.GamifiedmodellingDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GamifiedmodellingDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			GamifiedmodellingDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
