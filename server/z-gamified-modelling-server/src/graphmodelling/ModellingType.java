/**
 */
package graphmodelling;

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
 *   <li>{@link graphmodelling.ModellingType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see graphmodelling.GraphmodellingPackage#getModellingType()
 * @model
 * @generated
 */
public interface ModellingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Graph"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graphmodelling.GraphmodellingPackage#getModellingType_Name()
	 * @model default="Graph"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graphmodelling.ModellingType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModellingType
