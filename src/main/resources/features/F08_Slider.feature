@smoke
Feature: F07_Slider |Navigation after clicking on Slider images.

  Scenario:  The page should be navigated after clicking on the first image in the slider.
    Given The user clicks on the first image on the slider.
    Then The page should be navigated to the expected URL "https://demo.nopcommerce.com/nokia-lumia-1020"


  Scenario:  The page should be navigated after clicking on the second image in the slider.
    Given The user clicks on the second image on the slider
    Then The page should be navigated to the expected URL "https://demo.nopcommerce.com/iphone-6"
