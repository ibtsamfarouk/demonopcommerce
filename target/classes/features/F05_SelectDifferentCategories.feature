@smoke
Feature: F05_SelectDifferentCategories |user can select different Categories

  Scenario Outline:	user can select different Categories
    Given user hovers on "<category>" on the top menu,The related sub menu will be opened and one of it's items will be selected

    Examples:
      |category|
      |Computers|
      |Electronics|
