package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P00_Home;
import org.testng.Assert;

public class D08_SliderNavigation {
    P00_Home homePage=new P00_Home();
    @Given("The user clicks on the first image on the slider.")
    public void ClickOnTheFirstSlider(){
        homePage.SliderItems().get(0).click();
    }
    @Then("^The page should be navigated to the expected URL \"(.*)\"$")
    public void checkNavigation(String url){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url,"Wrong direction! Bug Dedected!");
    }
    @Given("The user clicks on the second image on the slider")
    public void ClickOnTheSecondSlider(){
        homePage.SliderItems().get(1).click();
    }
}
