Feature: test gmail
Background: Login to application
 
Given Enter the "http://www.gmail.com" of the application
When Enter the username "admin"
When Enter the  password "admin123"
And Click Submit
Then Login Successful

@Smoke
Scenario: Compose mail
 When I enter to address
 When I enter subject
 When I enter body
 Then I click send
 
 @Regression @Smoke
 Scenario: Draft mail
 When I enter to address
 When I enter subject
 When I enter body
 Then I click save
 
