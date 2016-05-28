/**
 */
package gamifiedmodelling.impl;

import gamifiedmodelling.GamifiedmodellingPackage;
import gamifiedmodelling.Objective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamifiedmodelling.impl.ObjectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link gamifiedmodelling.impl.ObjectiveImpl#getEvlName <em>Evl Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveImpl extends EObjectImpl implements Objective {
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
	 * The default value of the '{@link #getEvlName() <em>Evl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvlName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvlName() <em>Evl Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvlName()
	 * @generated
	 * @ordered
	 */
	protected String evlName = EVL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamifiedmodellingPackage.Literals.OBJECTIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingPackage.OBJECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvlName() {
		return evlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvlName(String newEvlName) {
		String oldEvlName = evlName;
		evlName = newEvlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamifiedmodellingPackage.OBJECTIVE__EVL_NAME, oldEvlName, evlName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamifiedmodellingPackage.OBJECTIVE__NAME:
				return getName();
			case GamifiedmodellingPackage.OBJECTIVE__EVL_NAME:
				return getEvlName();
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
			case GamifiedmodellingPackage.OBJECTIVE__NAME:
				setName((String)newValue);
				return;
			case GamifiedmodellingPackage.OBJECTIVE__EVL_NAME:
				setEvlName((String)newValue);
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
			case GamifiedmodellingPackage.OBJECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GamifiedmodellingPackage.OBJECTIVE__EVL_NAME:
				setEvlName(EVL_NAME_EDEFAULT);
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
			case GamifiedmodellingPackage.OBJECTIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GamifiedmodellingPackage.OBJECTIVE__EVL_NAME:
				return EVL_NAME_EDEFAULT == null ? evlName != null : !EVL_NAME_EDEFAULT.equals(evlName);
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
		result.append(", evlName: ");
		result.append(evlName);
		result.append(')');
		return result.toString();
	}

} //ObjectiveImpl
