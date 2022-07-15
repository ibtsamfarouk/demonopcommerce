package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_Home;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
     P01_register registerPage=new P01_register();
     P00_Home homePage=new P00_Home();



    @Given("user goes to register page")
    public void goRegisterPage()
    {
        homePage.registerLink().click();
    }

    @When("user selects the gender type")
    public void selectGender()
    {
        registerPage.genderRadioBtn().click();
    }


    @And("^user enters first name \"(.*)\" and last name \"(.*)\"$")
    public void enterFirstName(String firstName,String secondName)
    {
        registerPage.firstNameTxtField().sendKeys(firstName);
        registerPage.lastNameTxtField().sendKeys(secondName);
    }

    @And("user enters date of birth")
    public void selectBirthDay()
    {
        Select daysOptions= new Select(registerPage.dateOfBirthDay());
        daysOptions.selectByIndex(1);
        Select monthOptions= new Select(registerPage.dateOfBirthMonth());
        monthOptions.selectByIndex(1);
        Select yearsOptions= new Select(registerPage.dateOfBirthYear());
        yearsOptions.selectByIndex(21);
    }

    @When("^user enters email \"(.*)\" field$")
    public void selectEmail(String email)
    {
        registerPage.emailField().sendKeys(email);
    }
    @When("^user fills Password fields \"(.*)\"$")
    public void enterPasswords(String password)
    {
        registerPage.passwordField().sendKeys(password);
        registerPage.ConfirmPasswordField().sendKeys(password);
    }

    @When("user clicks on register button")
    public void clickRegisterBtn()
    {
        registerPage.rigsterBtn().click();
    }

    @Then("A success message will be displayed")
    public void checkResult()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(registerPage.successMessage().isDisplayed());
       soft.assertEquals(registerPage.successMessage().getText(),"Your registration completed");
        soft.assertEquals(registerPage.successMessage().getCssValue("color"),"rgba(76, 177, 124, 1)");
        soft.assertAll();

    }

}


