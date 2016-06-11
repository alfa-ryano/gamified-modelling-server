/*
 * 
 */
package maineditor.diagram.providers;

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

import maineditor.MaineditorPackage;
import maineditor.diagram.edit.parts.CaseNameEditPart;
import maineditor.diagram.edit.parts.LevelNameEditPart;
import maineditor.diagram.edit.parts.ObjectiveNameEditPart;
import maineditor.diagram.parsers.MessageFormatParser;
import maineditor.diagram.part.MaineditorVisualIDRegistry;

/**
 * @generated
 */
public class MaineditorParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser levelName_5003Parser;

	/**
	* @generated
	*/
	private IParser getLevelName_5003Parser() {
		if (levelName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MaineditorPackage.eINSTANCE.getLevel_Name() };
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
			EAttribute[] features = new EAttribute[] { MaineditorPackage.eINSTANCE.getObjective_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectiveName_5001Parser = parser;
		}
		return objectiveName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser caseName_5002Parser;

	/**
	* @generated
	*/
	private IParser getCaseName_5002Parser() {
		if (caseName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MaineditorPackage.eINSTANCE.getCase_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			caseName_5002Parser = parser;
		}
		return caseName_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LevelNameEditPart.VISUAL_ID:
			return getLevelName_5003Parser();
		case ObjectiveNameEditPart.VISUAL_ID:
			return getObjectiveName_5001Parser();
		case CaseNameEditPart.VISUAL_ID:
			return getCaseName_5002Parser();
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
			return getParser(MaineditorVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MaineditorVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MaineditorElementTypes.getElement(hint) == null) {
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
