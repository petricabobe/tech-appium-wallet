package org.trustwallet.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WalletScreen extends PageObject {

    public WalletScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@text='Start using Trust Wallet']")
    WebElementFacade startButton;

    @AndroidFindBy(xpath = "//*[@text='Welcome aboard']")
    WebElementFacade welcomeMsg;


    public void clickStartTrustWallet() {
        startButton.waitUntilVisible().click();
    }

    public boolean getWelcomeMsg() {
        return welcomeMsg.waitUntilVisible().isCurrentlyVisible();
    }
}
