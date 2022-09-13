@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user goes to register page
    When user selects the gender type
    And user enters first name "automation" and last name "tester"
    And user enters date of birth
    And user enters email "test@example.com" field
    And user fills Password fields "P@ssw0rd"
    And user clicks on register button
    Then A success message will be displayed