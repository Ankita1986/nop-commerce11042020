package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class DeskTopPage extends Utility {
    By desktopText = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By buildYourOwnComputer = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]");


    public String deskTopConfText(){
        return getTextFromElement(desktopText);


    }
    public void clickOnBuildYourOnComputer() {
        clickOnElement(buildYourOwnComputer);
    }
}

