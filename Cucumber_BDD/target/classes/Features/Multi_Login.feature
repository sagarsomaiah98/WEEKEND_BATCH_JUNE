Feature: Multiple Login CRM 

Scenario Outline: Valid Login functionality of CRM application
Given Chrome browser is launched
And I enter the url "https://orangehrm.login" of the application
When I enter the username "<uname>"  and password "<pwd>"
And I click submit
Then I logged in successfully
Examples:

|uname|pwd|
|Admin|admin123|
|john|john123|
|henry|hnery|
|jake|jake456|
|bob|bob123|
