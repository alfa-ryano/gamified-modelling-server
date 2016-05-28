/**
 */
package gamifiedmodelling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodelling.Objective#getName <em>Name</em>}</li>
 *   <li>{@link gamifiedmodelling.Objective#getEvlName <em>Evl Name</em>}</li>
 * </ul>
 *
 * @see gamifiedmodelling.GamifiedmodellingPackage#getObjective()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Objective extends EObject {
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
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getObjective_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Objective#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evl Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evl Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evl Name</em>' attribute.
	 * @see #setEvlName(String)
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getObjective_EvlName()
	 * @model
	 * @generated
	 */
	String getEvlName();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Objective#getEvlName <em>Evl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evl Name</em>' attribute.
	 * @see #getEvlName()
	 * @generated
	 */
	void setEvlName(String value);

} // Objective
