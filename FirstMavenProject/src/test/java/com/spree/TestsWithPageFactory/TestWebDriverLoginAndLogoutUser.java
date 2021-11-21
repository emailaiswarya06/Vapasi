package com.spree.TestsWithPageFactory;

import com.spree.pages.PageFactory.LoginPage;
import com.spree.pages.PageFactory.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestWebDriverLoginAndLogoutUser extends BaseClassTest {

    @Test(priority = 1)
     public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        String loginMessageStr = loginPage.login("user1@gmail.com","Password@1");
        Assert.assertTrue(loginMessageStr.contains("success"),"Login Message incorrect");
    }
    @Test(priority = 2)
    public void logoutTest(){
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
    }


}
