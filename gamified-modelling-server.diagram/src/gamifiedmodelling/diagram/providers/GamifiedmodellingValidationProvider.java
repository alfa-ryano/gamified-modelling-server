/*
 * 
 */
package gamifiedmodelling.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import gamifiedmodelling.diagram.edit.parts.GameEditPart;
import gamifiedmodelling.diagram.part.GamifiedmodellingDiagramEditorPlugin;
import gamifiedmodelling.diagram.part.GamifiedmodellingVisualIDRegistry;

/**
 * @generated
 */
public class GamifiedmodellingValidationProvider {

	/**
	* @generated
	*/
	private static boolean constraintsActive = false;

	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				GamifiedmodellingDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& GameEditPart.MODEL_ID.equals(GamifiedmodellingVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

}
