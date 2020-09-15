$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Loginpage.feature");
formatter.feature({
  "name": "Verifying the Adactin functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adactin login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify msg",
  "keyword": "And "
});
formatter.step({
  "name": "User should Search the Hotels \"\u003clocation\u003e\" , \"\u003chotels\u003e\" , \"\u003cRoomType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the Search button",
  "keyword": "And "
});
formatter.step({
  "name": "User should Select the Radio button",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cbillingaddress\u003e\" , \"\u003ccreditcardno\u003e\" , \"\u003ccreditcardtype\u003e\" , \"\u003cexpirydateMonth\u003e\" , \"\u003cexpirydateyear\u003e\" ,\"\u003ccvvnumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the Booknow button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "RoomType",
        "firstname",
        "lastname",
        "billingaddress",
        "creditcardno",
        "creditcardtype",
        "expirydateMonth",
        "expirydateyear",
        "cvvnumber"
      ]
    },
    {
      "cells": [
        "gopigopigopi",
        "gopigopigopi",
        "Sydney",
        "Hotel Creek",
        "Double",
        "Gopi",
        "Nath",
        "Ambattur",
        "1587469831547456",
        "VISA",
        "January",
        "2021",
        "246"
      ]
    },
    {
      "cells": [
        "gopigopigopi",
        "gopigopigopi",
        "Sydney",
        "Hotel Creek",
        "Double",
        "Gopi",
        "Nath",
        "Ambattur",
        "1587469831547456",
        "VISA",
        "January",
        "2021",
        "246"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adactin login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"gopigopigopi\" and \"gopigopigopi\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify msg",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_verify_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should Search the Hotels \"Sydney\" , \"Hotel Creek\" , \"Double\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_Search_the_Hotels(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should Select the Radio button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_Select_the_Radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Gopi\" , \"Nath\" , \"Ambattur\" , \"1587469831547456\" , \"VISA\" , \"January\" , \"2021\" ,\"246\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Booknow button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_Booknow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying adactin login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"gopigopigopi\" and \"gopigopigopi\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify msg",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_verify_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should Search the Hotels \"Sydney\" , \"Hotel Creek\" , \"Double\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_Search_the_Hotels(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should Select the Radio button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_Select_the_Radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Gopi\" , \"Nath\" , \"Ambattur\" , \"1587469831547456\" , \"VISA\" , \"January\" , \"2021\" ,\"246\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Booknow button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_the_Booknow_button()"
});
formatter.result({
  "status": "passed"
});
});