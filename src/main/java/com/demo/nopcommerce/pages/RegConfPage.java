package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class RegConfPage extends Utility {
    By registerText = By.xpath("//div[@class='result']");

    public void waitForVisiblityToseeElement() {
        waitUntilVisibilityOfElementLocated(registerText, 20);
    }



        public String  registerTextCnf(){
        return getTextFromElement(registerText);

    }
}
