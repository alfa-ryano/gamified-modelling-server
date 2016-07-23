/*
 * 
 */
package editormodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import editormodel.EditormodelPackage;
import editormodel.diagram.edit.parts.CaseEditPart;
import editormodel.diagram.edit.parts.GameEditPart;
import editormodel.diagram.edit.parts.LevelEditPart;
import editormodel.diagram.edit.parts.ObjectiveEditPart;
import editormodel.diagram.edit.parts.PathEditPart;
import editormodel.diagram.part.EditormodelDiagramEditorPlugin;

/**
 * @generated
 */
public class EditormodelElementTypes {

	/**
	* @generated
	*/
	private EditormodelElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			EditormodelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Game_1000 = getElementType("z-gamified-modelling-server.diagram.Game_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Level_2001 = getElementType("z-gamified-modelling-server.diagram.Level_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Objective_3001 = getElementType(
			"z-gamified-modelling-server.diagram.Objective_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3002 = getElementType("z-gamified-modelling-server.diagram.Case_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Path_4001 = getElementType("z-gamified-modelling-server.diagram.Path_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Game_1000, EditormodelPackage.eINSTANCE.getGame());

			elements.put(Level_2001, EditormodelPackage.eINSTANCE.getLevel());

			elements.put(Objective_3001, EditormodelPackage.eINSTANCE.getObjective());

			elements.put(Case_3002, EditormodelPackage.eINSTANCE.getCase());

			elements.put(Path_4001, EditormodelPackage.eINSTANCE.getPath());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Game_1000);
			KNOWN_ELEMENT_TYPES.add(Level_2001);
			KNOWN_ELEMENT_TYPES.add(Objective_3001);
			KNOWN_ELEMENT_TYPES.add(Case_3002);
			KNOWN_ELEMENT_TYPES.add(Path_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GameEditPart.VISUAL_ID:
			return Game_1000;
		case LevelEditPart.VISUAL_ID:
			return Level_2001;
		case ObjectiveEditPart.VISUAL_ID:
			return Objective_3001;
		case CaseEditPart.VISUAL_ID:
			return Case_3002;
		case PathEditPart.VISUAL_ID:
			return Path_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return editormodel.diagram.providers.EditormodelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return editormodel.diagram.providers.EditormodelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return editormodel.diagram.providers.EditormodelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
