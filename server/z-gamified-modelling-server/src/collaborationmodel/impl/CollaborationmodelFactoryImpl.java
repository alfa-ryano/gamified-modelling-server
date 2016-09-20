/**
 */
package collaborationmodel.impl;

import collaborationmodel.*;

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
public class CollaborationmodelFactoryImpl extends EFactoryImpl implements CollaborationmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollaborationmodelFactory init() {
		try {
			CollaborationmodelFactory theCollaborationmodelFactory = (CollaborationmodelFactory)EPackage.Registry.INSTANCE.getEFactory(CollaborationmodelPackage.eNS_URI);
			if (theCollaborationmodelFactory != null) {
				return theCollaborationmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollaborationmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationmodelFactoryImpl() {
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
			case CollaborationmodelPackage.MODELLING_TYPE: return createModellingType();
			case CollaborationmodelPackage.COLLABORATION_MODELLING: return createCollaborationModelling();
			case CollaborationmodelPackage.ACTOR_ELEMENT: return createActorElement();
			case CollaborationmodelPackage.OBJECT_ELEMENT: return createObjectElement();
			case CollaborationmodelPackage.MESSAGE_ELEMENT: return createMessageElement();
			case CollaborationmodelPackage.LINK_ELEMENT: return createLinkElement();
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
	public CollaborationModel createCollaborationModelling() {
		CollaborationModellingImpl collaborationModelling = new CollaborationModellingImpl();
		return collaborationModelling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorElement createActorElement() {
		ActorElementImpl actorElement = new ActorElementImpl();
		return actorElement;
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
	public MessageElement createMessageElement() {
		MessageElementImpl messageElement = new MessageElementImpl();
		return messageElement;
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
	public CollaborationmodelPackage getCollaborationmodelPackage() {
		return (CollaborationmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollaborationmodelPackage getPackage() {
		return CollaborationmodelPackage.eINSTANCE;
	}

} //CollaborationmodelFactoryImpl
