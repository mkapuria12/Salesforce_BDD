Feature: Salesforce Login functionality test


@ui
Scenario: User is able to edit My Profile 

Given I am logged in sucessfully
When I click on user menu and click My profile option
And I click on edit profile button to edit contact information
Then I click on About tab and enter Lastname and click on save all button
And I validate lastname whether it is saved or not

#Scenario: User is able to post in My Profile 

#When I click on post link 
#And I enter the text in the post text area and click on share button
#Then I validate the post

#Scenario: User is able to upload a file in My Profile

#When I click on the file link 
#And I click on upload a file from computer button
#And I click on choose file button and select a file to be uploaded and click open button.
#Then I validate the file is uploaded




