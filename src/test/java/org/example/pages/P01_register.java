package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement genderRadioBtn() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstNameTxtField(){
        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement lastNameTxtField(){
        return Hooks.driver.findElement(By.id("LastName"));

    }

    public WebElement dateOfBirthDay() {
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }
    public WebElement dateOfBirthMonth() {
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }

    public WebElement dateOfBirthYear() {
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }

    public WebElement emailField(){
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement passwordField(){
        return Hooks.driver.findElement(By.id("Password"));

    }
    public WebElement ConfirmPasswordField(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));

    }

    public WebElement rigsterBtn(){
        return Hooks.driver.findElement(By.id("register-button"));

    }

    public WebElement successMessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}
