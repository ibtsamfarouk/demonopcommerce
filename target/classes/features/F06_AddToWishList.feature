@smoke
Feature: F06_AddToWishList |user can add different products to Wishlist


  Scenario:	1-user can add different products to Wishlist
    Given user clicks on add to wish list button of HTC One M8 Android L 5.0 Lollipop from the home screen
    Then A message that the product was added to the wish list successfully will be displayed


  Scenario:	2-user can add different products to Wishlist
    Given user searches for a "HTC One M8 Android L 5.0 Lollipop" from the home screen
    Then The search result for search will be displayed
    And The user clicks on the first item to be in the product details page.
    And The user clicks on add to wishList button
    Then The name of the "HTC One M8 Android L 5.0 Lollipop" will be added to the wishlist with a quantity more than zero

