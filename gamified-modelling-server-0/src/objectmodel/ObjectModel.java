/**
 */
package objectmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objectmodel.ObjectModel#getObjects <em>Objects</em>}</li>
 *   <li>{@link objectmodel.ObjectModel#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see objectmodel.ObjectmodelPackage#getObjectModel()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface ObjectModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link objectmodel.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see objectmodel.ObjectmodelPackage#getObjectModel_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<objectmodel.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link objectmodel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see objectmodel.ObjectmodelPackage#getObjectModel_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // ObjectModel
