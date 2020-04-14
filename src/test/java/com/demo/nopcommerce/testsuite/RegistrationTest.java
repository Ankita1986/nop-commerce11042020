package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegConfPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class RegistrationTest extends TestBase {
    String emailid;
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    RegConfPage regConfPage = new RegConfPage();

    @Test(priority = 0, groups = {"smoke"})
    public void verifyUserShouldNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
    }

    @Test(priority = 1, groups = {"sanity"})
    public void verifyUserShouldRegisterSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.clickOnRadioBt();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.enterFirstName("Taj");
        registerPage.waitForVisiblityToSeeElement();
        registerPage.enterLastName("Mahal");
        registerPage.selectDayOfBirth("1");
        registerPage.selectMonthOfBirth("July");
        registerPage.selectYearOfBirth("1986");
        registerPage.enterEmailId("emailId ");
        registerPage.enterCompanyName("Physio Care");
        registerPage.enterPassword("Tajmahal06");
        registerPage.enterConfirmPassword("Tajmahal06");
        registerPage.clickOnRegisterBt();
       // regConfPage.waitForVisiblityToseeElement();

        String expectedText = "Your registration completed";
        String actualText = regConfPage.registerTextCnf();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test(priority = 2, groups = {"regression"})
    public void verifySuccessfullRegistrationPageMessage(){
        homePage.clickOnRegisterLink();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.clickOnRadioBt();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.enterFirstName("Taj");
        registerPage.waitForVisiblityToSeeElement();
        registerPage.enterLastName("Mahal");
        registerPage.selectDayOfBirth("1");
        registerPage.selectMonthOfBirth("July");
        registerPage.selectYearOfBirth("1986");
        registerPage.enterEmailId("emailId ");
        registerPage.enterCompanyName("Physio Care");
        registerPage.enterPassword("Tajmahal06");
        registerPage.enterConfirmPassword("Tajmahal06");
        registerPage.clickOnRegisterBt();
        // regConfPage.waitForVisiblityToseeElement();

        String expectedText = "Your registration ccompleted";
        String actualText = regConfPage.registerTextCnf();
        Assert.assertEquals(expectedText, actualText);


    }
}
