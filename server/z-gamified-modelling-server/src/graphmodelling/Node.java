/**
 */
package graphmodelling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphmodelling.Node#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link graphmodelling.Node#getSubNodes <em>Sub Nodes</em>}</li>
 *   <li>{@link graphmodelling.Node#getProperties <em>Properties</em>}</li>
 *   <li>{@link graphmodelling.Node#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see graphmodelling.GraphmodellingPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' containment reference.
	 * @see #setParentNode(Node)
	 * @see graphmodelling.GraphmodellingPackage#getNode_ParentNode()
	 * @model containment="true"
	 * @generated
	 */
	Node getParentNode();

	/**
	 * Sets the value of the '{@link graphmodelling.Node#getParentNode <em>Parent Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' containment reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(Node value);

	/**
	 * Returns the value of the '<em><b>Sub Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link graphmodelling.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Nodes</em>' containment reference list.
	 * @see graphmodelling.GraphmodellingPackage#getNode_SubNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getSubNodes();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link graphmodelling.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see graphmodelling.GraphmodellingPackage#getNode_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link graphmodelling.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see graphmodelling.GraphmodellingPackage#getNode_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Node
