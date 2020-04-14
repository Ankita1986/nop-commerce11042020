package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class LoginPage extends Utility {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");

    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginBt() {
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void waitForVisiblityToseeElement() {
        waitUntilVisibilityOfElementLocated(emailField, 60);

    }
}
