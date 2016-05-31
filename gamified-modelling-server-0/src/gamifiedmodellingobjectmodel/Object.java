/**
 */
package gamifiedmodellingobjectmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodellingobjectmodel.Object#getName <em>Name</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.Object#getIdentity <em>Identity</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.Object#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObject()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Object extends EObject {
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
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gamifiedmodellingobjectmodel.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObject_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link gamifiedmodellingobjectmodel.Object#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference.
	 * @see #setLinks(Link)
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObject_Links()
	 * @model containment="true"
	 * @generated
	 */
	Link getLinks();

	/**
	 * Sets the value of the '{@link gamifiedmodellingobjectmodel.Object#getLinks <em>Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links</em>' containment reference.
	 * @see #getLinks()
	 * @generated
	 */
	void setLinks(Link value);

} // Object
