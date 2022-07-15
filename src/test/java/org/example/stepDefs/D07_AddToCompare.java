package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class D07_AddToCompare {
    P00_Home homePage = new P00_Home();
    P03_SearchResult searchResultPage = new P03_SearchResult();
    P05_ProductDetails productDetailsPage = new P05_ProductDetails();
    P07_Compare comparePage = new P07_Compare();
    @Then("The search result appears and the user selects one of the search results")
    public void ResultAfterSearchingWithName() {
        //System.out.println("The number of relevant results for your search is: "
              //  + searchResultPage.productTitles().size());
        searchResultPage.productTitles().get(0).click();
    }
    @And("The user clicks on addToCompare button")
    public void addToCompareList() {
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,400)");
        productDetailsPage.addToCompareBtn().click();
    }
    @Then("The user navigates to the compare page to compare between the two added products")
    public void AddToCompare() throws InterruptedException {
        Thread.sleep(5000);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
        System.out.println("The compare table content after adding the two products is: ");
        for (int i=1;i<comparePage.allTableRows().size();i++)
            System.out.println(comparePage.allTableRows().get(i).getText());
           /* for (int j=0;j<comparePage.allTableCol().size();j++)
                System.out.println(comparePage.allTableCol().get(i).getText());
        }*/
      /* for(WebElement row:comparePage.allTableRows()) {
           if (!row.getText().equals("  Remove Remove"))
               System.out.println(row.getText() + "\t");
       }*/
    }
}

