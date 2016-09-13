/*
 * 
 */
package editormodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import editormodel.EditormodelPackage;
import editormodel.diagram.edit.parts.DraggableItemDescriptionEditPart;
import editormodel.diagram.edit.parts.LevelCaseNameEditPart;
import editormodel.diagram.edit.parts.LevelNameEditPart;
import editormodel.diagram.edit.parts.ObjectiveNameEditPart;
import editormodel.diagram.edit.parts.StoryDescriptionEditPart;
import editormodel.diagram.edit.parts.SubStoryDescriptionEditPart;
import editormodel.diagram.parsers.MessageFormatParser;
import editormodel.diagram.part.EditormodelVisualIDRegistry;

/**
 * @generated
 */
public class EditormodelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser storyDescription_5005Parser;

	/**
	* @generated
	*/
	private IParser getStoryDescription_5005Parser() {
		if (storyDescription_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EditormodelPackage.eINSTANCE.getStory_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			storyDescription_5005Parser = parser;
		}
		return storyDescription_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser subStoryDescription_5004Parser;

	/**
	* @generated
	*/
	private IParser getSubStoryDescription_5004Parser() {
		if (subStoryDescription_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EditormodelPackage.eINSTANCE.getSubStory_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subStoryDescription_5004Parser = parser;
		}
		return subStoryDescription_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser levelName_5003Parser;

	/**
	* @generated
	*/
	private IParser getLevelName_5003Parser() {
		if (levelName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EditormodelPackage.eINSTANCE.getLevel_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			levelName_5003Parser = parser;
		}
		return levelName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser objectiveName_5001Parser;

	/**
	* @generated
	*/
	private IParser getObjectiveName_5001Parser() {
		if (objectiveName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EditormodelPackage.eINSTANCE.getObjective_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectiveName_5001Parser = parser;
		}
		return objectiveName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser levelCaseName_5002Parser;

	/**
	* @generated
	*/
	private IParser getLevelCaseName_5002Parser() {
		if (levelCaseName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EditormodelPackage.eINSTANCE.getLevelCase_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			levelCaseName_5002Parser = parser;
		}
		return levelCaseName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser draggableItemDescription_5006Parser;

	/**
	* @generated
	*/
	private IParser getDraggableItemDescription_5006Parser() {
		if (draggableItemDescription_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EditormodelPackage.eINSTANCE.getDraggableItem_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			draggableItemDescription_5006Parser = parser;
		}
		return draggableItemDescription_5006Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StoryDescriptionEditPart.VISUAL_ID:
			return getStoryDescription_5005Parser();
		case SubStoryDescriptionEditPart.VISUAL_ID:
			return getSubStoryDescription_5004Parser();
		case LevelNameEditPart.VISUAL_ID:
			return getLevelName_5003Parser();
		case ObjectiveNameEditPart.VISUAL_ID:
			return getObjectiveName_5001Parser();
		case LevelCaseNameEditPart.VISUAL_ID:
			return getLevelCaseName_5002Parser();
		case DraggableItemDescriptionEditPart.VISUAL_ID:
			return getDraggableItemDescription_5006Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EditormodelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EditormodelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EditormodelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
