package org.trustwallet;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "org.amazon.stepdefinitions",
        plugin = {"pretty"}
)
public class TestRunner {
//    @BeforeClass
//    public static void startAppium() {
//        System.out.println("start appium");
//        startServer();
//    }
//
//    @AfterClass
//    public static void stopAppium() {
//        stopServer();
//    }
}
