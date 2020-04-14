package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class ComputerPage extends Utility {
    By deskTopsLink = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");

    public void clickOnDesktopLink(){
        clickOnElement(deskTopsLink);
    }



}
