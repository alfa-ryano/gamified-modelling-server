/**
 */
package collaborationmodelling.impl;

import collaborationmodelling.*;

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
public class CollaborationmodellingFactoryImpl extends EFactoryImpl implements CollaborationmodellingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollaborationmodellingFactory init() {
		try {
			CollaborationmodellingFactory theCollaborationmodellingFactory = (CollaborationmodellingFactory)EPackage.Registry.INSTANCE.getEFactory(CollaborationmodellingPackage.eNS_URI);
			if (theCollaborationmodellingFactory != null) {
				return theCollaborationmodellingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollaborationmodellingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationmodellingFactoryImpl() {
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
			case CollaborationmodellingPackage.COLLABORATION_MODELLING: return createCollaborationModelling();
			case CollaborationmodellingPackage.ACTOR_ELEMENT: return createActorElement();
			case CollaborationmodellingPackage.OBJECT_ELEMENT: return createObjectElement();
			case CollaborationmodellingPackage.MESSAGE_ELEMENT: return createMessageElement();
			case CollaborationmodellingPackage.LINK_ELEMENT: return createLinkElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationModelling createCollaborationModelling() {
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
	public CollaborationmodellingPackage getCollaborationmodellingPackage() {
		return (CollaborationmodellingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollaborationmodellingPackage getPackage() {
		return CollaborationmodellingPackage.eINSTANCE;
	}

} //CollaborationmodellingFactoryImpl
