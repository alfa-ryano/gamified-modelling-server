/**
 */
package gamifiedmodellingobjectmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodellingobjectmodel.Link#getIdentity <em>Identity</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.Link#getFromObject <em>From Object</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.Link#getToObject <em>To Object</em>}</li>
 * </ul>
 *
 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getLink()
 * @model annotation="gmf.link source='fromObject' target='toObject'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getLink_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link gamifiedmodellingobjectmodel.Link#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

	/**
	 * Returns the value of the '<em><b>From Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Object</em>' reference.
	 * @see #setFromObject(gamifiedmodellingobjectmodel.Object)
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getLink_FromObject()
	 * @model
	 * @generated
	 */
	gamifiedmodellingobjectmodel.Object getFromObject();

	/**
	 * Sets the value of the '{@link gamifiedmodellingobjectmodel.Link#getFromObject <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Object</em>' reference.
	 * @see #getFromObject()
	 * @generated
	 */
	void setFromObject(gamifiedmodellingobjectmodel.Object value);

	/**
	 * Returns the value of the '<em><b>To Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Object</em>' reference.
	 * @see #setToObject(gamifiedmodellingobjectmodel.Object)
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getLink_ToObject()
	 * @model
	 * @generated
	 */
	gamifiedmodellingobjectmodel.Object getToObject();

	/**
	 * Sets the value of the '{@link gamifiedmodellingobjectmodel.Link#getToObject <em>To Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Object</em>' reference.
	 * @see #getToObject()
	 * @generated
	 */
	void setToObject(gamifiedmodellingobjectmodel.Object value);

} // Link
