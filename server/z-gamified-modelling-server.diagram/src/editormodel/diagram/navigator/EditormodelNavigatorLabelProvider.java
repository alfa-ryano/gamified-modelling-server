/*
* 
*/
package editormodel.diagram.navigator;

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

import editormodel.diagram.edit.parts.DraggableItemDescriptionEditPart;
import editormodel.diagram.edit.parts.DraggableItemEditPart;
import editormodel.diagram.edit.parts.GameEditPart;
import editormodel.diagram.edit.parts.LevelCaseEditPart;
import editormodel.diagram.edit.parts.LevelCaseNameEditPart;
import editormodel.diagram.edit.parts.LevelEditPart;
import editormodel.diagram.edit.parts.LevelNameEditPart;
import editormodel.diagram.edit.parts.ObjectiveEditPart;
import editormodel.diagram.edit.parts.ObjectiveNameEditPart;
import editormodel.diagram.edit.parts.PathEditPart;
import editormodel.diagram.edit.parts.StoryDescriptionEditPart;
import editormodel.diagram.edit.parts.StoryEditPart;
import editormodel.diagram.edit.parts.SubStoryDescriptionEditPart;
import editormodel.diagram.edit.parts.SubStoryEditPart;
import editormodel.diagram.part.EditormodelDiagramEditorPlugin;
import editormodel.diagram.part.EditormodelVisualIDRegistry;
import editormodel.diagram.providers.EditormodelElementTypes;
import editormodel.diagram.providers.EditormodelParserProvider;

/**
 * @generated
 */
public class EditormodelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		EditormodelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		EditormodelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EditormodelNavigatorItem && !isOwnView(((EditormodelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof EditormodelNavigatorGroup) {
			EditormodelNavigatorGroup group = (EditormodelNavigatorGroup) element;
			return EditormodelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof EditormodelNavigatorItem) {
			EditormodelNavigatorItem navigatorItem = (EditormodelNavigatorItem) element;
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
		switch (EditormodelVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?editormodel?Game", EditormodelElementTypes.Game_1000); //$NON-NLS-1$
		case StoryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?editormodel?Story", EditormodelElementTypes.Story_2001); //$NON-NLS-1$
		case SubStoryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?editormodel?SubStory", EditormodelElementTypes.SubStory_3001); //$NON-NLS-1$
		case LevelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?editormodel?Level", EditormodelElementTypes.Level_3002); //$NON-NLS-1$
		case ObjectiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?editormodel?Objective", EditormodelElementTypes.Objective_3003); //$NON-NLS-1$
		case LevelCaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?editormodel?LevelCase", EditormodelElementTypes.LevelCase_3004); //$NON-NLS-1$
		case DraggableItemEditPart.VISUAL_ID:
			return getImage("Navigator?Node?editormodel?DraggableItem", EditormodelElementTypes.DraggableItem_3005); //$NON-NLS-1$
		case PathEditPart.VISUAL_ID:
			return getImage("Navigator?Link?editormodel?Path", EditormodelElementTypes.Path_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EditormodelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && EditormodelElementTypes.isKnownElementType(elementType)) {
			image = EditormodelElementTypes.getImage(elementType);
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
		if (element instanceof EditormodelNavigatorGroup) {
			EditormodelNavigatorGroup group = (EditormodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EditormodelNavigatorItem) {
			EditormodelNavigatorItem navigatorItem = (EditormodelNavigatorItem) element;
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
		switch (EditormodelVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getGame_1000Text(view);
		case StoryEditPart.VISUAL_ID:
			return getStory_2001Text(view);
		case SubStoryEditPart.VISUAL_ID:
			return getSubStory_3001Text(view);
		case LevelEditPart.VISUAL_ID:
			return getLevel_3002Text(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3003Text(view);
		case LevelCaseEditPart.VISUAL_ID:
			return getLevelCase_3004Text(view);
		case DraggableItemEditPart.VISUAL_ID:
			return getDraggableItem_3005Text(view);
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
	private String getStory_2001Text(View view) {
		IParser parser = EditormodelParserProvider.getParser(EditormodelElementTypes.Story_2001,
				view.getElement() != null ? view.getElement() : view,
				EditormodelVisualIDRegistry.getType(StoryDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EditormodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSubStory_3001Text(View view) {
		IParser parser = EditormodelParserProvider.getParser(EditormodelElementTypes.SubStory_3001,
				view.getElement() != null ? view.getElement() : view,
				EditormodelVisualIDRegistry.getType(SubStoryDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EditormodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLevel_3002Text(View view) {
		IParser parser = EditormodelParserProvider.getParser(EditormodelElementTypes.Level_3002,
				view.getElement() != null ? view.getElement() : view,
				EditormodelVisualIDRegistry.getType(LevelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EditormodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObjective_3003Text(View view) {
		IParser parser = EditormodelParserProvider.getParser(EditormodelElementTypes.Objective_3003,
				view.getElement() != null ? view.getElement() : view,
				EditormodelVisualIDRegistry.getType(ObjectiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EditormodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLevelCase_3004Text(View view) {
		IParser parser = EditormodelParserProvider.getParser(EditormodelElementTypes.LevelCase_3004,
				view.getElement() != null ? view.getElement() : view,
				EditormodelVisualIDRegistry.getType(LevelCaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EditormodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDraggableItem_3005Text(View view) {
		IParser parser = EditormodelParserProvider.getParser(EditormodelElementTypes.DraggableItem_3005,
				view.getElement() != null ? view.getElement() : view,
				EditormodelVisualIDRegistry.getType(DraggableItemDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EditormodelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
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
		return GameEditPart.MODEL_ID.equals(EditormodelVisualIDRegistry.getModelID(view));
	}

}
