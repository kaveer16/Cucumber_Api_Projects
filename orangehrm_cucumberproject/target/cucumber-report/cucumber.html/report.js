$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user I should login orangehrmdemo website",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17329629900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User is on login page",
  "description": "",
  "id": "login;user-is-on-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I enter username \"Admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be able to see welcome text",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "OrangeStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 705893500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "OrangeStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 123601900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 4072039200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStepdefs.iShouldBeAbleToSeeWelcomeText()"
});
formatter.result({
  "duration": 162353600,
  "status": "passed"
});
formatter.after({
  "duration": 1012825700,
  "status": "passed"
});
formatter.uri("src/test/java/resources/featurefile/Logout/Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout",
  "description": "As a user I should logout orangehrmdemo website",
  "id": "logout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8515840500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User is on login page",
  "description": "",
  "id": "logout;user-is-on-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I enter username \"Admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Welcome button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Logout button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be able to see Login Panel text",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "OrangeStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 151824700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "OrangeStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 152181400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 3225021400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStepdefs.iClickOnWelcomeButton()"
});
formatter.result({
  "duration": 106119700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStepdefs.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 595765400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeStepdefs.iShouldBeAbleToSeeLoginPanelText()"
});
formatter.result({
  "duration": 57033600,
  "status": "passed"
});
formatter.after({
  "duration": 853406100,
  "status": "passed"
});
});