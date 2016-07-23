/*
* 
*/
package editormodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import editormodel.diagram.part.EditormodelVisualIDRegistry;

/**
 * @generated
 */
public class EditormodelNavigatorSorter extends ViewerSorter {

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
		if (element instanceof EditormodelNavigatorItem) {
			EditormodelNavigatorItem item = (EditormodelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return EditormodelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
