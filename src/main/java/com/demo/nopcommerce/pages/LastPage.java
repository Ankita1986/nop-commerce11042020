package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class LastPage extends Utility {
    By buildCompuText = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]");
    By radioBt = By.id("product_attribute_3_7");
    By addToCartBt = By.id("add-to-cart-button-1");
    By confrmText = By.xpath("//p[@class='content']");

public String  buildCompuMsg(){
    return getTextFromElement(buildCompuText);

}
    public void clickOnRadioBt(){
        clickOnElement(radioBt);
    }
    public void clickOnAddToCartBt(){
        clickOnElement(addToCartBt);
    }
    public String confirmationMsg(){
        return getTextFromElement(confrmText);
    }
}
