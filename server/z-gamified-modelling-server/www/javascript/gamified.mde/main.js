// MAIN ------------------------------------
try {
	var game = new Game();
	game.mode = "DEVELOPMENT";
	game.currentLevel = 8;
	var iLevel = 0;

	// ----Set Up Level 1----------------------------------------------------
	game.levels[iLevel] = new Level(game, "level_001",
			"Level 01 - Object Modelling: Create a Single Object");
	game.levels[iLevel].isSequel = false;
	game.levels[iLevel].levelCase = new Case(game,
			game.levels[iLevel], "Case_01", "Create a button!!!");
	game.levels[iLevel].levelCase.addDraggableItem("button");

	var objectiveLevel01 = new Objective(game, game.levels[iLevel],
			"objective_01", "Create an object with name 'button'");

	game.levels[iLevel].addObjective(objectiveLevel01);

	// ----Set Up Level 2----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_002",
			"Level 02 - Object Modelling: Create Two Objects");
	game.levels[iLevel].isSequel = false;
	game.levels[iLevel].levelCase = new Case(game, game.levels[iLevel],
			"Case_01", "Create two buttons: <br/> button 1 and button 2 !!!");

	game.levels[iLevel].levelCase.addDraggableItem("button 1");
	game.levels[iLevel].levelCase.addDraggableItem("button 2");

	var objectiveLevel02_1 = new Objective(game, game.levels[iLevel],
			"objective_01", "Create an object named 'button 1'!");

	game.levels[iLevel].addObjective(objectiveLevel02_1);

	var objectiveLevel02_2 = new Objective(game, game.levels[iLevel],
			"objective_02", "Create an object named 'button 2'!");

	game.levels[iLevel].addObjective(objectiveLevel02_2);

	// ----Set Up Level 3----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_003",
			"Level 03 - Object Modelling: Create multiple objects");
	game.levels[iLevel].isSequel = false;
	game.levels[iLevel].levelCase = new Case(game, game.levels[iLevel], "Case_03",
			"Create two buttons:<br/>" + "greet button and clear button!<br/>"
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

	// ----Set Up Level 4----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_004",
			"Level 04 - Object Modelling: Create multiple objects");
	game.levels[iLevel].isSequel = true;
	game.levels[iLevel].levelCase = new Case(
			game,
			game.levels[iLevel],
			"Case_04",
			"If greet button is pressed then greet label will display 'Hello!'<br/>"
					+ "Create a link between objects that probably have a relationship!");

	game.levels[iLevel].levelCase.addDraggableItem("greet button");
	game.levels[iLevel].levelCase.addDraggableItem("clear button");
	game.levels[iLevel].levelCase.addDraggableItem("name label");
	game.levels[iLevel].levelCase.addDraggableItem("greet label");
	game.levels[iLevel].levelCase.addDraggableItem("name textbox");

	var objectiveLevel04_1 = new Objective(game, game.levels[iLevel],
			"objective_01", "Create a link between the intended objects");

	game.levels[iLevel].addObjective(objectiveLevel04_1);

	// ----Set Up Level 5----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_005",
			"Level 05 - Object Modelling: Create multiple links");
	game.levels[iLevel].isSequel = true;
	game.levels[iLevel].levelCase = new Case(
			game,
			game.levels[iLevel],
			"Case_05",
			"If a <strong>greet button</strong> is pressed then a <strong>greet label</strong> will display " +
			"\"Hello, name!\", with 'name' is the text " +
			"of a <strong>name textbox</strong>. The textbox has a <strong>name label</strong>. If " +
			"a <strong>clear button</strong> is pressed then the <strong>greet label</strong> will be cleared.");

	game.levels[iLevel].levelCase.addDraggableItem("greet button");
	game.levels[iLevel].levelCase.addDraggableItem("clear button");
	game.levels[iLevel].levelCase.addDraggableItem("name label");
	game.levels[iLevel].levelCase.addDraggableItem("greet label");
	game.levels[iLevel].levelCase.addDraggableItem("name textbox");

	var objectiveLevel05_1 = new Objective(game, game.levels[iLevel],
			"objective_01", "Create four links between objects that probably have relationships");

	game.levels[iLevel].addObjective(objectiveLevel05_1);
	
	// ----Set Up Level 6----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_006",
			"Level 06 - Object Modelling: Determine a slot and its value");
	game.levels[iLevel].isSequel = true;
	game.levels[iLevel].levelCase = new Case(
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
	
	// ----Set Up Level 7----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_007",
			"Level 07 - Object Modelling: Determine multiple slots and their values");
	game.levels[iLevel].isSequel = true;
	game.levels[iLevel].levelCase = new Case(
			game,
			game.levels[iLevel],
			"Case_07",
			"A <strong>greet button</strong> has a <strong>text \"Greet\"</strong>. " +
			"A <strong>clear button</strong> has a <strong>text \"Clear\"</strong>. " +
			"User types the text of his/her name into a <strong>name textbox</strong>. " +
			"At first, a <strong>greet label</strong> has no text but after the greet button is clicked, " +
			"it displays <strong>\"Hello, name!\"</strong> with name according to the text inside the name textbox. " +
			"The textbox's text is editable");

	game.levels[iLevel].levelCase.addDraggableItem("greet button");
	game.levels[iLevel].levelCase.addDraggableItem("clear button");
	game.levels[iLevel].levelCase.addDraggableItem("name label");
	game.levels[iLevel].levelCase.addDraggableItem("greet label");
	game.levels[iLevel].levelCase.addDraggableItem("name textbox");
	
	var item = null;
	item  = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
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
	
	// ----Set Up Level 8----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_008",
			"Level 08 - Object Modelling: Determine the operations");
	game.levels[iLevel].isSequel = true;
	game.levels[iLevel].levelCase = new Case(
			game,
			game.levels[iLevel],
			"Case_08",
			"All buttons can be <strong>clicked</strong>");

	game.levels[iLevel].levelCase.addDraggableItem("greet button");
	game.levels[iLevel].levelCase.addDraggableItem("clear button");
	game.levels[iLevel].levelCase.addDraggableItem("name label");
	game.levels[iLevel].levelCase.addDraggableItem("greet label");
	game.levels[iLevel].levelCase.addDraggableItem("name textbox");
	
	var item = null;
	item  = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
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
	
	
	// ----Set Up Level 9----------------------------------------------------
	iLevel += 1;
	game.levels[iLevel] = new Level(game, "level_009",
			"Level 09 - Object Modelling: Determine the operations");
	game.levels[iLevel].isSequel = true;
	game.levels[iLevel].levelCase = new Case(
			game,
			game.levels[iLevel],
			"Case_09",
			"At first, greet label has no text but after the greet button is clicked, " +
			"it will <strong>display</strong> \"Hello, [name]!\" with name according to " +
			"the text inputted into the name textbox. If clear button is clicked, " +
			"greet button will <strong>clear</strong> its text.");

	game.levels[iLevel].levelCase.addDraggableItem("greet button");
	game.levels[iLevel].levelCase.addDraggableItem("clear button");
	game.levels[iLevel].levelCase.addDraggableItem("name label");
	game.levels[iLevel].levelCase.addDraggableItem("greet label");
	game.levels[iLevel].levelCase.addDraggableItem("name textbox");
	
	var item = null;
	item  = game.levels[iLevel].levelCase.addDraggableItem("text = \"Name\"");
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
	
	// ---Execute Game---------------------------------------------------------
	game.run();
} catch (error) {
	alert(error.message);
}
