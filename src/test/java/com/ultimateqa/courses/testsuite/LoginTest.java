package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSingInLink();
        String actualMessage = signInPage.getWelcomeBackText();
        Assert.assertEquals(actualMessage,"Welcome Back!","error");

    }
@Test
    public void verifyTheErrorMessage(){
    homePage.clickOnSingInLink();
    signInPage.enterEmailId("Lalita122=@gmail.com");
   signInPage.enterPasswordField("Lalita123");
    signInPage.clickOnSignInButton();
    String actualMessage = signInPage.errorMessageText();
    Assert.assertEquals(actualMessage,"Invalid email or password.","error");

}
}
