package com.spree.pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        @FindBy(id ="spree_user_email")
        public WebElement emailTextBox;

        @FindBy(id ="spree_user_password")
        public WebElement passwordTextBox;

        @FindBy(css="input[type='checkbox']")
        public WebElement rememberMeCheckbox;

        @FindBy(css="input[value='Login']")
        public WebElement buttonSubmit;

        @FindBy(xpath = "//*[@id='content']/div[1]")
        public WebElement loginMessage;


        public LoginPage(WebDriver driver){

       // this.driver = driver;
        PageFactory.initElements(driver,this);
            //System.out.println("Login Page Constructor");
        }

         public String login(String userEmail, String password){
            emailTextBox.sendKeys(userEmail);
            passwordTextBox.sendKeys(password);


             buttonSubmit.submit();
             String loginMessageStr = loginMessage.getText();
             return loginMessageStr;
         }



}
