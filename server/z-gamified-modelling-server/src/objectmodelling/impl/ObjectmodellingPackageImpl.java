/**
 */
package objectmodelling.impl;

import graphmodelling.GraphmodellingPackage;

import graphmodelling.impl.GraphmodellingPackageImpl;

import objectmodelling.LinkElement;
import objectmodelling.ObjectElement;
import objectmodelling.ObjectModelling;
import objectmodelling.ObjectmodellingFactory;
import objectmodelling.ObjectmodellingPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectmodellingPackageImpl extends EPackageImpl implements ObjectmodellingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectModellingEClass = null;

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
	 * @see objectmodelling.ObjectmodellingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObjectmodellingPackageImpl() {
		super(eNS_URI, ObjectmodellingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ObjectmodellingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObjectmodellingPackage init() {
		if (isInited) return (ObjectmodellingPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectmodellingPackage.eNS_URI);

		// Obtain or create and register package
		ObjectmodellingPackageImpl theObjectmodellingPackage = (ObjectmodellingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ObjectmodellingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ObjectmodellingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraphmodellingPackageImpl theGraphmodellingPackage = (GraphmodellingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphmodellingPackage.eNS_URI) instanceof GraphmodellingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphmodellingPackage.eNS_URI) : GraphmodellingPackage.eINSTANCE);

		// Create package meta-data objects
		theObjectmodellingPackage.createPackageContents();
		theGraphmodellingPackage.createPackageContents();

		// Initialize created meta-data
		theObjectmodellingPackage.initializePackageContents();
		theGraphmodellingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theObjectmodellingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObjectmodellingPackage.eNS_URI, theObjectmodellingPackage);
		return theObjectmodellingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectModelling() {
		return objectModellingEClass;
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
	public EClass getLinkElement() {
		return linkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmodellingFactory getObjectmodellingFactory() {
		return (ObjectmodellingFactory)getEFactoryInstance();
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
		objectModellingEClass = createEClass(OBJECT_MODELLING);

		objectElementEClass = createEClass(OBJECT_ELEMENT);

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
		objectModellingEClass.getESuperTypes().add(theGraphmodellingPackage.getGraph());
		objectElementEClass.getESuperTypes().add(theGraphmodellingPackage.getNode());
		linkElementEClass.getESuperTypes().add(theGraphmodellingPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(objectModellingEClass, ObjectModelling.class, "ObjectModelling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectElementEClass, ObjectElement.class, "ObjectElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkElementEClass, LinkElement.class, "LinkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ObjectmodellingPackageImpl
