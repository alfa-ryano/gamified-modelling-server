/**
 */
package editormodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see editormodel.EditormodelFactory
 * @model kind="package"
 * @generated
 */
public interface EditormodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "editormodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "editormodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "editormodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditormodelPackage eINSTANCE = editormodel.impl.EditormodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link editormodel.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.GameImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__STORIES = 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link editormodel.impl.StoryImpl <em>Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.StoryImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getStory()
	 * @generated
	 */
	int STORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Sub Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__SUB_STORIES = 2;

	/**
	 * The number of structural features of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link editormodel.impl.SubStoryImpl <em>Sub Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.SubStoryImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getSubStory()
	 * @generated
	 */
	int SUB_STORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STORY__LEVELS = 2;

	/**
	 * The number of structural features of the '<em>Sub Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link editormodel.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.LevelImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MODEL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Is Sequel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__IS_SEQUEL = 3;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__OBJECTIVES = 4;

	/**
	 * The feature id for the '<em><b>Level Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__LEVEL_CASE = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__PATH = 6;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link editormodel.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.ObjectiveImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link editormodel.impl.LevelCaseImpl <em>Level Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.LevelCaseImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getLevelCase()
	 * @generated
	 */
	int LEVEL_CASE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CASE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Draggable Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CASE__DRAGGABLE_ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Level Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_CASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link editormodel.impl.DraggableItemImpl <em>Draggable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.DraggableItemImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getDraggableItem()
	 * @generated
	 */
	int DRAGGABLE_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGGABLE_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGGABLE_ITEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGGABLE_ITEM__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Draggable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGGABLE_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link editormodel.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.impl.PathImpl
	 * @see editormodel.impl.EditormodelPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 7;

	/**
	 * The feature id for the '<em><b>Prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PREV_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Next Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NEXT_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link editormodel.MODELTYPE <em>MODELTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.MODELTYPE
	 * @see editormodel.impl.EditormodelPackageImpl#getMODELTYPE()
	 * @generated
	 */
	int MODELTYPE = 8;

	/**
	 * The meta object id for the '{@link editormodel.DRAGGABLE_ITEM_TYPE <em>DRAGGABLE ITEM TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editormodel.DRAGGABLE_ITEM_TYPE
	 * @see editormodel.impl.EditormodelPackageImpl#getDRAGGABLE_ITEM_TYPE()
	 * @generated
	 */
	int DRAGGABLE_ITEM_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link editormodel.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see editormodel.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link editormodel.Game#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stories</em>'.
	 * @see editormodel.Game#getStories()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Stories();

	/**
	 * Returns the meta object for class '{@link editormodel.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story</em>'.
	 * @see editormodel.Story
	 * @generated
	 */
	EClass getStory();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Story#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editormodel.Story#getName()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Name();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Story#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see editormodel.Story#getDescription()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link editormodel.Story#getSubStories <em>Sub Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Stories</em>'.
	 * @see editormodel.Story#getSubStories()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_SubStories();

	/**
	 * Returns the meta object for class '{@link editormodel.SubStory <em>Sub Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Story</em>'.
	 * @see editormodel.SubStory
	 * @generated
	 */
	EClass getSubStory();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.SubStory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editormodel.SubStory#getName()
	 * @see #getSubStory()
	 * @generated
	 */
	EAttribute getSubStory_Name();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.SubStory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see editormodel.SubStory#getDescription()
	 * @see #getSubStory()
	 * @generated
	 */
	EAttribute getSubStory_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link editormodel.SubStory#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see editormodel.SubStory#getLevels()
	 * @see #getSubStory()
	 * @generated
	 */
	EReference getSubStory_Levels();

	/**
	 * Returns the meta object for class '{@link editormodel.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see editormodel.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Level#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editormodel.Level#getName()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Name();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Level#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see editormodel.Level#getDescription()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Description();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Level#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see editormodel.Level#getModelType()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_ModelType();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Level#isIsSequel <em>Is Sequel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequel</em>'.
	 * @see editormodel.Level#isIsSequel()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_IsSequel();

	/**
	 * Returns the meta object for the containment reference list '{@link editormodel.Level#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see editormodel.Level#getObjectives()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Objectives();

	/**
	 * Returns the meta object for the containment reference '{@link editormodel.Level#getLevelCase <em>Level Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level Case</em>'.
	 * @see editormodel.Level#getLevelCase()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_LevelCase();

	/**
	 * Returns the meta object for the containment reference '{@link editormodel.Level#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see editormodel.Level#getPath()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Path();

	/**
	 * Returns the meta object for class '{@link editormodel.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see editormodel.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Objective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editormodel.Objective#getName()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Name();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.Objective#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see editormodel.Objective#getDescription()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Description();

	/**
	 * Returns the meta object for class '{@link editormodel.LevelCase <em>Level Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Case</em>'.
	 * @see editormodel.LevelCase
	 * @generated
	 */
	EClass getLevelCase();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.LevelCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editormodel.LevelCase#getName()
	 * @see #getLevelCase()
	 * @generated
	 */
	EAttribute getLevelCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.LevelCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see editormodel.LevelCase#getDescription()
	 * @see #getLevelCase()
	 * @generated
	 */
	EAttribute getLevelCase_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link editormodel.LevelCase#getDraggableItems <em>Draggable Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Draggable Items</em>'.
	 * @see editormodel.LevelCase#getDraggableItems()
	 * @see #getLevelCase()
	 * @generated
	 */
	EReference getLevelCase_DraggableItems();

	/**
	 * Returns the meta object for class '{@link editormodel.DraggableItem <em>Draggable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Draggable Item</em>'.
	 * @see editormodel.DraggableItem
	 * @generated
	 */
	EClass getDraggableItem();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.DraggableItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editormodel.DraggableItem#getName()
	 * @see #getDraggableItem()
	 * @generated
	 */
	EAttribute getDraggableItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.DraggableItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see editormodel.DraggableItem#getDescription()
	 * @see #getDraggableItem()
	 * @generated
	 */
	EAttribute getDraggableItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link editormodel.DraggableItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see editormodel.DraggableItem#getType()
	 * @see #getDraggableItem()
	 * @generated
	 */
	EAttribute getDraggableItem_Type();

	/**
	 * Returns the meta object for class '{@link editormodel.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see editormodel.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the reference '{@link editormodel.Path#getPrevLevel <em>Prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev Level</em>'.
	 * @see editormodel.Path#getPrevLevel()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_PrevLevel();

	/**
	 * Returns the meta object for the reference '{@link editormodel.Path#getNextLevel <em>Next Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Level</em>'.
	 * @see editormodel.Path#getNextLevel()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_NextLevel();

	/**
	 * Returns the meta object for enum '{@link editormodel.MODELTYPE <em>MODELTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MODELTYPE</em>'.
	 * @see editormodel.MODELTYPE
	 * @generated
	 */
	EEnum getMODELTYPE();

	/**
	 * Returns the meta object for enum '{@link editormodel.DRAGGABLE_ITEM_TYPE <em>DRAGGABLE ITEM TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DRAGGABLE ITEM TYPE</em>'.
	 * @see editormodel.DRAGGABLE_ITEM_TYPE
	 * @generated
	 */
	EEnum getDRAGGABLE_ITEM_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditormodelFactory getEditormodelFactory();

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
		 * The meta object literal for the '{@link editormodel.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.GameImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__STORIES = eINSTANCE.getGame_Stories();

		/**
		 * The meta object literal for the '{@link editormodel.impl.StoryImpl <em>Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.StoryImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getStory()
		 * @generated
		 */
		EClass STORY = eINSTANCE.getStory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__NAME = eINSTANCE.getStory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__DESCRIPTION = eINSTANCE.getStory_Description();

		/**
		 * The meta object literal for the '<em><b>Sub Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__SUB_STORIES = eINSTANCE.getStory_SubStories();

		/**
		 * The meta object literal for the '{@link editormodel.impl.SubStoryImpl <em>Sub Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.SubStoryImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getSubStory()
		 * @generated
		 */
		EClass SUB_STORY = eINSTANCE.getSubStory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_STORY__NAME = eINSTANCE.getSubStory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_STORY__DESCRIPTION = eINSTANCE.getSubStory_Description();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STORY__LEVELS = eINSTANCE.getSubStory_Levels();

		/**
		 * The meta object literal for the '{@link editormodel.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.LevelImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__NAME = eINSTANCE.getLevel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__DESCRIPTION = eINSTANCE.getLevel_Description();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__MODEL_TYPE = eINSTANCE.getLevel_ModelType();

		/**
		 * The meta object literal for the '<em><b>Is Sequel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__IS_SEQUEL = eINSTANCE.getLevel_IsSequel();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__OBJECTIVES = eINSTANCE.getLevel_Objectives();

		/**
		 * The meta object literal for the '<em><b>Level Case</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__LEVEL_CASE = eINSTANCE.getLevel_LevelCase();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__PATH = eINSTANCE.getLevel_Path();

		/**
		 * The meta object literal for the '{@link editormodel.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.ObjectiveImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__NAME = eINSTANCE.getObjective_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__DESCRIPTION = eINSTANCE.getObjective_Description();

		/**
		 * The meta object literal for the '{@link editormodel.impl.LevelCaseImpl <em>Level Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.LevelCaseImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getLevelCase()
		 * @generated
		 */
		EClass LEVEL_CASE = eINSTANCE.getLevelCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_CASE__NAME = eINSTANCE.getLevelCase_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_CASE__DESCRIPTION = eINSTANCE.getLevelCase_Description();

		/**
		 * The meta object literal for the '<em><b>Draggable Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL_CASE__DRAGGABLE_ITEMS = eINSTANCE.getLevelCase_DraggableItems();

		/**
		 * The meta object literal for the '{@link editormodel.impl.DraggableItemImpl <em>Draggable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.DraggableItemImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getDraggableItem()
		 * @generated
		 */
		EClass DRAGGABLE_ITEM = eINSTANCE.getDraggableItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAGGABLE_ITEM__NAME = eINSTANCE.getDraggableItem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAGGABLE_ITEM__DESCRIPTION = eINSTANCE.getDraggableItem_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAGGABLE_ITEM__TYPE = eINSTANCE.getDraggableItem_Type();

		/**
		 * The meta object literal for the '{@link editormodel.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.impl.PathImpl
		 * @see editormodel.impl.EditormodelPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PREV_LEVEL = eINSTANCE.getPath_PrevLevel();

		/**
		 * The meta object literal for the '<em><b>Next Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__NEXT_LEVEL = eINSTANCE.getPath_NextLevel();

		/**
		 * The meta object literal for the '{@link editormodel.MODELTYPE <em>MODELTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.MODELTYPE
		 * @see editormodel.impl.EditormodelPackageImpl#getMODELTYPE()
		 * @generated
		 */
		EEnum MODELTYPE = eINSTANCE.getMODELTYPE();

		/**
		 * The meta object literal for the '{@link editormodel.DRAGGABLE_ITEM_TYPE <em>DRAGGABLE ITEM TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editormodel.DRAGGABLE_ITEM_TYPE
		 * @see editormodel.impl.EditormodelPackageImpl#getDRAGGABLE_ITEM_TYPE()
		 * @generated
		 */
		EEnum DRAGGABLE_ITEM_TYPE = eINSTANCE.getDRAGGABLE_ITEM_TYPE();

	}

} //EditormodelPackage
