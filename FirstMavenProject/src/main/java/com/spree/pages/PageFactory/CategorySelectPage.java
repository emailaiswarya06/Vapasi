
package com.spree.pages.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategorySelectPage {

    @FindBy(xpath = "//*[@id='taxonomies']/div[1]/div/a[1]")
    public WebElement categoryName;

    @FindBy(xpath = "//*[@id='products']/div[1]//div/div[1]/a")
    public WebElement productName;

    public CategorySelectPage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }

    public void selectCategoryFromSideBar(){
        categoryName.click();

    }

    public void selectProduct(){
        productName.click();


    }
}