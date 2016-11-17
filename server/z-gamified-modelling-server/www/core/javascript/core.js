// MAIN ------------------------------------

var game = new Game();

// the Real level displayed is always plus one (+1)
game.currentLevel = 0;
var iLevel = 0;

// Setup story and substory
var story = new Story(game);
story.name = "ObjectModel";
story.description = "Object Modelling";

var subStory = new SubStory(game, story);
subStory.name = "HelloWorld";
subStory.description = "Hello World!!!";

// ----Set Up Level 1----------------------------------------------------
game.levels[iLevel] = new Level(game, "level_001",
		"Level 01 - Object Modelling: Create a Single Object");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(game, game.levels[iLevel],
		"Case_01", "Create a button!!!");
game.levels[iLevel].levelCase.addDraggableItem("button");

var objectiveLevel01 = new Objective(game, game.levels[iLevel], "objective_01",
		"Create an object with name 'button'");

game.levels[iLevel].modellingType = MODELLING_TYPE.OBJECT;

game.levels[iLevel].addObjective(objectiveLevel01);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 2----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_002",
		"Level 02 - Object Modelling: Create Two Objects");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_01",
		"Create two buttons: <br/> <strong>button 1</strong> and <strong>button 2</strong> !!!");

game.levels[iLevel].levelCase.addDraggableItem("button 1");
game.levels[iLevel].levelCase.addDraggableItem("button 2");

game.levels[iLevel].modellingType = MODELLING_TYPE.OBJECT;

var objectiveLevel02_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Create an object named 'button 1'!");
var objectiveLevel02_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Create an object named 'button 2'!");

game.levels[iLevel].addObjective(objectiveLevel02_1);
game.levels[iLevel].addObjective(objectiveLevel02_2);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 3----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_003",
		"Level 03 - Object Modelling: Create multiple objects");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(game, game.levels[iLevel],
		"Case_03", "Create two buttons:<br/>"
				+ "greet button and clear button!<br/>"
				+ "Create two labels as well:<br/>"
				+ "name label and greet label!<br/>" + "Add name textbox!");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var objectiveLevel03_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Create two button objects");
var objectiveLevel03_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Create two label objects");
var objectiveLevel03_3 = new Objective(game, game.levels[iLevel],
		"objective_03", "Create one textbox object");

game.levels[iLevel].addObjective(objectiveLevel03_1);
game.levels[iLevel].addObjective(objectiveLevel03_2);
game.levels[iLevel].addObjective(objectiveLevel03_3);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 4----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_004",
		"Level 04 - Object Modelling: Create multiple objects");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_04",
		"If <strong>greet button</strong> is pressed then <strong>greet label</strong> "
				+ "will display 'Hello!'<br/><br/>"
				+ "Create a link between objects that probably have a relationship!");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var objectiveLevel04_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Greet button must exist");
var objectiveLevel04_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Greet label must exist");
var objectiveLevel04_3 = new Objective(game, game.levels[iLevel],
		"objective_03", "Create a link between the intended objects");

game.levels[iLevel].addObjective(objectiveLevel04_1);
game.levels[iLevel].addObjective(objectiveLevel04_2);
game.levels[iLevel].addObjective(objectiveLevel04_3);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 5----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_005",
		"Level 05 - Object Modelling: Create multiple links");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_05",
		"If a <strong>greet button</strong> is pressed then a <strong>greet label</strong> will display "
				+ "\"Hello, name!\", with 'name' is the text "
				+ "of a <strong>name textbox</strong>. The textbox has a <strong>name label</strong>. If "
				+ "a <strong>clear button</strong> is pressed then the <strong>greet label</strong> will be cleared.");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var objectiveLevel05_1 = new Objective(game, game.levels[iLevel],
		"objective_01",
		"Create four links between objects that probably have relationships");

game.levels[iLevel].addObjective(objectiveLevel05_1);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 6----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_006",
		"Level 06 - Object Modelling: Determine a slot and its value");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_06",
		"The <strong>name label</strong> has a <strong>slot text</strong> with text \"Name\"");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

