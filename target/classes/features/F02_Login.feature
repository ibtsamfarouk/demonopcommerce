@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
  Given user goes to login page
  When user logs in with "valid" "test@example.com" and "P@ssw0rd"
    And user presses on the login button
    Then user logs in to the system successfully


  Scenario: user can't login with invalid email and password
    Given user goes to login page
    When user logs in with "invalid" "test@example.com" and "P@ssw0rd"
    And user presses on the login button
    Then user can not login to the system