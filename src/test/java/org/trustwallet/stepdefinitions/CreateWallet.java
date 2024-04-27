package org.trustwallet.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class CreateWallet {
    @Steps
    CreateWalletSteps createWalletSteps;


    @When("new user clicks Get Started button")
    public void clickGetStarted() {
        createWalletSteps.userGetsStarted();
    }

    @Then("user is redirected to the next step")
    public void createWalletScreen() {
        assertTrue(createWalletSteps.checkWalletVisibility());
    }

    @When("users creates new wallet")
    public void newUserCreatesNewWallet() {
        createWalletSteps.userClicksCreateWalletButton();
    }

    @Then("user is redirected to the back up screen")
    public void skipBackup() {
        createWalletSteps.skipBackup();
    }

    @When("user enters passcode")
    public void userEntersPasscode() {
        createWalletSteps.enterPasscode();
    }

    @And("user confirms passcode")
    public void userConfirmsPasscode() {
        createWalletSteps.enterPasscode();
    }

    @Then("user is redirected to wallet page")
    public void userIsRedirectedToWalletPage() {
        createWalletSteps.startWithTrustWallet();
    }


    @Then("welcome message is displayed")
    public void welcomeMessageIsDisplayed() {
       assertTrue(createWalletSteps.welcomeMsg());
    }
}
