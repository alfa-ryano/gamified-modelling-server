/*
* 
*/
package maineditor.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import maineditor.diagram.part.MaineditorVisualIDRegistry;

/**
 * @generated
 */
public class MaineditorNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof MaineditorNavigatorItem) {
			MaineditorNavigatorItem item = (MaineditorNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MaineditorVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
