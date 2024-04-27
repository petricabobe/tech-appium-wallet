package org.trustwallet.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class NewWalletScreen extends PageObject {
    WebDriverWait wait;
    public NewWalletScreen(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    @AndroidFindBy(xpath = "//*[contains(@text, 'Create new wallet')]")
    public WebElement createWalletButton;

    public boolean getCreateWalletButton() {
        return wait.until(visibilityOf(createWalletButton))
                        .isDisplayed();
    }
    public void clickCreateWalletButton() {
        wait.until(visibilityOf(createWalletButton))
                .click();
    }
}
