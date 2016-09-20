/**
 */
package objectmodel;

import graphmodel.GraphmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see objectmodel.ObjectmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objectmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "objectmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "objectmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmodelPackage eINSTANCE = objectmodel.impl.ObjectmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link objectmodel.impl.ModellingTypeImpl <em>Modelling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.ModellingTypeImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getModellingType()
	 * @generated
	 */
	int MODELLING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Modelling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link objectmodel.impl.ObjectModellingImpl <em>Object Modelling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.ObjectModellingImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getObjectModelling()
	 * @generated
	 */
	int OBJECT_MODELLING = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__ID = GraphmodelPackage.GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__NAME = GraphmodelPackage.GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__TEXT = GraphmodelPackage.GRAPH__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__DESCRIPTION = GraphmodelPackage.GRAPH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__VALUE = GraphmodelPackage.GRAPH__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__TYPE = GraphmodelPackage.GRAPH__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__CLASS_NAME = GraphmodelPackage.GRAPH__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__GROUP = GraphmodelPackage.GRAPH__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__CATEGORY = GraphmodelPackage.GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__ACCESS_MODIFIER = GraphmodelPackage.GRAPH__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__X = GraphmodelPackage.GRAPH__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__Y = GraphmodelPackage.GRAPH__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__WIDTH = GraphmodelPackage.GRAPH__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__HEIGHT = GraphmodelPackage.GRAPH__HEIGHT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__NODES = GraphmodelPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING__EDGES = GraphmodelPackage.GRAPH__EDGES;

	/**
	 * The number of structural features of the '<em>Object Modelling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODELLING_FEATURE_COUNT = GraphmodelPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link objectmodel.impl.ObjectElementImpl <em>Object Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.ObjectElementImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getObjectElement()
	 * @generated
	 */
	int OBJECT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__NAME = GraphmodelPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__TEXT = GraphmodelPackage.NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__DESCRIPTION = GraphmodelPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__VALUE = GraphmodelPackage.NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__TYPE = GraphmodelPackage.NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__CLASS_NAME = GraphmodelPackage.NODE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__GROUP = GraphmodelPackage.NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__CATEGORY = GraphmodelPackage.NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__ACCESS_MODIFIER = GraphmodelPackage.NODE__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__X = GraphmodelPackage.NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__Y = GraphmodelPackage.NODE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__WIDTH = GraphmodelPackage.NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__HEIGHT = GraphmodelPackage.NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__PARENT_NODE = GraphmodelPackage.NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Sub Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__SUB_NODES = GraphmodelPackage.NODE__SUB_NODES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__PROPERTIES = GraphmodelPackage.NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT__OPERATIONS = GraphmodelPackage.NODE__OPERATIONS;

	/**
	 * The number of structural features of the '<em>Object Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ELEMENT_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link objectmodel.impl.LinkElementImpl <em>Link Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.LinkElementImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getLinkElement()
	 * @generated
	 */
	int LINK_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__ID = GraphmodelPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__NAME = GraphmodelPackage.EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__TEXT = GraphmodelPackage.EDGE__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__DESCRIPTION = GraphmodelPackage.EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__VALUE = GraphmodelPackage.EDGE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__TYPE = GraphmodelPackage.EDGE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__CLASS_NAME = GraphmodelPackage.EDGE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__GROUP = GraphmodelPackage.EDGE__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__CATEGORY = GraphmodelPackage.EDGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__ACCESS_MODIFIER = GraphmodelPackage.EDGE__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__X = GraphmodelPackage.EDGE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__Y = GraphmodelPackage.EDGE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__WIDTH = GraphmodelPackage.EDGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__HEIGHT = GraphmodelPackage.EDGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__SOURCE = GraphmodelPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT__TARGET = GraphmodelPackage.EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Link Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ELEMENT_FEATURE_COUNT = GraphmodelPackage.EDGE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link objectmodel.ModellingType <em>Modelling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelling Type</em>'.
	 * @see objectmodel.ModellingType
	 * @generated
	 */
	EClass getModellingType();

	/**
	 * Returns the meta object for the attribute '{@link objectmodel.ModellingType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmodel.ModellingType#getName()
	 * @see #getModellingType()
	 * @generated
	 */
	EAttribute getModellingType_Name();

	/**
	 * Returns the meta object for class '{@link objectmodel.ObjectModel <em>Object Modelling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Modelling</em>'.
	 * @see objectmodel.ObjectModel
	 * @generated
	 */
	EClass getObjectModelling();

	/**
	 * Returns the meta object for class '{@link objectmodel.ObjectElement <em>Object Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Element</em>'.
	 * @see objectmodel.ObjectElement
	 * @generated
	 */
	EClass getObjectElement();

	/**
	 * Returns the meta object for class '{@link objectmodel.LinkElement <em>Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Element</em>'.
	 * @see objectmodel.LinkElement
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
	ObjectmodelFactory getObjectmodelFactory();

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
		 * The meta object literal for the '{@link objectmodel.impl.ModellingTypeImpl <em>Modelling Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.ModellingTypeImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getModellingType()
		 * @generated
		 */
		EClass MODELLING_TYPE = eINSTANCE.getModellingType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELLING_TYPE__NAME = eINSTANCE.getModellingType_Name();

		/**
		 * The meta object literal for the '{@link objectmodel.impl.ObjectModellingImpl <em>Object Modelling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.ObjectModellingImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getObjectModelling()
		 * @generated
		 */
		EClass OBJECT_MODELLING = eINSTANCE.getObjectModelling();

		/**
		 * The meta object literal for the '{@link objectmodel.impl.ObjectElementImpl <em>Object Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.ObjectElementImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getObjectElement()
		 * @generated
		 */
		EClass OBJECT_ELEMENT = eINSTANCE.getObjectElement();

		/**
		 * The meta object literal for the '{@link objectmodel.impl.LinkElementImpl <em>Link Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.LinkElementImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getLinkElement()
		 * @generated
		 */
		EClass LINK_ELEMENT = eINSTANCE.getLinkElement();

	}

} //ObjectmodelPackage
