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

import editormodel.Case;
import editormodel.EditormodelPackage;
import editormodel.Game;
import editormodel.Level;
import editormodel.Objective;
import editormodel.Path;
import editormodel.diagram.edit.parts.CaseEditPart;
import editormodel.diagram.edit.parts.GameEditPart;
import editormodel.diagram.edit.parts.LevelEditPart;
import editormodel.diagram.edit.parts.LevelLevelLevelCaseCompartmentEditPart;
import editormodel.diagram.edit.parts.LevelLevelObjectivesCompartmentEditPart;
import editormodel.diagram.edit.parts.ObjectiveEditPart;
import editormodel.diagram.edit.parts.PathEditPart;
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
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			return getLevelLevelObjectivesCompartment_7001SemanticChildren(view);
		case LevelLevelLevelCaseCompartmentEditPart.VISUAL_ID:
			return getLevelLevelLevelCaseCompartment_7002SemanticChildren(view);
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
	public static List<EditormodelNodeDescriptor> getLevelLevelObjectivesCompartment_7001SemanticChildren(View view) {
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
	public static List<EditormodelNodeDescriptor> getLevelLevelLevelCaseCompartment_7002SemanticChildren(View view) {
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
			Case childElement = modelElement.getLevelCase();
			int visualID = EditormodelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new EditormodelNodeDescriptor(childElement, visualID));
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
		case LevelEditPart.VISUAL_ID:
			return getLevel_2001ContainedLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3001ContainedLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3002ContainedLinks(view);
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
		case LevelEditPart.VISUAL_ID:
			return getLevel_2001IncomingLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3001IncomingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3002IncomingLinks(view);
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
		case LevelEditPart.VISUAL_ID:
			return getLevel_2001OutgoingLinks(view);
		case ObjectiveEditPart.VISUAL_ID:
			return getObjective_3001OutgoingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3002OutgoingLinks(view);
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
	public static List<EditormodelLinkDescriptor> getLevel_2001ContainedLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Path_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getObjective_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getCase_3002ContainedLinks(View view) {
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
	public static List<EditormodelLinkDescriptor> getLevel_2001IncomingLinks(View view) {
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
	public static List<EditormodelLinkDescriptor> getObjective_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getCase_3002IncomingLinks(View view) {
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
	public static List<EditormodelLinkDescriptor> getLevel_2001OutgoingLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<EditormodelLinkDescriptor> result = new LinkedList<EditormodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Path_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getObjective_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EditormodelLinkDescriptor> getCase_3002OutgoingLinks(View view) {
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
