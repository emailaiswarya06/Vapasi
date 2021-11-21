package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentByCheckPage {

    @FindBy(css="input#order_payments_attributes__payment_method_id_3")
    public WebElement checkRadio;

    @FindBy(css="input[value='Save and Continue']")
    public  WebElement buttonSubmit;


    public PaymentByCheckPage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }

    public void completePaymentByCheck(){
        checkRadio.click();
        buttonSubmit.click();

    }

}
