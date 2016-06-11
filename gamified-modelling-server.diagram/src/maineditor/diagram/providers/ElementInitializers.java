/*
 * 
 */
package maineditor.diagram.providers;

import maineditor.diagram.part.MaineditorDiagramEditorPlugin;

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
		ElementInitializers cached = MaineditorDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MaineditorDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
