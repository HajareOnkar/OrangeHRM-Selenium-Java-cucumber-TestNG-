@LoginFunction @smoke @regression
Feature: Login finctionality

  @positive
  Scenario: User Login with valid credentials
    Given User navigate to OrangeHRM Login screen
    When User Enter valid  username "Admin" and password "admin123"
    And User clicks on Login button
    Then User navigate to home screen

  @negative
  Scenario Outline: User Login with invalid credentials
    Given User navigate to OrangeHRM Login screen
    When User enter <Username> username and <Password> password
    And User clicks on Login button
    Then User gives error message

    Examples: 
      | Username | Password    |
      | "Admin"  | "test12345" |
      | "test"   | "admin123"  |
      | "test"   | "test12345" |

  @negative
  Scenario Outline: User click on Login button without entering credentials
    Given User navigate to OrangeHRM Login screen
    When User enter <Username> username and <Password> password
    And User clicks on Login button
    Then User gives error message at username and password textbox

    Examples: 
      | Username | Password |
      | ""       | ""       |
