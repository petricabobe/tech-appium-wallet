package org.trustwallet.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class IntroScreen extends PageObject {
    WebDriverWait wait;

    IntroScreen(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AndroidFindBy(className = "android.widget.Button")
    WebElement getStartedBtn;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Terms of Service')]")
    WebElement terms;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Privacy Policy')]")
    WebElement policy;

    public void getStarted() {
        wait.until(visibilityOf(getStartedBtn))
                .click();
    }

    public boolean getTerms() {
        return wait.until(visibilityOf(terms)).isDisplayed();
    }

    public boolean getPolicy() {
        return wait.until(visibilityOf(policy)).isDisplayed();
    }
}
