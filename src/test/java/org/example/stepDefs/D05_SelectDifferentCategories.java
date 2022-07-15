package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P00_Home;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_SelectDifferentCategories {
    P00_Home homePage=new P00_Home();
    Actions action=new Actions(Hooks.driver);

    @Given("^user hovers on \"(.*)\" on the top menu,The related sub menu will be opened and one of it's items will be selected$")
    public void userCanSelectDifferentCategories(String categoryName){
        if(categoryName.equals("Computers")) {
            action.moveToElement(homePage.computerMenu())
                    .moveToElement(homePage.softwareItem()).click().perform();
           Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("software"));
           System.out.println("This is one of the "+categoryName+" sub-category URL: "+
                   Hooks.driver.getCurrentUrl());
            System.out.println("The Sub-category page title is: "+homePage.subCategoryTitle().getText());
            Assert.assertTrue(homePage.subCategoryTitle().getText().contains("Software"));
        } else if (categoryName.equals("Electronics")) {
            action.moveToElement(homePage.electronicsMenu())
                    .moveToElement(homePage.cellPhonesItem()).click().perform();
          Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("cell-phones"));
            System.out.println("This is one of the "+categoryName+" sub-category URL: "+
                    Hooks.driver.getCurrentUrl());
            System.out.println("The Sub-category page title is: "+homePage.subCategoryTitle().getText());
            Assert.assertTrue(homePage.subCategoryTitle().getText().contains("Cell phones"));


        }

    }
}
