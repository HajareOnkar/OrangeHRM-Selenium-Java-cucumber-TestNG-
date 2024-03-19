@passwordReset @smoke @regression
Feature: Password Reset function

  @pasitive
  Scenario: User sends password reset request
    Given User navigate to OrangeHRM Login screen
    When User lands on requestPasswordResetCode screen after clicking Forgot your password? link
    And User enter username and clicks on Reset password button
    Then User gets Reset Password link sent successfully message

  @negative
  Scenario: User try to send password reset request without password
    Given User navigate to OrangeHRM Login screen
    When User lands on requestPasswordResetCode screen after clicking Forgot your password? link
    And User clicks on Reset password button without entering filling username field
    Then User gets error message for username field

  @negative
  Scenario: User cancel password reset request
    Given User navigate to OrangeHRM Login screen
    When User lands on requestPasswordResetCode screen after clicking Forgot your password? link
    And User clicks on cancel button
    Then User lands on login screen.
