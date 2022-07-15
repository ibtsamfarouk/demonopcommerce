@smoke
Feature: F07_AddToCompare |user can add two products to compare them

  Scenario Outline:	user can add two products to compare them
    When user types "<first_Product_name>" in the search field and clicks search button
    Then The search result appears and the user selects one of the search results
    And  The user clicks on addToCompare button
    Then user types "<second_Product_name>" in the search field and clicks search button
    Then The search result appears and the user selects one of the search results
    And  The user clicks on addToCompare button
    Then The user navigates to the compare page to compare between the two added products
    Examples:
      |first_Product_name|second_Product_name|
      |Apple MacBook Pro 13-inch|Build your own computer|