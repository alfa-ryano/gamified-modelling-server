/*
* 
*/
package gamifiedmodelling.diagram.part;

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

import gamifiedmodelling.Case;
import gamifiedmodelling.Game;
import gamifiedmodelling.GamifiedmodellingPackage;
import gamifiedmodelling.Level;
import gamifiedmodelling.Objective;
import gamifiedmodelling.Path;
import gamifiedmodelling.diagram.edit.parts.CaseEditPart;
import gamifiedmodelling.diagram.edit.parts.GameEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelLevelCaseCompartmentEditPart;
import gamifiedmodelling.diagram.edit.parts.LevelLevelObjectivesCompartmentEditPart;
import gamifiedmodelling.diagram.edit.parts.ObjectiveEditPart;
import gamifiedmodelling.diagram.edit.parts.PathEditPart;
import gamifiedmodelling.diagram.providers.GamifiedmodellingElementTypes;

/**
 * @generated
 */
public class GamifiedmodellingDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<GamifiedmodellingNodeDescriptor> getSemanticChildren(View view) {
		switch (GamifiedmodellingVisualIDRegistry.getVisualID(view)) {
		case GameEditPart.VISUAL_ID:
			return getGame_1000SemanticChildren(view);
		case LevelLevelObjectivesCompartmentEditPart.VISUAL_ID:
			return getLevelLevelObjectivesCompartment_7001SemanticChildren(view);
		case LevelLevelCaseCompartmentEditPart.VISUAL_ID:
			return getLevelLevelCaseCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GamifiedmodellingNodeDescriptor> getGame_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Game modelElement = (Game) view.getElement();
		LinkedList<GamifiedmodellingNodeDescriptor> result = new LinkedList<GamifiedmodellingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLevels().iterator(); it.hasNext();) {
			Level childElement = (Level) it.next();
			int visualID = GamifiedmodellingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LevelEditPart.VISUAL_ID) {
				result.add(new GamifiedmodellingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GamifiedmodellingNodeDescriptor> getLevelLevelObjectivesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Level modelElement = (Level) containerView.getElement();
		LinkedList<GamifiedmodellingNodeDescriptor> result = new LinkedList<GamifiedmodellingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getObjectives().iterator(); it.hasNext();) {
			Objective childElement = (Objective) it.next();
			int visualID = GamifiedmodellingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ObjectiveEditPart.VISUAL_ID) {
				result.add(new GamifiedmodellingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GamifiedmodellingNodeDescriptor> getLevelLevelCaseCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Level modelElement = (Level) containerView.getElement();
		LinkedList<GamifiedmodellingNodeDescriptor> result = new LinkedList<GamifiedmodellingNodeDescriptor>();
		{
			Case childElement = modelElement.getCase();
			int visualID = GamifiedmodellingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new GamifiedmodellingNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GamifiedmodellingLinkDescriptor> getContainedLinks(View view) {
		switch (GamifiedmodellingVisualIDRegistry.getVisualID(view)) {
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
	public static List<GamifiedmodellingLinkDescriptor> getIncomingLinks(View view) {
		switch (GamifiedmodellingVisualIDRegistry.getVisualID(view)) {
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
	public static List<GamifiedmodellingLinkDescriptor> getOutgoingLinks(View view) {
		switch (GamifiedmodellingVisualIDRegistry.getVisualID(view)) {
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
	public static List<GamifiedmodellingLinkDescriptor> getGame_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getLevel_2001ContainedLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<GamifiedmodellingLinkDescriptor> result = new LinkedList<GamifiedmodellingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Path_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getObjective_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getCase_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getPath_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getLevel_2001IncomingLinks(View view) {
		Level modelElement = (Level) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GamifiedmodellingLinkDescriptor> result = new LinkedList<GamifiedmodellingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Path_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getObjective_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getCase_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getPath_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getLevel_2001OutgoingLinks(View view) {
		Level modelElement = (Level) view.getElement();
		LinkedList<GamifiedmodellingLinkDescriptor> result = new LinkedList<GamifiedmodellingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Path_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getObjective_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getCase_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GamifiedmodellingLinkDescriptor> getPath_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<GamifiedmodellingLinkDescriptor> getContainedTypeModelFacetLinks_Path_4001(
			Level container) {
		LinkedList<GamifiedmodellingLinkDescriptor> result = new LinkedList<GamifiedmodellingLinkDescriptor>();
		Path link = container.getPath();
		if (PathEditPart.VISUAL_ID != GamifiedmodellingVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Level dst = link.getNextLevel();
		Level src = link.getPrevLevel();
		result.add(new GamifiedmodellingLinkDescriptor(src, dst, link, GamifiedmodellingElementTypes.Path_4001,
				PathEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GamifiedmodellingLinkDescriptor> getIncomingTypeModelFacetLinks_Path_4001(Level target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GamifiedmodellingLinkDescriptor> result = new LinkedList<GamifiedmodellingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GamifiedmodellingPackage.eINSTANCE.getPath_NextLevel()
					|| false == setting.getEObject() instanceof Path) {
				continue;
			}
			Path link = (Path) setting.getEObject();
			if (PathEditPart.VISUAL_ID != GamifiedmodellingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Level src = link.getPrevLevel();
			result.add(new GamifiedmodellingLinkDescriptor(src, target, link, GamifiedmodellingElementTypes.Path_4001,
					PathEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GamifiedmodellingLinkDescriptor> getOutgoingTypeModelFacetLinks_Path_4001(Level source) {
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
		LinkedList<GamifiedmodellingLinkDescriptor> result = new LinkedList<GamifiedmodellingLinkDescriptor>();
		Path link = container.getPath();
		if (PathEditPart.VISUAL_ID != GamifiedmodellingVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Level dst = link.getNextLevel();
		Level src = link.getPrevLevel();
		if (src != source) {
			return result;
		}
		result.add(new GamifiedmodellingLinkDescriptor(src, dst, link, GamifiedmodellingElementTypes.Path_4001,
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

		public List<GamifiedmodellingNodeDescriptor> getSemanticChildren(View view) {
			return GamifiedmodellingDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GamifiedmodellingLinkDescriptor> getContainedLinks(View view) {
			return GamifiedmodellingDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GamifiedmodellingLinkDescriptor> getIncomingLinks(View view) {
			return GamifiedmodellingDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GamifiedmodellingLinkDescriptor> getOutgoingLinks(View view) {
			return GamifiedmodellingDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
