/**
 */
package editormodel.impl;

import editormodel.EditormodelPackage;
import editormodel.Level;
import editormodel.Path;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link editormodel.impl.PathImpl#getPrevLevel <em>Prev Level</em>}</li>
 *   <li>{@link editormodel.impl.PathImpl#getNextLevel <em>Next Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends EObjectImpl implements Path {
	/**
	 * The cached value of the '{@link #getPrevLevel() <em>Prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevLevel()
	 * @generated
	 * @ordered
	 */
	protected Level prevLevel;

	/**
	 * The cached value of the '{@link #getNextLevel() <em>Next Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextLevel()
	 * @generated
	 * @ordered
	 */
	protected Level nextLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditormodelPackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getPrevLevel() {
		if (prevLevel != null && prevLevel.eIsProxy()) {
			InternalEObject oldPrevLevel = (InternalEObject)prevLevel;
			prevLevel = (Level)eResolveProxy(oldPrevLevel);
			if (prevLevel != oldPrevLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditormodelPackage.PATH__PREV_LEVEL, oldPrevLevel, prevLevel));
			}
		}
		return prevLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetPrevLevel() {
		return prevLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevLevel(Level newPrevLevel) {
		Level oldPrevLevel = prevLevel;
		prevLevel = newPrevLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.PATH__PREV_LEVEL, oldPrevLevel, prevLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getNextLevel() {
		if (nextLevel != null && nextLevel.eIsProxy()) {
			InternalEObject oldNextLevel = (InternalEObject)nextLevel;
			nextLevel = (Level)eResolveProxy(oldNextLevel);
			if (nextLevel != oldNextLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditormodelPackage.PATH__NEXT_LEVEL, oldNextLevel, nextLevel));
			}
		}
		return nextLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level basicGetNextLevel() {
		return nextLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextLevel(Level newNextLevel) {
		Level oldNextLevel = nextLevel;
		nextLevel = newNextLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.PATH__NEXT_LEVEL, oldNextLevel, nextLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditormodelPackage.PATH__PREV_LEVEL:
				if (resolve) return getPrevLevel();
				return basicGetPrevLevel();
			case EditormodelPackage.PATH__NEXT_LEVEL:
				if (resolve) return getNextLevel();
				return basicGetNextLevel();
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
			case EditormodelPackage.PATH__PREV_LEVEL:
				setPrevLevel((Level)newValue);
				return;
			case EditormodelPackage.PATH__NEXT_LEVEL:
				setNextLevel((Level)newValue);
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
			case EditormodelPackage.PATH__PREV_LEVEL:
				setPrevLevel((Level)null);
				return;
			case EditormodelPackage.PATH__NEXT_LEVEL:
				setNextLevel((Level)null);
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
			case EditormodelPackage.PATH__PREV_LEVEL:
				return prevLevel != null;
			case EditormodelPackage.PATH__NEXT_LEVEL:
				return nextLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //PathImpl
