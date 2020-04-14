package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class RegisterPage extends Utility {


    By radioBt = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDayDropDown = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirthDropDown = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirthDropDown = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyName = By.id("Company");
    By passwordField = By.id("Password");
    By conformPasswordField = By.id("ConfirmPassword");
    By registerBt = By.xpath("//input[@id='register-button']");



    public void clickOnRadioBt(){
        clickOnElement(radioBt);
    }
    public void enterFirstName(String fName){
        sendTextToElement(firstNameField, fName);
    }
    public void enterLastName(String lName){
        sendTextToElement(lastNameField, lName);
    }
    public void selectDayOfBirth( String day){
        selectByVisibleTextForDropDownElement(dateOfBirthDayDropDown, day);
    }
    public void selectMonthOfBirth(String month){
        selectByVisibleTextForDropDownElement(monthOfBirthDropDown, month);
    }
    public void selectYearOfBirth(String year){

        selectByVisibleTextForDropDownElement(yearOfBirthDropDown, year);
    }
    public void enterEmailId(String emailId){

        enterRandomEmail(emailField);
    }


    public void enterCompanyName(String compName){

        sendTextToElement(companyName, compName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void enterConfirmPassword(String confmPassword){
        sendTextToElement(conformPasswordField, confmPassword);
    }
    public void clickOnRegisterBt(){
        clickOnElement(registerBt);
    }
    public void waitForVisiblityToSeeElement() {
        waitUntilVisibilityOfElementLocated(firstNameField, 50);
    }

}

