package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P00_Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {

    P00_Home homePage=new P00_Home();

    @Given("user selects Euro currency from the dropdown list on the top left of home page")
    public void changeCurrencyToEuro()
    {
        Select currencyOptions=new Select(homePage.currencyDropDown());
        currencyOptions.selectByIndex(1);
    }
    @Then("Euro Symbol (€) is shown on the 4 displayed products the in Home page")
    public void checkCurrencyChangedToEuro()
    {
       List<WebElement> p =homePage.productsList();
       for(int i=0;i<p.size();i++) {
           Assert.assertTrue(p.get(i).getText().contains("€"),"€ doesn't exist");
           System.out.println("the price of the "+(i+1)+" product is "+p.get(i).getText());
       }
    }

}
