/**
 */
package gamifiedmodelling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodelling.Level#getName <em>Name</em>}</li>
 *   <li>{@link gamifiedmodelling.Level#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link gamifiedmodelling.Level#getLevelCase <em>Level Case</em>}</li>
 *   <li>{@link gamifiedmodelling.Level#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Level extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Level#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link gamifiedmodelling.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel_Objectives()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<Objective> getObjectives();

	/**
	 * Returns the value of the '<em><b>Level Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Case</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Case</em>' containment reference.
	 * @see #setLevelCase(Case)
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel_LevelCase()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	Case getLevelCase();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Level#getLevelCase <em>Level Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Case</em>' containment reference.
	 * @see #getLevelCase()
	 * @generated
	 */
	void setLevelCase(Case value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel_Path()
	 * @model containment="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Level#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // Level