var objectiveLevel06_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Create a slot text in its respective object");

game.levels[iLevel].addObjective(objectiveLevel06_1);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 7----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_007",
		"Level 07 - Object Modelling: Determine multiple slots and their values");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_07",
		"A <strong>greet button</strong> has a <strong>text \"Greet\"</strong>. "
				+ "A <strong>clear button</strong> has a <strong>text \"Clear\"</strong>. "
				+ "User types the text of his/her name into a <strong>name textbox</strong>. "
				+ "At first, a <strong>greet label</strong> has no text but after the greet button is clicked, "
				+ "it displays <strong>\"Hello, name!\"</strong> with name according to the text inside the name textbox. "
				+ "The textbox's text is editable");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Name\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Greet\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Greet\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Clear\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Clear\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("editable = true");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

var objectiveLevel07_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Every object has slots");

game.levels[iLevel].addObjective(objectiveLevel07_1);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 8----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_008",
		"Level 08 - Object Modelling: Determine the operations");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(game, game.levels[iLevel],
		"Case_08", "All buttons can be <strong>clicked</strong>");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Name\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Greet\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Greet\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Clear\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Clear\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("editable = true");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

item = game.levels[iLevel].levelCase.addDraggableItem("clicked");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clicked";

var objectiveLevel08_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Create an operation for each button object");

game.levels[iLevel].addObjective(objectiveLevel08_1);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 9----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_009",
		"Level 09 - Object Modelling: Determine the operations");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_09",
		"At first, greet label has no text but after the greet button is clicked, "
				+ "the greet label will <strong>display</strong> \"Hello, [name]!\" with name according to "
				+ "the text inputted into the name textbox. If clear button is clicked, "
				+ "greet label will <strong>clear</strong> its text.");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Name\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Greet\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Greet\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Clear\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Clear\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("editable = true");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

item = game.levels[iLevel].levelCase.addDraggableItem("clicked");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clicked";
item = game.levels[iLevel].levelCase.addDraggableItem("display");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "display";
item = game.levels[iLevel].levelCase.addDraggableItem("clear");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clear";

var objectiveLevel09_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Create two operations for greet label");

game.levels[iLevel].addObjective(objectiveLevel09_1);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 10----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_010",
		"Level 10 - Object Modelling: Determine the operations");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_10",
		"There are two buttons in the diagram. You can classify them"
				+ " into one single class since they belong to the one same concept, "
				+ "<strong>Button</strong>. They also have the same slot (text) and "
				+ "operation (clicked).");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Name\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Greet\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Greet\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Clear\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Clear\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("editable = true");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

item = game.levels[iLevel].levelCase.addDraggableItem("clicked");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clicked";
item = game.levels[iLevel].levelCase.addDraggableItem("display");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "display";
item = game.levels[iLevel].levelCase.addDraggableItem("clear");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clear";

item = game.levels[iLevel].levelCase.addDraggableItem("Button");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "button";

var objectiveLevel10_1 = new Objective(game, game.levels[iLevel],
		"objective_01", " Define the class of the two button objects.");

game.levels[iLevel].addObjective(objectiveLevel10_1);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 11----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_011",
		"Level 11 - Object Modelling: Determine the classes of heterogeneous objects");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_11",
		"There are two other classes that can be added to the diagram,"
				+ "<strong>Textbox</strong> and <strong>Label</strong> classes. "
				+ "Add them to their respective objects.</br></br>Beware that objects with "
				+ "the same class require to have the same slots and operations.");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Name\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Greet\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Greet\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Clear\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Clear\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("editable = true");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

item = game.levels[iLevel].levelCase.addDraggableItem("clicked");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clicked";
item = game.levels[iLevel].levelCase.addDraggableItem("display");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "display";
item = game.levels[iLevel].levelCase.addDraggableItem("clear");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clear";

