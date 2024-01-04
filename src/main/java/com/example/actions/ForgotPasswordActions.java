package com.example.actions;

import com.example.locators.ForgotPasswordLocators;
import com.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordActions {

    ForgotPasswordLocators forgotPasswordLocators = null;

    public ForgotPasswordActions() {

        this.forgotPasswordLocators = new ForgotPasswordLocators();

        PageFactory.initElements(HelperClass.getDriver(),forgotPasswordLocators);
    }

    // Get the Heading of Forgot Password page
    public String getForgotPasswordPageText() {
        return forgotPasswordLocators.ForgotPasswordHeading.getText();
    }
}