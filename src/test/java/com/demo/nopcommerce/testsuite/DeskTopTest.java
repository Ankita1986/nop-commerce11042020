package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DeskTopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class DeskTopTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DeskTopPage deskTopPage = new DeskTopPage();

    @Test
    public void verifyUserShouldNavigateToBuildOwnCompuPage(){
        homePage.clickOnComputersLink();
        computerPage.clickOnDesktopLink();
        String expectedText = "Desktops";
        String actualText = deskTopPage.deskTopConfText();
        Assert.assertEquals(expectedText,actualText);
        deskTopPage.clickOnBuildYourOnComputer();
    }

}
