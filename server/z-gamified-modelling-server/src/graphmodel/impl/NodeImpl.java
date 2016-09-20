/**
 */
package graphmodel.impl;

import graphmodel.GraphmodelPackage;
import graphmodel.Node;
import graphmodel.Operation;
import graphmodel.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphmodel.impl.NodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link graphmodel.impl.NodeImpl#getSubNodes <em>Sub Nodes</em>}</li>
 *   <li>{@link graphmodel.impl.NodeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link graphmodel.impl.NodeImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends EntityImpl implements Node {
	/**
	 * The cached value of the '{@link #getParentNode() <em>Parent Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNode()
	 * @generated
	 * @ordered
	 */
	protected Node parentNode;

	/**
	 * The cached value of the '{@link #getSubNodes() <em>Sub Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> subNodes;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphmodelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParentNode() {
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(Node newParentNode, NotificationChain msgs) {
		Node oldParentNode = parentNode;
		parentNode = newParentNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphmodelPackage.NODE__PARENT_NODE, oldParentNode, newParentNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(Node newParentNode) {
		if (newParentNode != parentNode) {
			NotificationChain msgs = null;
			if (parentNode != null)
				msgs = ((InternalEObject)parentNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphmodelPackage.NODE__PARENT_NODE, null, msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphmodelPackage.NODE__PARENT_NODE, null, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphmodelPackage.NODE__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getSubNodes() {
		if (subNodes == null) {
			subNodes = new EObjectContainmentEList<Node>(Node.class, this, GraphmodelPackage.NODE__SUB_NODES);
		}
		return subNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, GraphmodelPackage.NODE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, GraphmodelPackage.NODE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphmodelPackage.NODE__PARENT_NODE:
				return basicSetParentNode(null, msgs);
			case GraphmodelPackage.NODE__SUB_NODES:
				return ((InternalEList<?>)getSubNodes()).basicRemove(otherEnd, msgs);
			case GraphmodelPackage.NODE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case GraphmodelPackage.NODE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphmodelPackage.NODE__PARENT_NODE:
				return getParentNode();
			case GraphmodelPackage.NODE__SUB_NODES:
				return getSubNodes();
			case GraphmodelPackage.NODE__PROPERTIES:
				return getProperties();
			case GraphmodelPackage.NODE__OPERATIONS:
				return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphmodelPackage.NODE__PARENT_NODE:
				setParentNode((Node)newValue);
				return;
			case GraphmodelPackage.NODE__SUB_NODES:
				getSubNodes().clear();
				getSubNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphmodelPackage.NODE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case GraphmodelPackage.NODE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphmodelPackage.NODE__PARENT_NODE:
				setParentNode((Node)null);
				return;
			case GraphmodelPackage.NODE__SUB_NODES:
				getSubNodes().clear();
				return;
			case GraphmodelPackage.NODE__PROPERTIES:
				getProperties().clear();
				return;
			case GraphmodelPackage.NODE__OPERATIONS:
				getOperations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphmodelPackage.NODE__PARENT_NODE:
				return parentNode != null;
			case GraphmodelPackage.NODE__SUB_NODES:
				return subNodes != null && !subNodes.isEmpty();
			case GraphmodelPackage.NODE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case GraphmodelPackage.NODE__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
