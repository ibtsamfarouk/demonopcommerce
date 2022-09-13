@smoke
Feature: F04_search |user could search using product name and sku

  Scenario Outline:	user could search using product name
  When user types "<search_word>" in the search field and clicks search button
  Then The search result for search with "<search_word>" will be displayed

Examples:
|search_word|
|book|
|laptop|
|nike|




  Scenario Outline:	user could search for product using sku
  When user types "<search_word_sku>" in the search field and clicks search button
  Then The search result for searching with "<search_word_sku>" will be displayed

Examples:
|search_word_sku|
|SCI_FAITH|
|APPLE_CAM|
|SF_PRO_11|