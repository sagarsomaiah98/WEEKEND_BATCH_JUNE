Feature: Login CRM 

Scenario: Valid Login functionality of CRM application
Given Chrome browser is launched
And I enter the url of the application
When I enter the username and password
And I click submit
Then I logged in successfully
