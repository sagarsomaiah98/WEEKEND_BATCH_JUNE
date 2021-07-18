$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/Features/compose.feature");
formatter.feature({
  "line": 2,
  "name": "compose",
  "description": "",
  "id": "compose",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.before({
  "duration": 348400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Composing a mail",
  "description": "",
  "id": "compose;composing-a-mail",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click compose",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "mail sent",
  "keyword": "Then "
});
formatter.match({
  "location": "Compose_StepDefinition.the_credentials()"
});
formatter.result({
  "duration": 335258499,
  "status": "passed"
});
formatter.match({
  "location": "Compose_StepDefinition.i_click_compose()"
});
formatter.result({
  "duration": 81500,
  "status": "passed"
});
formatter.match({
  "location": "Compose_StepDefinition.mail_sent()"
});
formatter.result({
  "duration": 87001,
  "status": "passed"
});
formatter.after({
  "duration": 80700,
  "status": "passed"
});
formatter.before({
  "duration": 82400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "oneselft compose",
  "description": "",
  "id": "compose;oneselft-compose",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Full"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "To address",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter self",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I send",
  "keyword": "Then "
});
formatter.match({
  "location": "Compose_StepDefinition.to_address()"
});
formatter.result({
  "duration": 115701,
  "status": "passed"
});
formatter.match({
  "location": "Compose_StepDefinition.i_enter_self()"
});
formatter.result({
  "duration": 90400,
  "status": "passed"
});
formatter.match({
  "location": "Compose_StepDefinition.i_Send()"
});
formatter.result({
  "duration": 102700,
  "status": "passed"
});
formatter.after({
  "duration": 79100,
  "status": "passed"
});
formatter.before({
  "duration": 72600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Multiple select",
  "description": "",
  "id": "compose;multiple-select",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "multi select",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "multi details",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I send",
  "keyword": "Then "
});
formatter.match({
  "location": "Compose_StepDefinition.multi_select()"
});
formatter.result({
  "duration": 138699,
  "status": "passed"
});
formatter.match({
  "location": "Compose_StepDefinition.multi_details()"
});
formatter.result({
  "duration": 141700,
  "status": "passed"
});
formatter.match({
  "location": "Compose_StepDefinition.i_Send()"
});
formatter.result({
  "duration": 78401,
  "status": "passed"
});
formatter.after({
  "duration": 109400,
  "status": "passed"
});
});