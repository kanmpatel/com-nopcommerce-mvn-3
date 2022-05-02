package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterResultPage extends Utility {

    By verifyRegisterSuccessText = By.cssSelector("div.result");
    By continueButton = By.xpath("//div[@class='buttons']/child::a");

    public String getVerfiyRegisterSuccessText(){
        return getTextFromElement(verifyRegisterSuccessText);
    }

    //action use for clickOnTermAndConditionCheckBox
    public void clickOnContinueButton(){
        WebElement continueBtn = waitUntilVisibilityOfElementLocated(continueButton,3000);
        continueBtn.click();
    }

}
