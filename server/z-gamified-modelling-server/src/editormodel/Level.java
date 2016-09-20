/**
 */
package editormodel;

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
 *   <li>{@link editormodel.Level#getName <em>Name</em>}</li>
 *   <li>{@link editormodel.Level#getDescription <em>Description</em>}</li>
 *   <li>{@link editormodel.Level#getModelType <em>Model Type</em>}</li>
 *   <li>{@link editormodel.Level#isIsSequel <em>Is Sequel</em>}</li>
 *   <li>{@link editormodel.Level#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link editormodel.Level#getLevelCase <em>Level Case</em>}</li>
 *   <li>{@link editormodel.Level#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see editormodel.EditormodelPackage#getLevel()
 * @model annotation="gmf.node label='description'"
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
	 * @see editormodel.EditormodelPackage#getLevel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link editormodel.Level#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see editormodel.EditormodelPackage#getLevel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link editormodel.Level#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link editormodel.MODELTYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see editormodel.MODELTYPE
	 * @see #setModelType(MODELTYPE)
	 * @see editormodel.EditormodelPackage#getLevel_ModelType()
	 * @model
	 * @generated
	 */
	MODELTYPE getModelType();

	/**
	 * Sets the value of the '{@link editormodel.Level#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see editormodel.MODELTYPE
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(MODELTYPE value);

	/**
	 * Returns the value of the '<em><b>Is Sequel</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sequel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sequel</em>' attribute.
	 * @see #setIsSequel(boolean)
	 * @see editormodel.EditormodelPackage#getLevel_IsSequel()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsSequel();

	/**
	 * Sets the value of the '{@link editormodel.Level#isIsSequel <em>Is Sequel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sequel</em>' attribute.
	 * @see #isIsSequel()
	 * @generated
	 */
	void setIsSequel(boolean value);

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link editormodel.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see editormodel.EditormodelPackage#getLevel_Objectives()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
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
	 * @see #setLevelCase(LevelCase)
	 * @see editormodel.EditormodelPackage#getLevel_LevelCase()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	LevelCase getLevelCase();

	/**
	 * Sets the value of the '{@link editormodel.Level#getLevelCase <em>Level Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Case</em>' containment reference.
	 * @see #getLevelCase()
	 * @generated
	 */
	void setLevelCase(LevelCase value);

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
	 * @see editormodel.EditormodelPackage#getLevel_Path()
	 * @model containment="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link editormodel.Level#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // Level
