/**
 */
package editormodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editormodel.Game#getStories <em>Stories</em>}</li>
 * </ul>
 *
 * @see editormodel.EditormodelPackage#getGame()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link editormodel.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see editormodel.EditormodelPackage#getGame_Stories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Story> getStories();

} // Game
