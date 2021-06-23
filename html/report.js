$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Software/BDDFramework/src/test/java/feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Simple Hard coded scenario"
    }
  ],
  "line": 3,
  "name": "Nopecommerce Login Test",
  "description": "",
  "id": "nopcommerce-login;nopecommerce-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_login_page()"
});
formatter.result({
  "duration": 10647987000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Title_of_login_page()"
});
formatter.result({
  "duration": 13477400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 409797100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 571723900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 21312200,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...pCommerce demo store[]\u003e but was:\u003c...pCommerce demo store[. Login]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.LoginStepDefinition.user_is_on_homepage(LoginStepDefinition.java:70)\r\n\tat ✽.Then User is on homepage(D:/Software/BDDFramework/src/test/java/feature/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});