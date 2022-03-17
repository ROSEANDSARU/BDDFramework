#Author: Manish.Kumar
Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "OrangeHRM"

Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "admin"
And user enters password "admin123"
And user clicks on Login button
Then user is on the welcome Window