item = game.levels[iLevel].levelCase.addDraggableItem("Button");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "button";
item = game.levels[iLevel].levelCase.addDraggableItem("TextBox");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "textbox";
item = game.levels[iLevel].levelCase.addDraggableItem("Label");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "label";

var objectiveLevel11_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Put TextBox class to its objects");
var objectiveLevel11_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Put Label class to its objects");

game.levels[iLevel].addObjective(objectiveLevel11_1);
game.levels[iLevel].addObjective(objectiveLevel11_2);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 12----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_012",
		"Level 12 -  Reconstruct the model from the beginning");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_12",
		"Reconstruct the previous model from the beginning! Watch this video."
				+ "<video width='240' height='180' controls autoplay loop>"
				+ "<source src='common/resource/level_012.mp4' type='video/mp4'>"
				+ "Your browser does not support HTML5 video." + "</video>");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("clear button");
game.levels[iLevel].levelCase.addDraggableItem("name label");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
game.levels[iLevel].levelCase.addDraggableItem("name textbox");

var item = null;
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Name\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Greet\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Greet\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"Clear\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"Clear\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "text";
item.value = "\"\"";
item.valueType = "String";
item = game.levels[iLevel].levelCase.addDraggableItem("editable = true");
item.type = DRAGGABLE_ITEM_TYPE.SLOT;
item.name = "editable";
item.value = "true";
item.valueType = "boolean";

item = game.levels[iLevel].levelCase.addDraggableItem("clicked");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clicked";
item = game.levels[iLevel].levelCase.addDraggableItem("display");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "display";
item = game.levels[iLevel].levelCase.addDraggableItem("clear");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "clear";

item = game.levels[iLevel].levelCase.addDraggableItem("Button");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "button";
item = game.levels[iLevel].levelCase.addDraggableItem("TextBox");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "textbox";
item = game.levels[iLevel].levelCase.addDraggableItem("Label");
item.type = DRAGGABLE_ITEM_TYPE.CLASS;
item.name = "label";

var objectiveLevel12_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Reconstruct the previous model from the beginning");

game.levels[iLevel].addObjective(objectiveLevel12_1);

subStory.levels.push(game.levels[iLevel]);

// set other stories and substories
var subStory = new SubStory(game, story);
subStory.name = "CreateLoginScreen";
subStory.description = "Create Login Screen (Coming Soon)";

// --- COLLABORATION MODELLING ----------------------------------------------

var story = new Story(game);
story.name = "CollaborationModel";
story.description = "Collaboration Modelling";
var subStory = new SubStory(game, story);
subStory.name = "CollaboratingHelloWorld";
subStory.description = "Collaborating \"Hello, World!!!\" (Coming Soon)";

// ----Set Up Level 1----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_013",
		"Level 13 - Collaboration Modelling: Create a Single Object");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(game, game.levels[iLevel],
		"Case_01", "Create a button!!!");
game.levels[iLevel].levelCase.addDraggableItem("button");

var objectiveLevel01 = new Objective(game, game.levels[iLevel], "objective_01",
		"Create an object with name 'button'");

game.levels[iLevel].modellingType = MODELLING_TYPE.COLLABORATION;

game.levels[iLevel].addObjective(objectiveLevel01);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 2----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_014",
		"Level 14 - Collaboration Modelling: Create Two Objects");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_01",
		"Create two buttons: <br/> <strong>button 1</strong> and <strong>button 2</strong> !!!");

game.levels[iLevel].levelCase.addDraggableItem("button 1");
game.levels[iLevel].levelCase.addDraggableItem("button 2");

game.levels[iLevel].modellingType = MODELLING_TYPE.COLLABORATION;

var objectiveLevel02_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Create an object named 'button 1'!");
var objectiveLevel02_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Create an object named 'button 2'!");

game.levels[iLevel].addObjective(objectiveLevel02_1);
game.levels[iLevel].addObjective(objectiveLevel02_2);

subStory.levels.push(game.levels[iLevel]);

