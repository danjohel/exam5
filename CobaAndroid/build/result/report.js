$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddToDoTask.feature");
formatter.feature({
  "name": "Add to do task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "See Statistic todo list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@jalan"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on to do list page",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.steps.ToDoStepDefinition.userIsOnToDoListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Navigate button",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps.ToDoStepDefinition.userClickOnNavigateButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see menu of Navigate button",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.steps.ToDoStepDefinition.userSeeMenuOfNavigateButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Statistics",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps.ToDoStepDefinition.userClickOnStatistics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see Statistic view",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.steps.ToDoStepDefinition.userSeeStatisticView()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});