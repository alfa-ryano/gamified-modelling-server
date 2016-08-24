/**
 */
package objectmodelling.impl;

import objectmodelling.*;

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
public class ObjectmodellingFactoryImpl extends EFactoryImpl implements ObjectmodellingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectmodellingFactory init() {
		try {
			ObjectmodellingFactory theObjectmodellingFactory = (ObjectmodellingFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectmodellingPackage.eNS_URI);
			if (theObjectmodellingFactory != null) {
				return theObjectmodellingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectmodellingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmodellingFactoryImpl() {
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
			case ObjectmodellingPackage.MODELLING_TYPE: return createModellingType();
			case ObjectmodellingPackage.OBJECT_MODELLING: return createObjectModelling();
			case ObjectmodellingPackage.OBJECT_ELEMENT: return createObjectElement();
			case ObjectmodellingPackage.LINK_ELEMENT: return createLinkElement();
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
	public ObjectModelling createObjectModelling() {
		ObjectModellingImpl objectModelling = new ObjectModellingImpl();
		return objectModelling;
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
	public ObjectmodellingPackage getObjectmodellingPackage() {
		return (ObjectmodellingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectmodellingPackage getPackage() {
		return ObjectmodellingPackage.eINSTANCE;
	}

} //ObjectmodellingFactoryImpl
