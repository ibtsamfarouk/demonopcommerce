package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_ProductDetails {

    public WebElement skuLbl()
    {
        return  Hooks.driver.findElement(By.className("sku"));
    }
    public WebElement addToWishListBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("div.add-to-wishlist"));
    }
    public WebElement addToCompareBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("div.compare-products"));
    }
    public WebElement addToCartBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("button.button-1.add-to-cart-button"));
    }
}
