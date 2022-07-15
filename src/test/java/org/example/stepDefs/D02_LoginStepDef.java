package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_Home;
import org.example.pages.P01_register;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {

     P00_Home homePage=new P00_Home();
     P02_Login loginPage=new P02_Login();

    @Given("user goes to login page")
    public void goLoginPage()
    {
        homePage.loginLink().click();
    }
    @When("^user logs in with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void loginSteps(String type,String username, String password)
    {
        if(type.equals("valid")){
            loginPage.emailTxtField().sendKeys(username);
            loginPage.passwordTxtField().sendKeys(password);
        }
        else {
            loginPage.emailTxtField().sendKeys(type+username);
            loginPage.passwordTxtField().sendKeys(type+password);

        }
    }
    @And("user presses on the login button")
    public void clickLoginBtn()
    {
        loginPage.loginBtn().click();
    }
    @Then("user logs in to the system successfully")
    public void checkSuccessfulLogin()
    {
        /*1- getCurrentUrl and verify it equals https://demo.nopcommerce.com/
          2- “My account” tab isDisplayed*/
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(loginPage.MyAccountTap().isDisplayed());
        soft.assertAll();

    }

    @Then("user can not login to the system")
    public void checkUnSuccessfulLogin()
    {
      //  1- error message contains "Login was unsuccessful."
       // 2- the color of this message is red  "#e4434b"
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(loginPage.errorMessage().getText().contains("Login was unsuccessful"));
       String color= loginPage.errorMessage().getCssValue("color");
        soft.assertEquals(Color.fromString(color).asHex(),"#e4434b");
        soft.assertAll();

    }

}
