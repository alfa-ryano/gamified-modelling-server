/**
 */
package graphmodelling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphmodelling.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link graphmodelling.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see graphmodelling.GraphmodellingPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends Entity {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link graphmodelling.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see graphmodelling.GraphmodellingPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link graphmodelling.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see graphmodelling.GraphmodellingPackage#getGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // Graph
