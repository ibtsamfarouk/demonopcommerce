package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P00_Home;
import org.testng.Assert;

import java.sql.SQLOutput;

public class D10_Test {
public P00_Home home= new P00_Home();
@Given("user is in the home page and clicks on the electronics link.")
    public void clickOnElctronicsLink(){
    home.electronicsLink().click();
}
@Then("the electronics will be opened.")
    public void openTheElectronicsPage(){
    System.out.println(Hooks.driver.getCurrentUrl());
    Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("electronics"));
    }
}
