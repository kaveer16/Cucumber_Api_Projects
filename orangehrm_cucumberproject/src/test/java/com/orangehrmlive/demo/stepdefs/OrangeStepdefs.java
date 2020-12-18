package com.orangehrmlive.demo.stepdefs;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OrangeStepdefs {
    @Given("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new HomePage().enterTextToUserNameField(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new HomePage().enterTextToPasswordField(password);
    }

    @When("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }


    @Then("^I should be able to see welcome text$")
    public void iShouldBeAbleToSeeWelcomeText() {
        Assert.assertEquals("Welcome Paul",new DashboardPage().verifyWelcomeText());
    }

    @And("^I click on Welcome button$")
    public void iClickOnWelcomeButton() {
        new DashboardPage().clickOnWelcomeLink();
    }

    @And("^I click on Logout button$")
    public void iClickOnLogoutButton() {
        new DashboardPage().clickOnLogoutLink();
    }

    @Then("^I should be able to see Login Panel text$")
    public void iShouldBeAbleToSeeLoginPanelText() {
        new HomePage().verifyLoginPanelText();
    }
}
