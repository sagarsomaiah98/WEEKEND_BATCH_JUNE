Feature: Login with multiple login

Scenario Outline: Login with valid and invalid credentials

Given Launch the browser
And I enter the url
When I enter the username "<username>" and password "<password>"

When I clicked submit
Then I logged in successfully

Examples:
|username|password|
|john|password123|
|mark| mypass123|