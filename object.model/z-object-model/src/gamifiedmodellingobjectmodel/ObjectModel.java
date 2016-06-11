/**
 */
package gamifiedmodellingobjectmodel;

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
 *   <li>{@link gamifiedmodellingobjectmodel.ObjectModel#getObjects <em>Objects</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.ObjectModel#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObjectModel()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface ObjectModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link gamifiedmodellingobjectmodel.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObjectModel_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<gamifiedmodellingobjectmodel.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link gamifiedmodellingobjectmodel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage#getObjectModel_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // ObjectModel
