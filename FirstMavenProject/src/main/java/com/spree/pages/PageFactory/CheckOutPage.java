

package com.spree.pages.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    @FindBy(css="button#checkout-link")
    public WebElement buttonCheckout;

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void checkoutCart(){
        System.out.println("clicking checkout button");
        buttonCheckout.click();
    }
}