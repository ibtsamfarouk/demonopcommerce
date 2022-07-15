package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    public WebElement emailTxtField() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTxtField() {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginBtn() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement MyAccountTap() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public WebElement errorMessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
