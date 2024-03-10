#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login finctionality
@validCred
Scenario: User Login with valid credentials
Given User navigate to OrangeHRM Login screen
When User Enter valid  username "Admin" and password "admin123"
And User clicks on Login button
Then User navigate to home screen

@InvalidCred
Scenario: User Login with invalid credentials
Given User navigate to OrangeHRM Login screen
When User enter <Username> username and <Password> password
And User clicks on Login button
Then User gives error message

Examples:
|Username|Password|
|"Admin"|"test12345"|
|"test" | "admin123"|
|"test" |"test12345"|

Scenario: User click on Login button without entering credentials
Given User navigate to OrangeHRM Login screen
When User enter <Username> username and <Password> password
And User clicks on Login button
Then User gives error message at username and password textbox
Examples:
|Username|Password|
|""|""|
