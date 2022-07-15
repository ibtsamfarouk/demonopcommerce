package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_Home;
import org.example.pages.P03_SearchResult;
import org.example.pages.P05_ProductDetails;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef {
    P00_Home homePage=new P00_Home();
    P03_SearchResult searchResultPage=new P03_SearchResult();
    P05_ProductDetails productDetailsPage=new P05_ProductDetails();



    @When("^user types \"(.*)\" in the search field and clicks search button$")
    public void searchWithProductName(String search_word)
    {
        homePage.searchField().sendKeys(search_word);
        homePage.searchBtn().click();
    }
    @Then("^The search result for search with \"(.*)\" will be displayed$")
    public void checkResultAfterSearchingWithName(String search_word){
        SoftAssert soft =new SoftAssert();
      // soft.assertTrue(Hooks.driver.getCurrentUrl().contains("demo.nopcommerce.com/search"),
              // "direction to search screen has failed");

        System.out.println("The number of relevant results for your search is: "
                +searchResultPage.productTitles().size());
        for (int i=0;i<searchResultPage.productTitles().size();i++){
           System.out.println("the product name is "+searchResultPage.productTitles().get(i).getText());
           // System.out.println("the search word is "+search_word);

            soft.assertTrue(searchResultPage.productTitles().get(i).getText().toLowerCase().contains(search_word));
            System.out.println("The "+(i+1)+" product name is "
                    +searchResultPage.productTitles().get(i).getText());
        }
       soft.assertAll();

    }
    @Then("^The search result for searching with \"(.*)\" will be displayed$")
    public void checkResultAfterSearchingWithSku(String search_word) {
        searchResultPage.productTitles().get(0).click();
        Assert.assertTrue(productDetailsPage.skuLbl().getText().contains(search_word));
        System.out.println("The product SKU is: "+productDetailsPage.skuLbl().getText());
    }
    }

