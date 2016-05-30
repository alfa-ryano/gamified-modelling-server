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
 *   <li>{@link gamifiedmodelling.Level#getModelType <em>Model Type</em>}</li>
 *   <li>{@link gamifiedmodelling.Level#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link gamifiedmodelling.Level#getCase <em>Case</em>}</li>
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
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gamifiedmodelling.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see gamifiedmodelling.ModelType
	 * @see #setModelType(ModelType)
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel_ModelType()
	 * @model
	 * @generated
	 */
	ModelType getModelType();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Level#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see gamifiedmodelling.ModelType
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelType value);

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
	 *        annotation="gmf.compartment x=''"
	 * @generated
	 */
	EList<Objective> getObjectives();

	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference.
	 * @see #setCase(Case)
	 * @see gamifiedmodelling.GamifiedmodellingPackage#getLevel_Case()
	 * @model containment="true"
	 *        annotation="gmf.compartment x=''"
	 * @generated
	 */
	Case getCase();

	/**
	 * Sets the value of the '{@link gamifiedmodelling.Level#getCase <em>Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' containment reference.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(Case value);

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
