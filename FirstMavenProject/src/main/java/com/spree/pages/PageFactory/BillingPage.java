package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingPage {

    @FindBy(css="#order_bill_address_attributes_firstname")
    public WebElement bFirstName;

    @FindBy(css="#order_bill_address_attributes_lastname")
    public WebElement bLastName;

    @FindBy(css="#order_bill_address_attributes_address1")
    public WebElement bAddress1;
    @FindBy(css="#order_bill_address_attributes_address2")
    public WebElement bAddress2;

    @FindBy(css="#order_bill_address_attributes_city")
    public WebElement bCity;
    @FindBy(css="#order_bill_address_attributes_state_id")
    public WebElement bState;
    @FindBy(css="#order_bill_address_attributes_zipcode")
    public WebElement bZipcode;
    @FindBy(css="#order_bill_address_attributes_country_id")
    public WebElement bCountry;
    @FindBy(css="#order_bill_address_attributes_phone")
    public WebElement bPhoneNo;

    @FindBy(id="input[id ='order_use_billing']")
    public  WebElement userBillingAddressCheckbox;

    @FindBy(css="#save_user_address")
    public WebElement saveAddress;

    @FindBy(css="#summary-order-total")
    public WebElement summaryTotalInBillingPage;

    @FindBy(css ="input[value='Save and Continue']")
    public WebElement saveAndContinue;

    public BillingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clearTextBillingInformation(){
        bFirstName.clear();bLastName.clear();bAddress1.clear();bAddress2.clear();
        bCity.clear();bZipcode.clear();bPhoneNo.clear();
    }

    public String billingInformation(){
        bFirstName.sendKeys("Aiswarya");bLastName.sendKeys("Jayaraman");
        bAddress1.sendKeys("1907 N Bailey Creek Apartments");bAddress2.sendKeys("Bailey Woods Dr");
        bCity.sendKeys("Memphis");
        //select state from dropdown
        Select selectState = new Select(bState);
        selectState.selectByVisibleText("Tennessee");
        bZipcode.sendKeys("38017");
        //select country from dropdown
        Select selectCountry = new Select(bCountry);
        selectCountry.selectByVisibleText("United States of America");
        bPhoneNo.sendKeys("9016015487");

        System.out.println("Boolean : "+saveAddress.isSelected());

        if(saveAddress.isSelected()==true){

            saveAddress.click();
        }

        System.out.println("Boolean : "+saveAddress.isSelected());

        System.out.println("Total in Billing Page "+summaryTotalInBillingPage.getText());
        String summaryTotal = summaryTotalInBillingPage.getText();
        saveAndContinue.click();
        return summaryTotal;


    }

}
