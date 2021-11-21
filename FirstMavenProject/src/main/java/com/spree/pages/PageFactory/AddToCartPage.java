package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {


        @FindBy(css="input#quantity")
        public WebElement quantityTextBox;

        @FindBy(css="button#add-to-cart-button")
        public WebElement buttonAddToCart;


    public AddToCartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void addProductToCart(String quantity){

        quantityTextBox.clear();
        quantityTextBox.sendKeys(quantity);
        buttonAddToCart.click();

    }

}
