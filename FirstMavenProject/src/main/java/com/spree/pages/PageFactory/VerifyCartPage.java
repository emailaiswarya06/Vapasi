

package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCartPage {

    @FindBy(css="td[class='lead']")
    public WebElement totalAmountText;


    public VerifyCartPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public String verifyTotal(){

        //getting the text of the total and putting in actual
        System.out.println("Total in shopping cart "+totalAmountText.getText());
        return (totalAmountText.getText());

    }
}