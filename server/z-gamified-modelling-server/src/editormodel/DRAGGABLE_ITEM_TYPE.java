/**
 */
package editormodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DRAGGABLE ITEM TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see editormodel.EditormodelPackage#getDRAGGABLE_ITEM_TYPE()
 * @model
 * @generated
 */
public enum DRAGGABLE_ITEM_TYPE implements Enumerator {
	/**
	 * The '<em><b>Object Draggable Case Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_DRAGGABLE_CASE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_DRAGGABLE_CASE_ITEM(0, "ObjectDraggableCaseItem", "ObjectDraggableCaseItem"),

	/**
	 * The '<em><b>Class Draggable Case Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_DRAGGABLE_CASE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_DRAGGABLE_CASE_ITEM(1, "ClassDraggableCaseItem", "ClassDraggableCaseItem"),

	/**
	 * The '<em><b>Slot Draggable Case Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLOT_DRAGGABLE_CASE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	SLOT_DRAGGABLE_CASE_ITEM(2, "SlotDraggableCaseItem", "SlotDraggableCaseItem"),

	/**
	 * The '<em><b>Operation Draggable Case Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_DRAGGABLE_CASE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_DRAGGABLE_CASE_ITEM(3, "OperationDraggableCaseItem", "OperationDraggableCaseItem");

	/**
	 * The '<em><b>Object Draggable Case Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Draggable Case Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_DRAGGABLE_CASE_ITEM
	 * @model name="ObjectDraggableCaseItem"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_DRAGGABLE_CASE_ITEM_VALUE = 0;

	/**
	 * The '<em><b>Class Draggable Case Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Class Draggable Case Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_DRAGGABLE_CASE_ITEM
	 * @model name="ClassDraggableCaseItem"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_DRAGGABLE_CASE_ITEM_VALUE = 1;

	/**
	 * The '<em><b>Slot Draggable Case Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slot Draggable Case Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLOT_DRAGGABLE_CASE_ITEM
	 * @model name="SlotDraggableCaseItem"
	 * @generated
	 * @ordered
	 */
	public static final int SLOT_DRAGGABLE_CASE_ITEM_VALUE = 2;

	/**
	 * The '<em><b>Operation Draggable Case Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operation Draggable Case Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_DRAGGABLE_CASE_ITEM
	 * @model name="OperationDraggableCaseItem"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_DRAGGABLE_CASE_ITEM_VALUE = 3;

	/**
	 * An array of all the '<em><b>DRAGGABLE ITEM TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DRAGGABLE_ITEM_TYPE[] VALUES_ARRAY =
		new DRAGGABLE_ITEM_TYPE[] {
			OBJECT_DRAGGABLE_CASE_ITEM,
			CLASS_DRAGGABLE_CASE_ITEM,
			SLOT_DRAGGABLE_CASE_ITEM,
			OPERATION_DRAGGABLE_CASE_ITEM,
		};

	/**
	 * A public read-only list of all the '<em><b>DRAGGABLE ITEM TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DRAGGABLE_ITEM_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DRAGGABLE ITEM TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DRAGGABLE_ITEM_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DRAGGABLE_ITEM_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DRAGGABLE ITEM TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DRAGGABLE_ITEM_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DRAGGABLE_ITEM_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DRAGGABLE ITEM TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DRAGGABLE_ITEM_TYPE get(int value) {
		switch (value) {
			case OBJECT_DRAGGABLE_CASE_ITEM_VALUE: return OBJECT_DRAGGABLE_CASE_ITEM;
			case CLASS_DRAGGABLE_CASE_ITEM_VALUE: return CLASS_DRAGGABLE_CASE_ITEM;
			case SLOT_DRAGGABLE_CASE_ITEM_VALUE: return SLOT_DRAGGABLE_CASE_ITEM;
			case OPERATION_DRAGGABLE_CASE_ITEM_VALUE: return OPERATION_DRAGGABLE_CASE_ITEM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DRAGGABLE_ITEM_TYPE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DRAGGABLE_ITEM_TYPE
