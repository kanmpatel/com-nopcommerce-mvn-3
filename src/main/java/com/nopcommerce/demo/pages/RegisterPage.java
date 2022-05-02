package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Utility {

    By verifyRegisterText = By.xpath("//h1[contains(text(),'Register')]");
    By gender = By.xpath("//input[@id='gender-female']");
    By firstName = By.name("FirstName");
    By lastName = By.cssSelector("input#LastName");
    By dateOfBirthDay = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.name("DateOfBirthMonth");
    By dateOfBirthYear = By.name("DateOfBirthYear");
    By emailAddres = By.xpath("//input[@id='Email']");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");


    //action use for getVerfiyRegisterText
    public String getVerfiyRegisterText() {

        return getTextFromElement(verifyRegisterText);
    }
    //action use for selectGenderFromRadioButton
    public void selectGenderFromRadioButton(String genderText) {
        clickOnElement(gender);
    }
    //action use for enterFirstName
    public void enterFirstName1(String text){

        sendTextToElement(firstName,text);
    }

    //action use for enterLastName
    public void enterLastName(String text){
        sendTextToElement(lastName,text);
    }
    //action use for selectDateOfBirthDay
    public void selectDateOfBirthDay(String text){

        selectByVisibleTextFromDropDown(dateOfBirthDay,text);
    }
    //action use for selectDateOfBirthMonth
    public void selectDateOfBirthMonth(String text){
        selectByVisibleTextFromDropDown(dateOfBirthMonth,text);
    }

    //action use for selectDateOfBirthYear
    public void selectDateOfBirthYear(String text){
        selectByVisibleTextFromDropDown(dateOfBirthYear,text);
    }

    //action use for enterPassword
    public void enterEmailAddress(String text){
        sendTextToElement(emailAddres,text);
    }

    //action use for enterPassword
    public void enterPassword(String text){
        sendTextToElement(passwordField,text);
    }

    //action use for enterConfirmPassword
    public void enterConfirmPassword(String text){
        sendTextToElement(confirmPasswordField,text);
    }

    //action use for enterConfirmPassword
    public void clickOnRegistrationButton(){
        WebElement registerButton1 = waitUntilVisibilityOfElementLocated(registerButton,3000);
        registerButton1.click();
    }




}
