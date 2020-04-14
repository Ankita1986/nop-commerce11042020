package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class LoginTest extends TestBase {
    String emailId;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(priority = 0, groups = {"smoke"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test(priority = 1, groups = {"sanity"})
    public void verifyUserShouldLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        loginPage.waitForVisiblityToseeElement();
        loginPage.enterEmailId("emailId");
        loginPage.waitForVisiblityToseeElement();
        loginPage.enterPassword("Tajmahal06");
        loginPage.waitForVisiblityToseeElement();
        loginPage.clickOnLoginBt();

    }

    @Test(priority = 2, groups = {"regression"})
    public void verifySuccessfullLoginPageMessage() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, PPlease Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);

    }
}


