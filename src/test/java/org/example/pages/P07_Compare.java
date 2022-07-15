package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_Compare {
    public WebElement compareTable()
    {
        return  Hooks.driver.findElement(By.cssSelector("table.compare-products-table"));
    }
    public List<WebElement> allTableRows()
    {
        return  Hooks.driver.findElements(By.tagName("tr"));
    }
    public List<WebElement> allTableCol()
    {
        return  Hooks.driver.findElements(By.tagName("td"));
    }
}
