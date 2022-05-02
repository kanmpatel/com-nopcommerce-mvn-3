package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        String expectedMessageText = "Welcome, Please Sign In!";
        String actualMessageText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessageText, actualMessageText, "Login page not displayed");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("patel@gmail.com");
        loginPage.enterPassword("12345");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message not displayed");
    }
}
