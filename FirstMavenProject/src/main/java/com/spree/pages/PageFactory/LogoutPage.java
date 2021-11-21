package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    @FindBy(css="a[href='/logout']")
    public WebElement logoutLink;



    public LogoutPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void logout(){
        logoutLink.click();
    }
}
