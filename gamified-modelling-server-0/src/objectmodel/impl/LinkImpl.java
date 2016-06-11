/**
 */
package objectmodel.impl;

import objectmodel.Link;
import objectmodel.ObjectmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objectmodel.impl.LinkImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link objectmodel.impl.LinkImpl#getFromObject <em>From Object</em>}</li>
 *   <li>{@link objectmodel.impl.LinkImpl#getToObject <em>To Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
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
	 * The cached value of the '{@link #getFromObject() <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromObject()
	 * @generated
	 * @ordered
	 */
	protected objectmodel.Object fromObject;

	/**
	 * The cached value of the '{@link #getToObject() <em>To Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToObject()
	 * @generated
	 * @ordered
	 */
	protected objectmodel.Object toObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmodelPackage.Literals.LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmodelPackage.LINK__IDENTITY, oldIdentity, identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objectmodel.Object getFromObject() {
		if (fromObject != null && fromObject.eIsProxy()) {
			InternalEObject oldFromObject = (InternalEObject)fromObject;
			fromObject = (objectmodel.Object)eResolveProxy(oldFromObject);
			if (fromObject != oldFromObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmodelPackage.LINK__FROM_OBJECT, oldFromObject, fromObject));
			}
		}
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objectmodel.Object basicGetFromObject() {
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromObject(objectmodel.Object newFromObject) {
		objectmodel.Object oldFromObject = fromObject;
		fromObject = newFromObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmodelPackage.LINK__FROM_OBJECT, oldFromObject, fromObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objectmodel.Object getToObject() {
		if (toObject != null && toObject.eIsProxy()) {
			InternalEObject oldToObject = (InternalEObject)toObject;
			toObject = (objectmodel.Object)eResolveProxy(oldToObject);
			if (toObject != oldToObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectmodelPackage.LINK__TO_OBJECT, oldToObject, toObject));
			}
		}
		return toObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objectmodel.Object basicGetToObject() {
		return toObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToObject(objectmodel.Object newToObject) {
		objectmodel.Object oldToObject = toObject;
		toObject = newToObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectmodelPackage.LINK__TO_OBJECT, oldToObject, toObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectmodelPackage.LINK__IDENTITY:
				return getIdentity();
			case ObjectmodelPackage.LINK__FROM_OBJECT:
				if (resolve) return getFromObject();
				return basicGetFromObject();
			case ObjectmodelPackage.LINK__TO_OBJECT:
				if (resolve) return getToObject();
				return basicGetToObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ObjectmodelPackage.LINK__IDENTITY:
				setIdentity((String)newValue);
				return;
			case ObjectmodelPackage.LINK__FROM_OBJECT:
				setFromObject((objectmodel.Object)newValue);
				return;
			case ObjectmodelPackage.LINK__TO_OBJECT:
				setToObject((objectmodel.Object)newValue);
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
			case ObjectmodelPackage.LINK__IDENTITY:
				setIdentity(IDENTITY_EDEFAULT);
				return;
			case ObjectmodelPackage.LINK__FROM_OBJECT:
				setFromObject((objectmodel.Object)null);
				return;
			case ObjectmodelPackage.LINK__TO_OBJECT:
				setToObject((objectmodel.Object)null);
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
			case ObjectmodelPackage.LINK__IDENTITY:
				return IDENTITY_EDEFAULT == null ? identity != null : !IDENTITY_EDEFAULT.equals(identity);
			case ObjectmodelPackage.LINK__FROM_OBJECT:
				return fromObject != null;
			case ObjectmodelPackage.LINK__TO_OBJECT:
				return toObject != null;
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
		result.append(" (identity: ");
		result.append(identity);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
