package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_WishList {

    public WebElement productNameCell()
    {
        return  Hooks.driver.findElement(By.cssSelector("td.product"));
    }

    public WebElement emptyNoDataDiv()
    {
        return  Hooks.driver.findElement(By.cssSelector("div.no-data"));
    }
    public WebElement pageTitle()
    {
        return  Hooks.driver.findElement(By.cssSelector("div.page-title"));
    }
    public WebElement quantity()
    {
        return  Hooks.driver.findElement(By.cssSelector("input.qty-input"));
    }

}
