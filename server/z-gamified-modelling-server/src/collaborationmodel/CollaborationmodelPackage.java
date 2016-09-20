/**
 */
package collaborationmodel;

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
 * @see collaborationmodel.CollaborationmodelFactory
 * @model kind="package"
 * @generated
 */
public interface CollaborationmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collaborationmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "collaborationmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collaborationmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationmodelPackage eINSTANCE = collaborationmodel.impl.CollaborationmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link collaborationmodel.impl.ModellingTypeImpl <em>Modelling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaborationmodel.impl.ModellingTypeImpl
	 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getModellingType()
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
	 * The meta object id for the '{@link collaborationmodel.impl.CollaborationModellingImpl <em>Collaboration Modelling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaborationmodel.impl.CollaborationModellingImpl
	 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getCollaborationModelling()
	 * @generated
	 */
	int COLLABORATION_MODELLING = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__ID = GraphmodelPackage.GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__NAME = GraphmodelPackage.GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__TEXT = GraphmodelPackage.GRAPH__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__DESCRIPTION = GraphmodelPackage.GRAPH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__VALUE = GraphmodelPackage.GRAPH__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__TYPE = GraphmodelPackage.GRAPH__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__CLASS_NAME = GraphmodelPackage.GRAPH__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__GROUP = GraphmodelPackage.GRAPH__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__CATEGORY = GraphmodelPackage.GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__ACCESS_MODIFIER = GraphmodelPackage.GRAPH__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__X = GraphmodelPackage.GRAPH__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__Y = GraphmodelPackage.GRAPH__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__WIDTH = GraphmodelPackage.GRAPH__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__HEIGHT = GraphmodelPackage.GRAPH__HEIGHT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__NODES = GraphmodelPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING__EDGES = GraphmodelPackage.GRAPH__EDGES;

	/**
	 * The number of structural features of the '<em>Collaboration Modelling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_MODELLING_FEATURE_COUNT = GraphmodelPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link collaborationmodel.impl.ActorElementImpl <em>Actor Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaborationmodel.impl.ActorElementImpl
	 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getActorElement()
	 * @generated
	 */
	int ACTOR_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__NAME = GraphmodelPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__TEXT = GraphmodelPackage.NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__DESCRIPTION = GraphmodelPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__VALUE = GraphmodelPackage.NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__TYPE = GraphmodelPackage.NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__CLASS_NAME = GraphmodelPackage.NODE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__GROUP = GraphmodelPackage.NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__CATEGORY = GraphmodelPackage.NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__ACCESS_MODIFIER = GraphmodelPackage.NODE__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__X = GraphmodelPackage.NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__Y = GraphmodelPackage.NODE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__WIDTH = GraphmodelPackage.NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__HEIGHT = GraphmodelPackage.NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__PARENT_NODE = GraphmodelPackage.NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Sub Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__SUB_NODES = GraphmodelPackage.NODE__SUB_NODES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__PROPERTIES = GraphmodelPackage.NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT__OPERATIONS = GraphmodelPackage.NODE__OPERATIONS;

	/**
	 * The number of structural features of the '<em>Actor Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_ELEMENT_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link collaborationmodel.impl.ObjectElementImpl <em>Object Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaborationmodel.impl.ObjectElementImpl
	 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getObjectElement()
	 * @generated
	 */
	int OBJECT_ELEMENT = 3;

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
	 * The meta object id for the '{@link collaborationmodel.impl.MessageElementImpl <em>Message Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaborationmodel.impl.MessageElementImpl
	 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getMessageElement()
	 * @generated
	 */
	int MESSAGE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__ID = GraphmodelPackage.EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__NAME = GraphmodelPackage.EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__TEXT = GraphmodelPackage.EDGE__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__DESCRIPTION = GraphmodelPackage.EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__VALUE = GraphmodelPackage.EDGE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__TYPE = GraphmodelPackage.EDGE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__CLASS_NAME = GraphmodelPackage.EDGE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__GROUP = GraphmodelPackage.EDGE__GROUP;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__CATEGORY = GraphmodelPackage.EDGE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__ACCESS_MODIFIER = GraphmodelPackage.EDGE__ACCESS_MODIFIER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__X = GraphmodelPackage.EDGE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__Y = GraphmodelPackage.EDGE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__WIDTH = GraphmodelPackage.EDGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__HEIGHT = GraphmodelPackage.EDGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__SOURCE = GraphmodelPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__TARGET = GraphmodelPackage.EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Message Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_FEATURE_COUNT = GraphmodelPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link collaborationmodel.impl.LinkElementImpl <em>Link Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collaborationmodel.impl.LinkElementImpl
	 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getLinkElement()
	 * @generated
	 */
	int LINK_ELEMENT = 5;

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
	 * Returns the meta object for class '{@link collaborationmodel.ModellingType <em>Modelling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelling Type</em>'.
	 * @see collaborationmodel.ModellingType
	 * @generated
	 */
	EClass getModellingType();

	/**
	 * Returns the meta object for the attribute '{@link collaborationmodel.ModellingType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see collaborationmodel.ModellingType#getName()
	 * @see #getModellingType()
	 * @generated
	 */
	EAttribute getModellingType_Name();

	/**
	 * Returns the meta object for class '{@link collaborationmodel.CollaborationModel <em>Collaboration Modelling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Modelling</em>'.
	 * @see collaborationmodel.CollaborationModel
	 * @generated
	 */
	EClass getCollaborationModelling();

	/**
	 * Returns the meta object for class '{@link collaborationmodel.ActorElement <em>Actor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Element</em>'.
	 * @see collaborationmodel.ActorElement
	 * @generated
	 */
	EClass getActorElement();

	/**
	 * Returns the meta object for class '{@link collaborationmodel.ObjectElement <em>Object Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Element</em>'.
	 * @see collaborationmodel.ObjectElement
	 * @generated
	 */
	EClass getObjectElement();

	/**
	 * Returns the meta object for class '{@link collaborationmodel.MessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Element</em>'.
	 * @see collaborationmodel.MessageElement
	 * @generated
	 */
	EClass getMessageElement();

	/**
	 * Returns the meta object for class '{@link collaborationmodel.LinkElement <em>Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Element</em>'.
	 * @see collaborationmodel.LinkElement
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
	CollaborationmodelFactory getCollaborationmodelFactory();

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
		 * The meta object literal for the '{@link collaborationmodel.impl.ModellingTypeImpl <em>Modelling Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaborationmodel.impl.ModellingTypeImpl
		 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getModellingType()
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
		 * The meta object literal for the '{@link collaborationmodel.impl.CollaborationModellingImpl <em>Collaboration Modelling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaborationmodel.impl.CollaborationModellingImpl
		 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getCollaborationModelling()
		 * @generated
		 */
		EClass COLLABORATION_MODELLING = eINSTANCE.getCollaborationModelling();

		/**
		 * The meta object literal for the '{@link collaborationmodel.impl.ActorElementImpl <em>Actor Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaborationmodel.impl.ActorElementImpl
		 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getActorElement()
		 * @generated
		 */
		EClass ACTOR_ELEMENT = eINSTANCE.getActorElement();

		/**
		 * The meta object literal for the '{@link collaborationmodel.impl.ObjectElementImpl <em>Object Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaborationmodel.impl.ObjectElementImpl
		 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getObjectElement()
		 * @generated
		 */
		EClass OBJECT_ELEMENT = eINSTANCE.getObjectElement();

		/**
		 * The meta object literal for the '{@link collaborationmodel.impl.MessageElementImpl <em>Message Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaborationmodel.impl.MessageElementImpl
		 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getMessageElement()
		 * @generated
		 */
		EClass MESSAGE_ELEMENT = eINSTANCE.getMessageElement();

		/**
		 * The meta object literal for the '{@link collaborationmodel.impl.LinkElementImpl <em>Link Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collaborationmodel.impl.LinkElementImpl
		 * @see collaborationmodel.impl.CollaborationmodelPackageImpl#getLinkElement()
		 * @generated
		 */
		EClass LINK_ELEMENT = eINSTANCE.getLinkElement();

	}

} //CollaborationmodelPackage
