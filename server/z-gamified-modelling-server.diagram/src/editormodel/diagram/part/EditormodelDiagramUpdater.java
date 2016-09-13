/*
* 
*/
package editormodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import editormodel.DraggableItem;
import editormodel.EditormodelPackage;
import editormodel.Game;
import editormodel.Level;
import editormodel.LevelCase;
import editormodel.Objective;
import editormodel.Path;
import editormodel.Story;
import editormodel.SubStory;
import editormodel.diagram.edit.parts.DraggableItemEditPart;
import editormodel.diagram.edit.parts.GameEditPart;
import editormodel.diagram.edit.parts.LevelCaseEditPart;
import editormodel.diagram.edit.parts.LevelCaseLevelCaseDraggableItemsCompartmentEditPart;
import editormodel.diagram.edit.parts.LevelEditPart;
import editormodel.diagram.edit.parts.LevelLevelLevelCaseCompartmentEditPart;
import editormodel.diagram.edit.parts.LevelLevelObjectivesCompartmentEditPart;
import editormodel.diagram.edit.parts.ObjectiveEditPart;
import editormodel.diagram.edit.parts.PathEditPart;
import editormodel.diagram.edit.parts.StoryEditPart;
import editormodel.diagram.edit.parts.StoryStorySubStoriesCompartmentEditPart;
import editormodel.diagram.edit.parts.SubStoryEditPart;
import editormodel.diagram.edit.parts.SubStorySubStoryLevelsCompartmentEditPart;
import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class EditormodelDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getSemanticChildren(View view) {
		switch (EditormodelVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getGame_1000SemanticChildren(view);
		case StoryStorySubStoriesCompartmentEditPart.VISUAL_ID:
			return getStoryStorySubStoriesCompartment_7001SemanticChildren(view);
		case SubStorySubStoryLevelsCompartmentEditPart.VISUAL_ID:
			return getSubStorySubStoryLevelsCompartment_7002SemanticChildren(view);
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			return getLevelLevelObjectivesCompartment_7003SemanticChildren(view);
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
			return getLevelLevelLevelCaseCompartment_7004SemanticChildren(view);
		case LevelCaseLevelCaseDraggableItemsCompartmentEditPart.VISUAL_ID:
			return getLevelCaseLevelCaseDraggableItemsCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getGame_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Game modelElement = (Game) view.getElement();
		LinkedList<EditormodelNodeDescriptor> result = new LinkedList<EditormodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStories().iterator(); it.hasNext();) {
			Story childElement = (Story) it.next();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StoryEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getStoryStorySubStoriesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Story modelElement = (Story) containerView.getElement();
		LinkedList<EditormodelNodeDescriptor> result = new LinkedList<EditormodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubStories().iterator(); it.hasNext();) {
			SubStory childElement = (SubStory) it.next();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SubStoryEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getSubStorySubStoryLevelsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SubStory modelElement = (SubStory) containerView.getElement();
		LinkedList<EditormodelNodeDescriptor> result = new LinkedList<EditormodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLevels().iterator(); it.hasNext();) {
			Level childElement = (Level) it.next();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LevelEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getLevelLevelObjectivesCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Level modelElement = (Level) containerView.getElement();
		LinkedList<EditormodelNodeDescriptor> result = new LinkedList<EditormodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getObjectives().iterator(); it.hasNext();) {
			Objective childElement = (Objective) it.next();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectiveEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getLevelLevelLevelCaseCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Level modelElement = (Level) containerView.getElement();
		LinkedList<EditormodelNodeDescriptor> result = new LinkedList<EditormodelNodeDescriptor>();
		{
			LevelCase childElement = modelElement.getLevelCase();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LevelCaseEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EditormodelNodeDescriptor> getLevelCaseLevelCaseDraggableItemsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LevelCase modelElement = (LevelCase) containerView.getElement();
		LinkedList<EditormodelNodeDescriptor> result = new LinkedList<EditormodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDraggableItems().iterator(); it.hasNext();) {
			DraggableItem childElement = (DraggableItem) it.next();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DraggableItemEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EditormodelLinkDescriptor> getContainedLinks(View view) {
		switch (EditormodelVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getGame_1000ContainedLinks(view);
		case StoryEditPart.VISUAL_ID:
			return getStory_2001ContainedLinks(view);
		case SubStoryEditPart.VISUAL_ID:
			return getSubStory_3001ContainedLinks(view);
		case LevelEditPart.VISUAL_ID:
			return getLevel_3002ContainedLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3003ContainedLinks(view);
		case LevelCaseEditPart.VISUAL_ID:
			return getLevelCase_3004ContainedLinks(view);
		case DraggableItemEditPart.VISUAL_ID:
			return getDraggableItem_3005ContainedLinks(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EditormodelLinkDescriptor> getIncomingLinks(View view) {
		switch (EditormodelVisualIDRegistry.getVisualID(view)) {
		case StoryEditPart.VISUAL_ID:
			return getStory_2001IncomingLinks(view);
		case SubStoryEditPart.VISUAL_ID:
			return getSubStory_3001IncomingLinks(view);
		case LevelEditPart.VISUAL_ID:
			return getLevel_3002IncomingLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3003IncomingLinks(view);
		case LevelCaseEditPart.VISUAL_ID:
			return getLevelCase_3004IncomingLinks(view);
		case DraggableItemEditPart.VISUAL_ID:
			return getDraggableItem_3005IncomingLinks(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EditormodelLinkDescriptor> getOutgoingLinks(View view) {
		switch (EditormodelVisualIDRegistry.getVisualID(view)) {
		case StoryEditPart.VISUAL_ID:
			return getStory_2001OutgoingLinks(view);
		case SubStoryEditPart.VISUAL_ID:
			return getSubStory_3001OutgoingLinks(view);
		case LevelEditPart.VISUAL_ID:
			return getLevel_3002OutgoingLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3003OutgoingLinks(view);
		case LevelCaseEditPart.VISUAL_ID:
			return getLevelCase_3004OutgoingLinks(view);
		case DraggableItemEditPart.VISUAL_ID:
			return getDraggableItem_3005OutgoingLinks(view);
		case PathEditPart.VISUAL_ID:
			return getPath_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getGame_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getStory_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getSubStory_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getLevel_3002ContainedLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Path_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getObjective_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getLevelCase_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EditormodelLinkDescriptor> getDraggableItem_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getPath_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getStory_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getSubStory_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getLevel_3002IncomingLinks(View view) {
		Level modelElement = (Level) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Path_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getObjective_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getLevelCase_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EditormodelLinkDescriptor> getDraggableItem_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getPath_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getStory_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getSubStory_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getLevel_3002OutgoingLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Path_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getObjective_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getLevelCase_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EditormodelLinkDescriptor> getDraggableItem_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getPath_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<EditormodelLinkDescriptor> getContainedTypeModelFacetLinks_Path_4001(Level container) {
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		Path link = container.getPath();
		if (PathEditPart.VISUAL_ID != EditormodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Level dst = link.getNextLevel();
		Level src = link.getPrevLevel();
		result.add(new EditormodelLinkDescriptor(src, dst, link, EditormodelElementTypes.Path_4001,
				PathEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EditormodelLinkDescriptor> getIncomingTypeModelFacetLinks_Path_4001(Level target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EditormodelPackage.eINSTANCE.getPath_NextLevel()
					|| false == setting.getEObject() instanceof Path) {
				continue;
			}
			Path link = (Path) setting.getEObject();
			if (PathEditPart.VISUAL_ID != EditormodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Level src = link.getPrevLevel();
			result.add(new EditormodelLinkDescriptor(src, target, link, EditormodelElementTypes.Path_4001,
					PathEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<EditormodelLinkDescriptor> getOutgoingTypeModelFacetLinks_Path_4001(Level source) {
		Level container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Level) {
				container = (Level) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		Path link = container.getPath();
		if (PathEditPart.VISUAL_ID != EditormodelVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Level dst = link.getNextLevel();
		Level src = link.getPrevLevel();
		if (src != source) {
			return result;
		}
		result.add(new EditormodelLinkDescriptor(src, dst, link, EditormodelElementTypes.Path_4001,
				PathEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<EditormodelNodeDescriptor> getSemanticChildren(View view) {
			return EditormodelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<EditormodelLinkDescriptor> getContainedLinks(View view) {
			return EditormodelDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<EditormodelLinkDescriptor> getIncomingLinks(View view) {
			return EditormodelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<EditormodelLinkDescriptor> getOutgoingLinks(View view) {
			return EditormodelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
