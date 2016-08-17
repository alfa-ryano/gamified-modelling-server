/**
 */
package objectmodelling;

import graphmodelling.GraphmodellingPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see objectmodelling.ObjectmodellingFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectmodellingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objectmodelling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "objectmodelling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "objectmodelling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmodellingPackage eINSTANCE = objectmodelling.impl.ObjectmodellingPackageImpl.init();

	/**
	 * The meta object id for the '{@link objectmodelling.impl.ObjectModellingImpl <em>Object Modelling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodelling.impl.ObjectModellingImpl
	 * @see objectmodelling.impl.ObjectmodellingPackageImpl#getObjectModelling()
	 * @generated
	 */
	int OBJECT_MODELLING = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__ID = GraphmodellingPackage.GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__NAME = GraphmodellingPackage.GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__TEXT = GraphmodellingPackage.GRAPH__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__DESCRIPTION = GraphmodellingPackage.GRAPH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__VALUE = GraphmodellingPackage.GRAPH__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__TYPE = GraphmodellingPackage.GRAPH__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__CLASS_NAME = GraphmodellingPackage.GRAPH__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__GROUP = GraphmodellingPackage.GRAPH__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__CATEGORY = GraphmodellingPackage.GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__ACCESS_MODIFIER = GraphmodellingPackage.GRAPH__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__X = GraphmodellingPackage.GRAPH__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__Y = GraphmodellingPackage.GRAPH__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__WIDTH = GraphmodellingPackage.GRAPH__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__HEIGHT = GraphmodellingPackage.GRAPH__HEIGHT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__NODES = GraphmodellingPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__EDGES = GraphmodellingPackage.GRAPH__EDGES;

	/**
	 * The number of structural features of the '<em>Object Modelling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING_FEATURE_COUNT = GraphmodellingPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link objectmodelling.impl.ObjectElementImpl <em>Object Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodelling.impl.ObjectElementImpl
	 * @see objectmodelling.impl.ObjectmodellingPackageImpl#getObjectElement()
	 * @generated
	 */
	int OBJECT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ID = GraphmodellingPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__NAME = GraphmodellingPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__TEXT = GraphmodellingPackage.NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__DESCRIPTION = GraphmodellingPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__VALUE = GraphmodellingPackage.NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__TYPE = GraphmodellingPackage.NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__CLASS_NAME = GraphmodellingPackage.NODE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__GROUP = GraphmodellingPackage.NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__CATEGORY = GraphmodellingPackage.NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ACCESS_MODIFIER = GraphmodellingPackage.NODE__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__X = GraphmodellingPackage.NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__Y = GraphmodellingPackage.NODE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__WIDTH = GraphmodellingPackage.NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__HEIGHT = GraphmodellingPackage.NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__PARENT_NODE = GraphmodellingPackage.NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Sub Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__SUB_NODES = GraphmodellingPackage.NODE__SUB_NODES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__PROPERTIES = GraphmodellingPackage.NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__OPERATIONS = GraphmodellingPackage.NODE__OPERATIONS;

	/**
	 * The number of structural features of the '<em>Object Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT_FEATURE_COUNT = GraphmodellingPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link objectmodelling.impl.LinkElementImpl <em>Link Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodelling.impl.LinkElementImpl
	 * @see objectmodelling.impl.ObjectmodellingPackageImpl#getLinkElement()
	 * @generated
	 */
	int LINK_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__ID = GraphmodellingPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__NAME = GraphmodellingPackage.EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__TEXT = GraphmodellingPackage.EDGE__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__DESCRIPTION = GraphmodellingPackage.EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__VALUE = GraphmodellingPackage.EDGE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__TYPE = GraphmodellingPackage.EDGE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__CLASS_NAME = GraphmodellingPackage.EDGE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__GROUP = GraphmodellingPackage.EDGE__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__CATEGORY = GraphmodellingPackage.EDGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__ACCESS_MODIFIER = GraphmodellingPackage.EDGE__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__X = GraphmodellingPackage.EDGE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__Y = GraphmodellingPackage.EDGE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__WIDTH = GraphmodellingPackage.EDGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__HEIGHT = GraphmodellingPackage.EDGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__SOURCE = GraphmodellingPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__TARGET = GraphmodellingPackage.EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Link Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT_FEATURE_COUNT = GraphmodellingPackage.EDGE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link objectmodelling.ObjectModelling <em>Object Modelling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Modelling</em>'.
	 * @see objectmodelling.ObjectModelling
	 * @generated
	 */
	EClass getObjectModelling();

	/**
	 * Returns the meta object for class '{@link objectmodelling.ObjectElement <em>Object Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Element</em>'.
	 * @see objectmodelling.ObjectElement
	 * @generated
	 */
	EClass getObjectElement();

	/**
	 * Returns the meta object for class '{@link objectmodelling.LinkElement <em>Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Element</em>'.
	 * @see objectmodelling.LinkElement
	 * @generated
	 */
	EClass getLinkElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectmodellingFactory getObjectmodellingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link objectmodelling.impl.ObjectModellingImpl <em>Object Modelling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodelling.impl.ObjectModellingImpl
		 * @see objectmodelling.impl.ObjectmodellingPackageImpl#getObjectModelling()
		 * @generated
		 */
		EClass OBJECT_MODELLING = eINSTANCE.getObjectModelling();

		/**
		 * The meta object literal for the '{@link objectmodelling.impl.ObjectElementImpl <em>Object Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodelling.impl.ObjectElementImpl
		 * @see objectmodelling.impl.ObjectmodellingPackageImpl#getObjectElement()
		 * @generated
		 */
		EClass OBJECT_ELEMENT = eINSTANCE.getObjectElement();

		/**
		 * The meta object literal for the '{@link objectmodelling.impl.LinkElementImpl <em>Link Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodelling.impl.LinkElementImpl
		 * @see objectmodelling.impl.ObjectmodellingPackageImpl#getLinkElement()
		 * @generated
		 */
		EClass LINK_ELEMENT = eINSTANCE.getLinkElement();

	}

} //ObjectmodellingPackage
