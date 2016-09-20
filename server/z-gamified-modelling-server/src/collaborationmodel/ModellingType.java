/**
 */
package collaborationmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collaborationmodel.ModellingType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see collaborationmodel.CollaborationmodelPackage#getModellingType()
 * @model
 * @generated
 */
public interface ModellingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"CollaborationModel"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see collaborationmodel.CollaborationmodelPackage#getModellingType_Name()
	 * @model default="CollaborationModel"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link collaborationmodel.ModellingType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModellingType
