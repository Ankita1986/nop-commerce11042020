package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DeskTopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LastPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class LastTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DeskTopPage deskTopPage = new DeskTopPage();
    LastPage lastPage = new LastPage();

    @Test
    public void verifyUserShouldAddTheItemInAddToCart(){
        homePage.clickOnComputersLink();
        computerPage.clickOnDesktopLink();
        String expectedText = "Desktops";
        String actualText = deskTopPage.deskTopConfText();
        Assert.assertEquals(expectedText,actualText);
        deskTopPage.clickOnBuildYourOnComputer();
        lastPage.clickOnRadioBt();
        lastPage.clickOnAddToCartBt();
        String expectedText1 = "The product has been added to your shopping cart";
        String actualText1 = lastPage.confirmationMsg();
        Assert.assertEquals(expectedText1, actualText1);

    }




}
