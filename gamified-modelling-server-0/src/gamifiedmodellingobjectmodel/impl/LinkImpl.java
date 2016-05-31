/**
 */
package gamifiedmodellingobjectmodel.impl;

import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage;
import gamifiedmodellingobjectmodel.Link;

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
 *   <li>{@link gamifiedmodellingobjectmodel.impl.LinkImpl#getFromObject <em>From Object</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.LinkImpl#getToObject <em>To Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
	/**
	 * The cached value of the '{@link #getFromObject() <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromObject()
	 * @generated
	 * @ordered
	 */
	protected gamifiedmodellingobjectmodel.Object fromObject;

	/**
	 * The cached value of the '{@link #getToObject() <em>To Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToObject()
	 * @generated
	 * @ordered
	 */
	protected gamifiedmodellingobjectmodel.Object toObject;

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
		return GamifiedmodellingobjectmodelPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gamifiedmodellingobjectmodel.Object getFromObject() {
		if (fromObject != null && fromObject.eIsProxy()) {
			InternalEObject oldFromObject = (InternalEObject)fromObject;
			fromObject = (gamifiedmodellingobjectmodel.Object)eResolveProxy(oldFromObject);
			if (fromObject != oldFromObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamifiedmodellingobjectmodelPackage.LINK__FROM_OBJECT, oldFromObject, fromObject));
			}
		}
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gamifiedmodellingobjectmodel.Object basicGetFromObject() {
		return fromObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromObject(gamifiedmodellingobjectmodel.Object newFromObject) {
		gamifiedmodellingobjectmodel.Object oldFromObject = fromObject;
		fromObject = newFromObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingobjectmodelPackage.LINK__FROM_OBJECT, oldFromObject, fromObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gamifiedmodellingobjectmodel.Object getToObject() {
		if (toObject != null && toObject.eIsProxy()) {
			InternalEObject oldToObject = (InternalEObject)toObject;
			toObject = (gamifiedmodellingobjectmodel.Object)eResolveProxy(oldToObject);
			if (toObject != oldToObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamifiedmodellingobjectmodelPackage.LINK__TO_OBJECT, oldToObject, toObject));
			}
		}
		return toObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gamifiedmodellingobjectmodel.Object basicGetToObject() {
		return toObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToObject(gamifiedmodellingobjectmodel.Object newToObject) {
		gamifiedmodellingobjectmodel.Object oldToObject = toObject;
		toObject = newToObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingobjectmodelPackage.LINK__TO_OBJECT, oldToObject, toObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamifiedmodellingobjectmodelPackage.LINK__FROM_OBJECT:
				if (resolve) return getFromObject();
				return basicGetFromObject();
			case GamifiedmodellingobjectmodelPackage.LINK__TO_OBJECT:
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
			case GamifiedmodellingobjectmodelPackage.LINK__FROM_OBJECT:
				setFromObject((gamifiedmodellingobjectmodel.Object)newValue);
				return;
			case GamifiedmodellingobjectmodelPackage.LINK__TO_OBJECT:
				setToObject((gamifiedmodellingobjectmodel.Object)newValue);
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
			case GamifiedmodellingobjectmodelPackage.LINK__FROM_OBJECT:
				setFromObject((gamifiedmodellingobjectmodel.Object)null);
				return;
			case GamifiedmodellingobjectmodelPackage.LINK__TO_OBJECT:
				setToObject((gamifiedmodellingobjectmodel.Object)null);
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
			case GamifiedmodellingobjectmodelPackage.LINK__FROM_OBJECT:
				return fromObject != null;
			case GamifiedmodellingobjectmodelPackage.LINK__TO_OBJECT:
				return toObject != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
