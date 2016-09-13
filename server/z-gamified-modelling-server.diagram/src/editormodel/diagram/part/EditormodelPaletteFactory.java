
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
		paletteContainer.add(createDraggableItem1CreationTool());
		paletteContainer.add(createLevel2CreationTool());
		paletteContainer.add(createLevelCase3CreationTool());
		paletteContainer.add(createObjective4CreationTool());
		paletteContainer.add(createStory5CreationTool());
		paletteContainer.add(createSubStory6CreationTool());
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
	private ToolEntry createDraggableItem1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DraggableItem1CreationTool_title,
				Messages.DraggableItem1CreationTool_desc,
				Collections.singletonList(EditormodelElementTypes.DraggableItem_3005));
		entry.setId("createDraggableItem1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.DraggableItem_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLevel2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Level2CreationTool_title,
				Messages.Level2CreationTool_desc, Collections.singletonList(EditormodelElementTypes.Level_3002));
		entry.setId("createLevel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Level_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLevelCase3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LevelCase3CreationTool_title,
				Messages.LevelCase3CreationTool_desc,
				Collections.singletonList(EditormodelElementTypes.LevelCase_3004));
		entry.setId("createLevelCase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.LevelCase_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObjective4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Objective4CreationTool_title,
				Messages.Objective4CreationTool_desc,
				Collections.singletonList(EditormodelElementTypes.Objective_3003));
		entry.setId("createObjective4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Objective_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStory5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Story5CreationTool_title,
				Messages.Story5CreationTool_desc, Collections.singletonList(EditormodelElementTypes.Story_2001));
		entry.setId("createStory5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.Story_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSubStory6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SubStory6CreationTool_title,
				Messages.SubStory6CreationTool_desc, Collections.singletonList(EditormodelElementTypes.SubStory_3001));
		entry.setId("createSubStory6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EditormodelElementTypes.getImageDescriptor(EditormodelElementTypes.SubStory_3001));
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
