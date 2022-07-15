package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P00_Home;
import org.example.pages.P03_SearchResult;
import org.example.pages.P05_ProductDetails;
import org.example.pages.P06_WishList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D06_AddToWishList {
    P00_Home homePage = new P00_Home();
    P03_SearchResult searchResultPage = new P03_SearchResult();
    P05_ProductDetails productDetailsPage = new P05_ProductDetails();
    P06_WishList wishListPage = new P06_WishList();
    @Given("user clicks on add to wish list button of HTC One M8 Android L 5.0 Lollipop from the home screen")
    public void addToWishListFromHome(){
        homePage.addToWishListBtn().click();
    }
    @Then("A message that the product was added to the wish list successfully will be displayed")
    public void checkAddToWishListMessage(){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(homePage.messageAfterAddToWishList().isDisplayed());
        String color=homePage.messageAfterAddToWishList().getCssValue("background-color");
        //System.out.println(color);
        soft.assertEquals(Color.fromString(color).asHex(),"#4bb07a");
        soft.assertAll();

    }

    @Given("^user searches for a \"(.*)\" from the home screen$")
    public void searchWithProductName(String search_word) {
        homePage.searchField().sendKeys(search_word);
        homePage.searchBtn().click();
    }

    @Then("The search result for search will be displayed")
    public void ResultAfterSearchingWithName() {
      System.out.println("The number of relevant results for your search is: "
                + searchResultPage.productTitles().size());
    }

    @And("The user clicks on the first item to be in the product details page.")
    public void navigateToProductDetails() {
        searchResultPage.productTitles().get(0).click();

    }

    @And("The user clicks on add to wishList button")
    public void addToWishList() {
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,400)");
        productDetailsPage.addToWishListBtn().click();
    }
    @Then("^The name of the \"(.*)\" will be added to the wishlist with a quantity more than zero$")
    public void checkAddingToWishList(String productName) {

        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(homePage.messageAfterAddToWishList()));
        homePage.WishListTap().click();
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(wishListPage.pageTitle().isDisplayed());
        System.out.println("The page Header is: "+wishListPage.pageTitle().getText());
        System.out.println("The added product to the wishlist is: "+wishListPage.productNameCell().getText());
        Assert.assertEquals(wishListPage.productNameCell().getText(),productName);
        int quantity = Integer.parseInt(wishListPage.quantity().getAttribute("value"));
        System.out.println("The product quantity is: "+quantity);
        Assert.assertTrue(quantity>0);
    }
}