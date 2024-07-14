package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_OutLine {
    public WebElement newOutLineLink()
    {
        return Hooks.driver.findElement(By.tagName("h1"));
    }
}
