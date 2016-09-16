// EXTENSION ------------------------------------

//Setup story and substory
var story = new Story(game);
story.name = "Extension Story 1";
story.description = "Extension Story 1.";

var subStory = new SubStory(game, story);
subStory.name = "Extension Sub Story 1";
subStory.description = "Extension Sub Story 1.";

// ----Set Up Level 1----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_001",
	"Level 01 - Extension Level 1");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(game,
	game.levels[iLevel], "Case_01", "Create a button!!!");
game.levels[iLevel].levelCase.addDraggableItem("button");

var objectiveLevel01 = new Objective(game, game.levels[iLevel],
	"objective_01", "Create an object with name 'button'");

game.levels[iLevel].modellingType = MODELLING_TYPE.OBJECT;
game.levels[iLevel].levelMode = "extension";

game.levels[iLevel].addObjective(objectiveLevel01);

subStory.levels.push(game.levels[iLevel]);

// ----Set Up Level 2----------------------------------------------------
iLevel += 1;
game.levels[iLevel] = new Level(game, "level_002",
	"Level 02 - Extension Level 2");
game.levels[iLevel].isSequel = false;
game.levels[iLevel].levelCase = new LevelCase(game, game.levels[iLevel],
	"Case_01", "Create two buttons: <br/> <strong>button 1</strong> and <strong>button 2</strong> !!!");

game.levels[iLevel].levelCase.addDraggableItem("button 1");
game.levels[iLevel].levelCase.addDraggableItem("button 2");

game.levels[iLevel].modellingType = MODELLING_TYPE.OBJECT;
game.levels[iLevel].levelMode = "extension";

var objectiveLevel02_1 = new Objective(game, game.levels[iLevel],
	"objective_01", "Create an object named 'button 1'!");
var objectiveLevel02_2 = new Objective(game, game.levels[iLevel],
	"objective_02", "Create an object named 'button 2'!");

game.levels[iLevel].addObjective(objectiveLevel02_1);
game.levels[iLevel].addObjective(objectiveLevel02_2);

subStory.levels.push(game.levels[iLevel]);

//-----------------------------------------------------------------------

//set other stories and substories
var subStory = new SubStory(game, story);
subStory.name = "Extension Sub Story 2 (Coming Soon)";
subStory.description = "Extension Sub Story 2 (Coming Soon).";
