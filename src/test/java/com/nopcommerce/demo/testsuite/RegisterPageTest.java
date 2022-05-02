package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegisterResultPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String expectedRegisterText = "Register";
        String actualRegisterText = registerPage.getVerfiyRegisterText();
        Assert.assertEquals(expectedRegisterText,actualRegisterText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();

        registerPage.selectGenderFromRadioButton("Male");
        registerPage.enterFirstName1("john");
        registerPage.enterLastName("patel");
        registerPage.selectDateOfBirthDay("7");
        registerPage.selectDateOfBirthMonth("July");
        registerPage.selectDateOfBirthYear("1998");
        registerPage.enterEmailAddress("patel14466@gmail.com");
        registerPage.enterPassword("patel1234");
        registerPage.enterConfirmPassword("patel1234");

        registerPage.clickOnRegistrationButton();

        String expectedRegisterSuccessfulText = "Your registration completed";
        String actalRegisterSuccessfulText = registerResultPage.getVerfiyRegisterSuccessText();
        Assert.assertEquals(expectedRegisterSuccessfulText,actalRegisterSuccessfulText);
    }
}
