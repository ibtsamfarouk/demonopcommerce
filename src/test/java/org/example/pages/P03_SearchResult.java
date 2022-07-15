package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_SearchResult {

    public List<WebElement> productTitles()
    {
        List<WebElement> productTitles= Hooks.driver.findElements(By.className("product-title"));
        return productTitles;
    }
}
