/*
* 
*/
package maineditor.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import maineditor.diagram.edit.parts.CaseEditPart;
import maineditor.diagram.edit.parts.CaseNameEditPart;
import maineditor.diagram.edit.parts.GameEditPart;
import maineditor.diagram.edit.parts.LevelEditPart;
import maineditor.diagram.edit.parts.LevelNameEditPart;
import maineditor.diagram.edit.parts.ObjectiveEditPart;
import maineditor.diagram.edit.parts.ObjectiveNameEditPart;
import maineditor.diagram.edit.parts.PathEditPart;
import maineditor.diagram.part.MaineditorDiagramEditorPlugin;
import maineditor.diagram.part.MaineditorVisualIDRegistry;
import maineditor.diagram.providers.MaineditorElementTypes;
import maineditor.diagram.providers.MaineditorParserProvider;

/**
 * @generated
 */
public class MaineditorNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MaineditorDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		MaineditorDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MaineditorNavigatorItem && !isOwnView(((MaineditorNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MaineditorNavigatorGroup) {
			MaineditorNavigatorGroup group = (MaineditorNavigatorGroup) element;
			return MaineditorDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MaineditorNavigatorItem) {
			MaineditorNavigatorItem navigatorItem = (MaineditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (MaineditorVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?org.york.gamified.modelling.objectmodel?Game", //$NON-NLS-1$
					MaineditorElementTypes.Game_1000);
		case LevelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?org.york.gamified.modelling.objectmodel?Level", //$NON-NLS-1$
					MaineditorElementTypes.Level_2001);
		case ObjectiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?org.york.gamified.modelling.objectmodel?Objective", //$NON-NLS-1$
					MaineditorElementTypes.Objective_3001);
		case CaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?org.york.gamified.modelling.objectmodel?Case", //$NON-NLS-1$
					MaineditorElementTypes.Case_3002);
		case PathEditPart.VISUAL_ID:
			return getImage("Navigator?Link?org.york.gamified.modelling.objectmodel?Path", //$NON-NLS-1$
					MaineditorElementTypes.Path_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MaineditorDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MaineditorElementTypes.isKnownElementType(elementType)) {
			image = MaineditorElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof MaineditorNavigatorGroup) {
			MaineditorNavigatorGroup group = (MaineditorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MaineditorNavigatorItem) {
			MaineditorNavigatorItem navigatorItem = (MaineditorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MaineditorVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getGame_1000Text(view);
		case LevelEditPart.VISUAL_ID:
			return getLevel_2001Text(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3001Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3002Text(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getGame_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getLevel_2001Text(View view) {
		IParser parser = MaineditorParserProvider.getParser(MaineditorElementTypes.Level_2001,
				view.getElement() != null ? view.getElement() : view,
				MaineditorVisualIDRegistry.getType(LevelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MaineditorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObjective_3001Text(View view) {
		IParser parser = MaineditorParserProvider.getParser(MaineditorElementTypes.Objective_3001,
				view.getElement() != null ? view.getElement() : view,
				MaineditorVisualIDRegistry.getType(ObjectiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MaineditorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3002Text(View view) {
		IParser parser = MaineditorParserProvider.getParser(MaineditorElementTypes.Case_3002,
				view.getElement() != null ? view.getElement() : view,
				MaineditorVisualIDRegistry.getType(CaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MaineditorDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPath_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return GameEditPart.MODEL_ID.equals(MaineditorVisualIDRegistry.getModelID(view));
	}

}
