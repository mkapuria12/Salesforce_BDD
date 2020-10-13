$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/Salesforce.feature");
formatter.feature({
  "name": "Salesforce Login functionality test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is able to edit My Profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ui"
    }
  ]
});
formatter.step({
  "name": "I am logged in sucessfully",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qe.stepDef.HomepageTest.I_am_logged_in_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on user menu and click My profile option",
  "keyword": "When "
});
formatter.match({
  "location": "com.qe.stepDef.HomepageTest.i_click_on_user_menu_and_click_My_profile_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on edit profile button to edit contact information",
  "keyword": "And "
});
formatter.match({
  "location": "com.qe.stepDef.HomepageTest.i_click_on_edit_profile_button_to_edit_contact_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on About tab and enter Lastname and click on save all button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qe.stepDef.HomepageTest.i_click_on_About_tab_and_enter_Lastname_and_click_on_save_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate lastname whether it is saved or not",
  "keyword": "And "
});
formatter.match({
  "location": "com.qe.stepDef.HomepageTest.i_validate_lastname_whether_it_is_saved_or_not()"
});
formatter.result({
  "status": "passed"
});
});