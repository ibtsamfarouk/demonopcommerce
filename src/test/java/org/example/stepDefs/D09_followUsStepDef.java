package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P00_Home;
import org.testng.Assert;

import java.util.ArrayList;

public class D09_followUsStepDef {
    P00_Home homePage= new P00_Home();
    @Given("user opens facebook link")
    public void clickOnFacebookLink(){
        homePage.facebookLink().click();
    }
    @Given("user opens twitter link")
    public void clickOnTwitterLink(){
        homePage.twitterLink().click();
    }
    @Given("user opens rss link")
    public void clickOnRssLink(){
        homePage.rssLink().click();
    }
    @Given("user opens youtube link")
    public void clickOnYoutubeLink(){
        homePage.youtubeLink().click();
    }
    @Then("^\"(.*)\" is opened in a new tab$")
    public void checkTaps(String ExpectedUrl) throws InterruptedException {
     Thread.sleep(3000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("URL after switching is: "+Hooks.driver.getCurrentUrl());
        System.out.println("Page tile after switching is: "+Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),ExpectedUrl,"Wrong URL detected!");
        Hooks.driver.close();
    }


}
