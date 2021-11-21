

package com.spree.pages.POM;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.testng.Assert;

public class VerifyCartPage {
    WebDriver driver;
    public VerifyCartPage(WebDriver driver){

        this.driver = driver;
    }
    public String verifyTotal(){

        //getting the text of the total and putting in actual

        WebElement amount = driver.findElement(By.cssSelector("td[class='lead']"));
        String totalAmount = amount.getText();

        return totalAmount;


    }
}