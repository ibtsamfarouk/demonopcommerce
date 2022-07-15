@smoke

Feature: F03_currencies | users can change the system currency
  Scenario: users can change the system currency successfully
    Given user selects Euro currency from the dropdown list on the top left of home page
    Then Euro Symbol € is shown on the 4 displayed products the in Home page