// --- COLLABORATION MODELLING ----------------------------------------------

var story = new Story(game);
story.name = "ObjectAndCollaborationModelling";
story.description = "Object and Collaboration Modelling";
var subStory = new SubStory(game, story);
subStory.name = "CollaborationThatSatisfyObjectModels";
subStory.description = "Collaboration that Satisfy Object Models";

// ----Set Up Level 1----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_015",
		"Level 15 - Collaboration that Satisfy Object Models");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_01",
		"If <strong>greet button</strong> is pressed then <strong>greet label</strong> "
				+ "will display 'Hello!'. Create a message between objects that probably have a relationship and satisfy the object diagram below!<br/><br/>"
				+ "<img src='common/resource/level_015.png' alt='object diagram' style='width:240px'>");

game.levels[iLevel].levelCase.addDraggableItem("greet button");
game.levels[iLevel].levelCase.addDraggableItem("greet label");
item = game.levels[iLevel].levelCase.addDraggableItem("greet");
item.type = DRAGGABLE_ITEM_TYPE.OPERATION;
item.name = "greet";

game.levels[iLevel].modellingType = MODELLING_TYPE.COLLABORATION;

var objectiveLevel04_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "Greet button must exist");
var objectiveLevel04_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Greet label must exist");
var objectiveLevel04_3 = new Objective(game, game.levels[iLevel],
		"objective_03", "Create a message between the intended objects");

game.levels[iLevel].addObjective(objectiveLevel04_1);
game.levels[iLevel].addObjective(objectiveLevel04_2);
game.levels[iLevel].addObjective(objectiveLevel04_3);

subStory.levels.push(game.levels[iLevel]);


// --- CLASS MODELLING ----------------------------------------------

var story = new Story(game);
story.name = "ClassModelling";
story.description = "Class Modelling";
var subStory = new SubStory(game, story);
subStory.name = "ClassModels";
subStory.description = "Class Modelling";

// ----Set Up Level 1----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_016",
		"Level 16 - Class Modelling");
game.levels[iLevel].isSequel = true;
game.levels[iLevel].levelCase = new LevelCase(
		game,
		game.levels[iLevel],
		"Case_01",
		"Create <b>TextBox</b> and <b>Label</b> classes and a <b>relationship</b> between them. " +
		"TextBox has a <b>'clear'</b> method and each class has a <b>'text'</b> attribute.");

item = game.levels[iLevel].levelCase.addDraggableItem("TextBox");
item.name = "TextBox";
item.type = DRAGGABLE_ITEM_TYPE.CLASS;

item = game.levels[iLevel].levelCase.addDraggableItem("Label");
item.name = "Label";
item.type = DRAGGABLE_ITEM_TYPE.CLASS;

item = game.levels[iLevel].levelCase.addDraggableItem("clear");
item.name = "clear";
item.type = DRAGGABLE_ITEM_TYPE.METHOD;

item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.name = "text1";
item.type = DRAGGABLE_ITEM_TYPE.ATTRIBUTE;
item.value = "";

item = game.levels[iLevel].levelCase.addDraggableItem("text = \"\"");
item.name = "text2";
item.type = DRAGGABLE_ITEM_TYPE.ATTRIBUTE;
item.value = "";

game.levels[iLevel].modellingType = MODELLING_TYPE.CLASS;

var objectiveLevel16_1 = new Objective(game, game.levels[iLevel],
		"objective_01", "TextBox class must exist");
var objectiveLevel16_2 = new Objective(game, game.levels[iLevel],
		"objective_02", "Label class must exist");
var objectiveLevel16_3 = new Objective(game, game.levels[iLevel],
		"objective_03", "A relationship between TextBox and Label classes must exist");

game.levels[iLevel].addObjective(objectiveLevel16_1);
game.levels[iLevel].addObjective(objectiveLevel16_2);
game.levels[iLevel].addObjective(objectiveLevel16_3);

subStory.levels.push(game.levels[iLevel]);
