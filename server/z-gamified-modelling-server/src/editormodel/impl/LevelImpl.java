/**
 */
package editormodel.impl;

import editormodel.EditormodelPackage;
import editormodel.Level;
import editormodel.LevelCase;
import editormodel.MODELTYPE;
import editormodel.Objective;
import editormodel.Path;

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
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link editormodel.impl.LevelImpl#getName <em>Name</em>}</li>
 *   <li>{@link editormodel.impl.LevelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link editormodel.impl.LevelImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link editormodel.impl.LevelImpl#isIsSequel <em>Is Sequel</em>}</li>
 *   <li>{@link editormodel.impl.LevelImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link editormodel.impl.LevelImpl#getLevelCase <em>Level Case</em>}</li>
 *   <li>{@link editormodel.impl.LevelImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelImpl extends EObjectImpl implements Level {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected static final MODELTYPE MODEL_TYPE_EDEFAULT = MODELTYPE.OBJECT;

	/**
	 * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected MODELTYPE modelType = MODEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSequel() <em>Is Sequel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEQUEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSequel() <em>Is Sequel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequel()
	 * @generated
	 * @ordered
	 */
	protected boolean isSequel = IS_SEQUEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> objectives;

	/**
	 * The cached value of the '{@link #getLevelCase() <em>Level Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelCase()
	 * @generated
	 * @ordered
	 */
	protected LevelCase levelCase;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected Path path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditormodelPackage.Literals.LEVEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODELTYPE getModelType() {
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelType(MODELTYPE newModelType) {
		MODELTYPE oldModelType = modelType;
		modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__MODEL_TYPE, oldModelType, modelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSequel() {
		return isSequel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSequel(boolean newIsSequel) {
		boolean oldIsSequel = isSequel;
		isSequel = newIsSequel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__IS_SEQUEL, oldIsSequel, isSequel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectContainmentEList<Objective>(Objective.class, this, EditormodelPackage.LEVEL__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelCase getLevelCase() {
		return levelCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevelCase(LevelCase newLevelCase, NotificationChain msgs) {
		LevelCase oldLevelCase = levelCase;
		levelCase = newLevelCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__LEVEL_CASE, oldLevelCase, newLevelCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelCase(LevelCase newLevelCase) {
		if (newLevelCase != levelCase) {
			NotificationChain msgs = null;
			if (levelCase != null)
				msgs = ((InternalEObject)levelCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditormodelPackage.LEVEL__LEVEL_CASE, null, msgs);
			if (newLevelCase != null)
				msgs = ((InternalEObject)newLevelCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditormodelPackage.LEVEL__LEVEL_CASE, null, msgs);
			msgs = basicSetLevelCase(newLevelCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__LEVEL_CASE, newLevelCase, newLevelCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Path newPath, NotificationChain msgs) {
		Path oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(Path newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditormodelPackage.LEVEL__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditormodelPackage.LEVEL__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditormodelPackage.LEVEL__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EditormodelPackage.LEVEL__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case EditormodelPackage.LEVEL__LEVEL_CASE:
				return basicSetLevelCase(null, msgs);
			case EditormodelPackage.LEVEL__PATH:
				return basicSetPath(null, msgs);
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
			case EditormodelPackage.LEVEL__NAME:
				return getName();
			case EditormodelPackage.LEVEL__DESCRIPTION:
				return getDescription();
			case EditormodelPackage.LEVEL__MODEL_TYPE:
				return getModelType();
			case EditormodelPackage.LEVEL__IS_SEQUEL:
				return isIsSequel();
			case EditormodelPackage.LEVEL__OBJECTIVES:
				return getObjectives();
			case EditormodelPackage.LEVEL__LEVEL_CASE:
				return getLevelCase();
			case EditormodelPackage.LEVEL__PATH:
				return getPath();
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
			case EditormodelPackage.LEVEL__NAME:
				setName((String)newValue);
				return;
			case EditormodelPackage.LEVEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EditormodelPackage.LEVEL__MODEL_TYPE:
				setModelType((MODELTYPE)newValue);
				return;
			case EditormodelPackage.LEVEL__IS_SEQUEL:
				setIsSequel((Boolean)newValue);
				return;
			case EditormodelPackage.LEVEL__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case EditormodelPackage.LEVEL__LEVEL_CASE:
				setLevelCase((LevelCase)newValue);
				return;
			case EditormodelPackage.LEVEL__PATH:
				setPath((Path)newValue);
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
			case EditormodelPackage.LEVEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EditormodelPackage.LEVEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EditormodelPackage.LEVEL__MODEL_TYPE:
				setModelType(MODEL_TYPE_EDEFAULT);
				return;
			case EditormodelPackage.LEVEL__IS_SEQUEL:
				setIsSequel(IS_SEQUEL_EDEFAULT);
				return;
			case EditormodelPackage.LEVEL__OBJECTIVES:
				getObjectives().clear();
				return;
			case EditormodelPackage.LEVEL__LEVEL_CASE:
				setLevelCase((LevelCase)null);
				return;
			case EditormodelPackage.LEVEL__PATH:
				setPath((Path)null);
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
			case EditormodelPackage.LEVEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EditormodelPackage.LEVEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EditormodelPackage.LEVEL__MODEL_TYPE:
				return modelType != MODEL_TYPE_EDEFAULT;
			case EditormodelPackage.LEVEL__IS_SEQUEL:
				return isSequel != IS_SEQUEL_EDEFAULT;
			case EditormodelPackage.LEVEL__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
			case EditormodelPackage.LEVEL__LEVEL_CASE:
				return levelCase != null;
			case EditormodelPackage.LEVEL__PATH:
				return path != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", modelType: ");
		result.append(modelType);
		result.append(", isSequel: ");
		result.append(isSequel);
		result.append(')');
		return result.toString();
	}

} //LevelImpl
