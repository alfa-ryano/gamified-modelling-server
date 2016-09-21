/**
 */
package objectmodel.impl;

import objectmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectmodelFactoryImpl extends EFactoryImpl implements ObjectmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectmodelFactory init() {
		try {
			ObjectmodelFactory theObjectmodelFactory = (ObjectmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectmodelPackage.eNS_URI);
			if (theObjectmodelFactory != null) {
				return theObjectmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjectmodelPackage.MODELLING_TYPE: return createModellingType();
			case ObjectmodelPackage.OBJECT_MODEL: return createObjectModel();
			case ObjectmodelPackage.OBJECT_ELEMENT: return createObjectElement();
			case ObjectmodelPackage.LINK_ELEMENT: return createLinkElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellingType createModellingType() {
		ModellingTypeImpl modellingType = new ModellingTypeImpl();
		return modellingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModel createObjectModel() {
		ObjectModelImpl objectModel = new ObjectModelImpl();
		return objectModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectElement createObjectElement() {
		ObjectElementImpl objectElement = new ObjectElementImpl();
		return objectElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkElement createLinkElement() {
		LinkElementImpl linkElement = new LinkElementImpl();
		return linkElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmodelPackage getObjectmodelPackage() {
		return (ObjectmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectmodelPackage getPackage() {
		return ObjectmodelPackage.eINSTANCE;
	}

} //ObjectmodelFactoryImpl
