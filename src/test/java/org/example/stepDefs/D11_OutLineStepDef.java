package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P08_OutLine;
import org.example.pages.P00_Home;
import org.testng.Assert;

public class D11_OutLineStepDef {
    P00_Home homePage=new P00_Home();
    P08_OutLine outLinePage=new P08_OutLine();

    @Given("user on home screen and clicks on the out line link")
    public void clickOnOutLineLine(){
        homePage.newOutLineLink().click();
    }
    @Then("the user should be navigated to the outline screen")
    public void verifyNavigationToOutlineScreen(){
       Assert.assertEquals(outLinePage.newOutLineLink().getText(),"New online store is open!");

    }
}

