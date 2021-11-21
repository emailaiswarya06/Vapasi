package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutToDeliveryPage {

    @FindBy(css="#summary-order-total")
    public WebElement orderTotalDelivery;

    @FindBy(css="td[data-hook='shipping-total']")
    public WebElement shippingTotal;

    @FindBy(css ="input[value ='Save and Continue']")
    public WebElement continueToPaymentButton;

    public CheckOutToDeliveryPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public String getShippingTotal(){

        return (shippingTotal.getText());
    }
    public String getOrderTotalDelivery(){
            return (orderTotalDelivery.getText());

    }

    public void continueToPayment(){
        continueToPaymentButton.click();
    }

}
