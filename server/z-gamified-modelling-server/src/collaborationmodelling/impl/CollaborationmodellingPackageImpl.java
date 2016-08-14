/**
 */
package collaborationmodelling.impl;

import collaborationmodelling.ActorElement;
import collaborationmodelling.CollaborationModelling;
import collaborationmodelling.CollaborationmodellingFactory;
import collaborationmodelling.CollaborationmodellingPackage;
import collaborationmodelling.LinkElement;
import collaborationmodelling.MessageElement;
import collaborationmodelling.ObjectElement;

import graphmodelling.GraphmodellingPackage;

import graphmodelling.impl.GraphmodellingPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationmodellingPackageImpl extends EPackageImpl implements CollaborationmodellingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationModellingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see collaborationmodelling.CollaborationmodellingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollaborationmodellingPackageImpl() {
		super(eNS_URI, CollaborationmodellingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CollaborationmodellingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollaborationmodellingPackage init() {
		if (isInited) return (CollaborationmodellingPackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationmodellingPackage.eNS_URI);

		// Obtain or create and register package
		CollaborationmodellingPackageImpl theCollaborationmodellingPackage = (CollaborationmodellingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollaborationmodellingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollaborationmodellingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraphmodellingPackageImpl theGraphmodellingPackage = (GraphmodellingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphmodellingPackage.eNS_URI) instanceof GraphmodellingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphmodellingPackage.eNS_URI) : GraphmodellingPackage.eINSTANCE);

		// Create package meta-data objects
		theCollaborationmodellingPackage.createPackageContents();
		theGraphmodellingPackage.createPackageContents();

		// Initialize created meta-data
		theCollaborationmodellingPackage.initializePackageContents();
		theGraphmodellingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollaborationmodellingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollaborationmodellingPackage.eNS_URI, theCollaborationmodellingPackage);
		return theCollaborationmodellingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationModelling() {
		return collaborationModellingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorElement() {
		return actorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectElement() {
		return objectElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageElement() {
		return messageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkElement() {
		return linkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationmodellingFactory getCollaborationmodellingFactory() {
		return (CollaborationmodellingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collaborationModellingEClass = createEClass(COLLABORATION_MODELLING);

		actorElementEClass = createEClass(ACTOR_ELEMENT);

		objectElementEClass = createEClass(OBJECT_ELEMENT);

		messageElementEClass = createEClass(MESSAGE_ELEMENT);

		linkElementEClass = createEClass(LINK_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphmodellingPackage theGraphmodellingPackage = (GraphmodellingPackage)EPackage.Registry.INSTANCE.getEPackage(GraphmodellingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collaborationModellingEClass.getESuperTypes().add(theGraphmodellingPackage.getGraph());
		actorElementEClass.getESuperTypes().add(theGraphmodellingPackage.getNode());
		objectElementEClass.getESuperTypes().add(theGraphmodellingPackage.getNode());
		messageElementEClass.getESuperTypes().add(theGraphmodellingPackage.getEdge());
		linkElementEClass.getESuperTypes().add(theGraphmodellingPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(collaborationModellingEClass, CollaborationModelling.class, "CollaborationModelling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorElementEClass, ActorElement.class, "ActorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectElementEClass, ObjectElement.class, "ObjectElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageElementEClass, MessageElement.class, "MessageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkElementEClass, LinkElement.class, "LinkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CollaborationmodellingPackageImpl
