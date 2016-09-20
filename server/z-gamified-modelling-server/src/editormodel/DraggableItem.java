/**
 */
package editormodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Draggable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editormodel.DraggableItem#getName <em>Name</em>}</li>
 *   <li>{@link editormodel.DraggableItem#getDescription <em>Description</em>}</li>
 *   <li>{@link editormodel.DraggableItem#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see editormodel.EditormodelPackage#getDraggableItem()
 * @model annotation="gmf.node label='description'"
 * @generated
 */
public interface DraggableItem extends EObject {
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
	 * @see editormodel.EditormodelPackage#getDraggableItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link editormodel.DraggableItem#getName <em>Name</em>}' attribute.
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
	 * @see editormodel.EditormodelPackage#getDraggableItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link editormodel.DraggableItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link editormodel.DRAGGABLE_ITEM_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see editormodel.DRAGGABLE_ITEM_TYPE
	 * @see #setType(DRAGGABLE_ITEM_TYPE)
	 * @see editormodel.EditormodelPackage#getDraggableItem_Type()
	 * @model
	 * @generated
	 */
	DRAGGABLE_ITEM_TYPE getType();

	/**
	 * Sets the value of the '{@link editormodel.DraggableItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see editormodel.DRAGGABLE_ITEM_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(DRAGGABLE_ITEM_TYPE value);

} // DraggableItem
