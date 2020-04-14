package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class ComConfPage extends Utility {
    By compuConfText = By.xpath("//h1[contains(text(),'Computers')]");

    public String compuConfMsg(){
        return getTextFromElement(compuConfText);
    }
}
