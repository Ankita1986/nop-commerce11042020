package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computersLink = By.xpath("//body/div[@class='master-wrapper-page']/div[@class='header-menu']/ul[@class='top-menu notmobile']/li[1]/a[1]\n");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {

        clickOnElement(registerLink);
    }

    public void clickOnComputersLink() {
        clickOnElement(computersLink);
    }

    public void waitUntilVisibility() {
        waitUntilPresenceOfElementLocated(computersLink, 20);

    }

    public void clickOnElectronicsLink() {
        clickOnElement(electronicsLink);
    }


}





