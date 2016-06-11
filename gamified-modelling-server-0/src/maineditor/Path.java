/**
 */
package maineditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maineditor.Path#getPrevLevel <em>Prev Level</em>}</li>
 *   <li>{@link maineditor.Path#getNextLevel <em>Next Level</em>}</li>
 * </ul>
 *
 * @see maineditor.MaineditorPackage#getPath()
 * @model annotation="gmf.link source='prevLevel' target='nextLevel'"
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Level</em>' reference.
	 * @see #setPrevLevel(Level)
	 * @see maineditor.MaineditorPackage#getPath_PrevLevel()
	 * @model
	 * @generated
	 */
	Level getPrevLevel();

	/**
	 * Sets the value of the '{@link maineditor.Path#getPrevLevel <em>Prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Level</em>' reference.
	 * @see #getPrevLevel()
	 * @generated
	 */
	void setPrevLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Next Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Level</em>' reference.
	 * @see #setNextLevel(Level)
	 * @see maineditor.MaineditorPackage#getPath_NextLevel()
	 * @model
	 * @generated
	 */
	Level getNextLevel();

	/**
	 * Sets the value of the '{@link maineditor.Path#getNextLevel <em>Next Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Level</em>' reference.
	 * @see #getNextLevel()
	 * @generated
	 */
	void setNextLevel(Level value);

} // Path
