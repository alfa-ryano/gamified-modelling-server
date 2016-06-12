// MAIN ------------------------------------
try {
	var game = new Game();
	game.mode = "DEVELOPMENT";
	game.currentLevel = 0;
	var iLevel = 0;

	// ----Set Up Level 1----------------------------------------------------
	game.levels[iLevel] = new Level(game, "level_001",
			"Level 01 - Object Modelling: Create a Single Object");
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
			"If a <b>greet button</b> is pressed then a <b>greet label</b> will display " +
			"\"Hello, [name]!\", with [name] is the text " +
			"inside a <b>name textbox</b>. The textbox has a <b>name label</b>. If " +
			"a <b>clear button</b> is pressed then the <b>greet label</b> will be cleared.");

	game.levels[iLevel].levelCase.addDraggableItem("greet button");
	game.levels[iLevel].levelCase.addDraggableItem("clear button");
	game.levels[iLevel].levelCase.addDraggableItem("name label");
	game.levels[iLevel].levelCase.addDraggableItem("greet label");
	game.levels[iLevel].levelCase.addDraggableItem("name textbox");

	var objectiveLevel05_1 = new Objective(game, game.levels[iLevel],
			"objective_01", "Create four links between objects that probably have relationships");

	game.levels[iLevel].addObjective(objectiveLevel05_1);
	// ---Execute Game---------------------------------------------------------
	game.run();
} catch (error) {
	alert(error.message);
}
