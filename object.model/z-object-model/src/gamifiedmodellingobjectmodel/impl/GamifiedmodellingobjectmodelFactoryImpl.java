/**
 */
package gamifiedmodellingobjectmodel.impl;

import gamifiedmodellingobjectmodel.Attribute;
import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelFactory;
import gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage;
import gamifiedmodellingobjectmodel.Link;
import gamifiedmodellingobjectmodel.ObjectModel;

import gamifiedmodellingobjectmodel.Operation;
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
public class GamifiedmodellingobjectmodelFactoryImpl extends EFactoryImpl implements GamifiedmodellingobjectmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GamifiedmodellingobjectmodelFactory init() {
		try {
			GamifiedmodellingobjectmodelFactory theGamifiedmodellingobjectmodelFactory = (GamifiedmodellingobjectmodelFactory)EPackage.Registry.INSTANCE.getEFactory(GamifiedmodellingobjectmodelPackage.eNS_URI);
			if (theGamifiedmodellingobjectmodelFactory != null) {
				return theGamifiedmodellingobjectmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GamifiedmodellingobjectmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamifiedmodellingobjectmodelFactoryImpl() {
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
			case GamifiedmodellingobjectmodelPackage.OBJECT_MODEL: return createObjectModel();
			case GamifiedmodellingobjectmodelPackage.OBJECT: return createObject();
			case GamifiedmodellingobjectmodelPackage.ATTRIBUTE: return createAttribute();
			case GamifiedmodellingobjectmodelPackage.OPERATION: return createOperation();
			case GamifiedmodellingobjectmodelPackage.LINK: return createLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public gamifiedmodellingobjectmodel.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamifiedmodellingobjectmodelPackage getGamifiedmodellingobjectmodelPackage() {
		return (GamifiedmodellingobjectmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamifiedmodellingobjectmodelPackage getPackage() {
		return GamifiedmodellingobjectmodelPackage.eINSTANCE;
	}

} //GamifiedmodellingobjectmodelFactoryImpl
