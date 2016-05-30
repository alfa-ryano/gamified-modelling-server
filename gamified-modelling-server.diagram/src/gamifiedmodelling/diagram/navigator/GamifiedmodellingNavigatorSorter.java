/*
* 
*/
package gamifiedmodelling.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry;

/**
 * @generated
 */
public class GamifiedmodellingNavigatorSorter extends ViewerSorter {

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
		if (element instanceof GamifiedmodellingNavigatorItem) {
			GamifiedmodellingNavigatorItem item = (GamifiedmodellingNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return GamifiedmodellingVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
