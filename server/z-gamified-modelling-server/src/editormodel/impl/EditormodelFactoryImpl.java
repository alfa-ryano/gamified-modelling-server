/**
 */
package editormodel.impl;

import editormodel.*;

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
public class EditormodelFactoryImpl extends EFactoryImpl implements EditormodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditormodelFactory init() {
		try {
			EditormodelFactory theEditormodelFactory = (EditormodelFactory)EPackage.Registry.INSTANCE.getEFactory(EditormodelPackage.eNS_URI);
			if (theEditormodelFactory != null) {
				return theEditormodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EditormodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditormodelFactoryImpl() {
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
			case EditormodelPackage.GAME: return createGame();
			case EditormodelPackage.STORY: return createStory();
			case EditormodelPackage.SUB_STORY: return createSubStory();
			case EditormodelPackage.LEVEL: return createLevel();
			case EditormodelPackage.OBJECTIVE: return createObjective();
			case EditormodelPackage.LEVEL_CASE: return createLevelCase();
			case EditormodelPackage.DRAGGABLE_ITEM: return createDraggableItem();
			case EditormodelPackage.PATH: return createPath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Story createStory() {
		StoryImpl story = new StoryImpl();
		return story;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubStory createSubStory() {
		SubStoryImpl subStory = new SubStoryImpl();
		return subStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelCase createLevelCase() {
		LevelCaseImpl levelCase = new LevelCaseImpl();
		return levelCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DraggableItem createDraggableItem() {
		DraggableItemImpl draggableItem = new DraggableItemImpl();
		return draggableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditormodelPackage getEditormodelPackage() {
		return (EditormodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EditormodelPackage getPackage() {
		return EditormodelPackage.eINSTANCE;
	}

} //EditormodelFactoryImpl
