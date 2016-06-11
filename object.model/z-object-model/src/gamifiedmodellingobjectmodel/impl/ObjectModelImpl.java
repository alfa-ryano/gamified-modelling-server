/**
 */
package gamifiedmodellingobjectmodel.impl;

import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage;
import gamifiedmodellingobjectmodel.Link;
import gamifiedmodellingobjectmodel.ObjectModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectModelImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link gamifiedmodellingobjectmodel.impl.ObjectModelImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectModelImpl extends EObjectImpl implements ObjectModel {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<gamifiedmodellingobjectmodel.Object> objects;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamifiedmodellingobjectmodelPackage.Literals.OBJECT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gamifiedmodellingobjectmodel.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<gamifiedmodellingobjectmodel.Object>(gamifiedmodellingobjectmodel.Object.class, this, GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__OBJECTS:
				return getObjects();
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__LINKS:
				return getLinks();
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
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends gamifiedmodellingobjectmodel.Object>)newValue);
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__OBJECTS:
				getObjects().clear();
				return;
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__LINKS:
				getLinks().clear();
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
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__OBJECTS:
				return objects != null && !objects.isEmpty();
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectModelImpl
