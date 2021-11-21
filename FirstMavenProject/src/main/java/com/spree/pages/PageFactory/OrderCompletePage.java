package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletePage {

    @FindBy(css="#content > div")
    public WebElement successMessage;

    public OrderCompletePage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }

    public String getOrderStatus(){
        return (successMessage.getText());
    }
}
