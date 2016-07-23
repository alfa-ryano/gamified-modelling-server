
/*
 * 
 */
package editormodel.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import editormodel.diagram.providers.EditormodelElementTypes;

/**
 * @generated
 */
public class EditormodelPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCase1CreationTool());
		paletteContainer.add(createLevel2CreationTool());
		paletteContainer.add(createObjective3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createPath1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCase1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Case1CreationTool_title,
				Messages.Case1CreationTool_desc, Collections.singletonList(EditormodelElementTypes.Case_3002));
		entry.setId("createCase1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Case_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLevel2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Level2CreationTool_title,
				Messages.Level2CreationTool_desc, Collections.singletonList(EditormodelElementTypes.Level_2001));
		entry.setId("createLevel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Level_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObjective3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Objective3CreationTool_title,
				Messages.Objective3CreationTool_desc,
				Collections.singletonList(EditormodelElementTypes.Objective_3001));
		entry.setId("createObjective3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Objective_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPath1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Path1CreationTool_title,
				Messages.Path1CreationTool_desc, Collections.singletonList(EditormodelElementTypes.Path_4001));
		entry.setId("createPath1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Path_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
