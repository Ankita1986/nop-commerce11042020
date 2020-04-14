package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.*;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DeskTopPage deskTopPage = new DeskTopPage();
    ComConfPage comConfPage = new ComConfPage();
    LastPage lastPage = new LastPage();


    @Test(priority = 0, groups = {"smoke"})
    public void verifyUserShouldNavigateToComputerPage() {
        homePage.clickOnComputersLink();
        String expectedText = "Computers";
        String actualText = comConfPage.compuConfMsg();
        Assert.assertEquals(expectedText, actualText);


    }

    @Test(priority = 1, groups = {"sanity"})
    public void verifyUserShouldNavigateToDesktopPage() {
        homePage.clickOnComputersLink();
        computerPage.clickOnDesktopLink();
        String expectedText1 = "Desktops";
        String actualText1 = deskTopPage.deskTopConfText();
        Assert.assertEquals(expectedText1, actualText1);
        //deskTopPage.clickOnBuildYourOnComputer();
       // String expectedText2 = "Build your own computer";
        //String actualText2 = lastPage.buildCompuMsg();
        //Assert.assertEquals(expectedText2, actualText2);

    }

    @Test(priority = 2, groups = {"regression"})
    public void verifyComputerPageScreenMessage() {
        homePage.clickOnComputersLink();
        String expectedText = "Computerss";
        String actualText = comConfPage.compuConfMsg();
        Assert.assertEquals(expectedText, actualText);


    }
}


