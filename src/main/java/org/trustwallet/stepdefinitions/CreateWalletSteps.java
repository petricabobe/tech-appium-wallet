package org.trustwallet.stepdefinitions;

import net.thucydides.core.annotations.Step;
import org.trustwallet.screens.IntroScreen;

public class CreateWalletSteps {

    IntroScreen introScreen;

    @Step
    public void userGetsStarted() {
        introScreen.getStarted();
    }

    @Step
    public boolean checkTermsVisibility(){
        return introScreen.getTerms();
    }
    @Step
    public boolean checkPolicyVisibility(){
        return introScreen.getPolicy();
    }
}
