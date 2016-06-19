/**
 */
package gamifiedmodellingobjectmodel.impl;

import gamifiedmodellingobjectmodel.Attribute;
import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage;

import gamifiedmodellingobjectmodel.Operation;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements gamifiedmodellingobjectmodel.Object {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected String identity = IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamifiedmodellingobjectmodelPackage.Literals.OBJECT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingobjectmodelPackage.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(String newIdentity) {
		String oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingobjectmodelPackage.OBJECT__IDENTITY, oldIdentity, identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingobjectmodelPackage.OBJECT__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, GamifiedmodellingobjectmodelPackage.OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, GamifiedmodellingobjectmodelPackage.OBJECT__OPERATIONS);
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
			case GamifiedmodellingobjectmodelPackage.OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case GamifiedmodellingobjectmodelPackage.OBJECT__OPERATIONS:
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
			case GamifiedmodellingobjectmodelPackage.OBJECT__NAME:
				return getName();
			case GamifiedmodellingobjectmodelPackage.OBJECT__IDENTITY:
				return getIdentity();
			case GamifiedmodellingobjectmodelPackage.OBJECT__CLASS_NAME:
				return getClassName();
			case GamifiedmodellingobjectmodelPackage.OBJECT__ATTRIBUTES:
				return getAttributes();
			case GamifiedmodellingobjectmodelPackage.OBJECT__OPERATIONS:
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
			case GamifiedmodellingobjectmodelPackage.OBJECT__NAME:
				setName((String)newValue);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__IDENTITY:
				setIdentity((String)newValue);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__OPERATIONS:
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
			case GamifiedmodellingobjectmodelPackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__IDENTITY:
				setIdentity(IDENTITY_EDEFAULT);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT__OPERATIONS:
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
			case GamifiedmodellingobjectmodelPackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamifiedmodellingobjectmodelPackage.OBJECT__IDENTITY:
				return IDENTITY_EDEFAULT == null ? identity != null : !IDENTITY_EDEFAULT.equals(identity);
			case GamifiedmodellingobjectmodelPackage.OBJECT__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case GamifiedmodellingobjectmodelPackage.OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GamifiedmodellingobjectmodelPackage.OBJECT__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", identity: ");
		result.append(identity);
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
