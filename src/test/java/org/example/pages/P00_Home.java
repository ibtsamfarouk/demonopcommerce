package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P00_Home {

    public WebElement registerLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement loginLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement currencyDropDown()
    {
        return  Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> productsList()
    {
         List<WebElement> productsList=Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
         return productsList;
    }
    public WebElement searchField()
    {
        return  Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public WebElement computerMenu()
    {
        return  Hooks.driver.findElement(By.linkText("Computers"));
    }
    public WebElement softwareItem()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a"));
    }
    public WebElement electronicsMenu()
    {
        return  Hooks.driver.findElement(By.linkText("Electronics"));
    }
    public WebElement cellPhonesItem()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a"));
    }

    public WebElement subCategoryTitle()
    {
        return  Hooks.driver.findElement(By.cssSelector("div.page-title"));
    }

        public List<WebElement> SliderItems()
        {
            return  Hooks.driver.findElements(By.cssSelector("a.nivo-imageLink"));
        }
    public WebElement facebookLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement twitterLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rssLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement youtubeLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\""));
    }
    public WebElement addToWishListBtn()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement messageAfterAddToWishList()
    {
        return  Hooks.driver.findElement(By.cssSelector("div.bar-notification.success"));
    }

    public WebElement WishListTap()
    {
        return  Hooks.driver.findElement(By.cssSelector("span.wishlist-label"));
    }

}
