/**
 */
package classmodel.impl;

import classmodel.*;

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
public class ClassmodelFactoryImpl extends EFactoryImpl implements ClassmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassmodelFactory init() {
		try {
			ClassmodelFactory theClassmodelFactory = (ClassmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ClassmodelPackage.eNS_URI);
			if (theClassmodelFactory != null) {
				return theClassmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassmodelFactoryImpl() {
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
			case ClassmodelPackage.MODELLING_TYPE: return createModellingType();
			case ClassmodelPackage.CLASS_MODEL: return createClassModel();
			case ClassmodelPackage.CLASS_ELEMENT: return createClassElement();
			case ClassmodelPackage.RELATIONSHIP_ELEMENT: return createRelationshipElement();
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
	public ClassModel createClassModel() {
		ClassModelImpl classModel = new ClassModelImpl();
		return classModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElement createClassElement() {
		ClassElementImpl classElement = new ClassElementImpl();
		return classElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipElement createRelationshipElement() {
		RelationshipElementImpl relationshipElement = new RelationshipElementImpl();
		return relationshipElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassmodelPackage getClassmodelPackage() {
		return (ClassmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassmodelPackage getPackage() {
		return ClassmodelPackage.eINSTANCE;
	}

} //ClassmodelFactoryImpl
