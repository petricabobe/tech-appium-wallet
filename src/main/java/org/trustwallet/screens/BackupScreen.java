package org.trustwallet.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.stream.IntStream.range;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BackupScreen extends PageObject {
    WebDriverWait wait;

    public BackupScreen(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AndroidFindBy(xpath = "//*[@text='SKIP']")
    WebElementFacade skipBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0']")
    WebElementFacade btn0;

    public void clickSkip() {
        skipBtn.waitUntilVisible().click();
    }

    public void enterPasscode() {
        range(1, 7).forEach(i -> btn0.waitUntilVisible().click());

    }

}
