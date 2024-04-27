package org.trustwallet.stepdefinitions;

import net.serenitybdd.annotations.Step;
import org.trustwallet.screens.BackupScreen;
import org.trustwallet.screens.IntroScreen;
import org.trustwallet.screens.NewWalletScreen;
import org.trustwallet.screens.WalletScreen;

public class CreateWalletSteps {

    IntroScreen introScreen;
    NewWalletScreen newWalletScreen;
    BackupScreen backupScreen;
    WalletScreen walletScreen;

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
    @Step
    public boolean checkWalletVisibility(){
        return newWalletScreen.getCreateWalletButton();
    }
    @Step
    public void userClicksCreateWalletButton() {
        newWalletScreen.clickCreateWalletButton();
    }

    @Step
    public void skipBackup() {
        backupScreen.clickSkip();
    }
    @Step
    public void enterPasscode() {
        backupScreen.enterPasscode();
    }
    @Step
    public void startWithTrustWallet(){
        walletScreen.clickStartTrustWallet();
    }
    @Step
    public boolean welcomeMsg(){
        return walletScreen.getWelcomeMsg();
    }
}
