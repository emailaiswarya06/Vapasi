

package com.spree.pages.POM;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class AddingProduct {
    WebDriver driver;
    public AddingProduct(WebDriver driver){

        this.driver = driver;
    }
    public void addProductToCart(String quantity){

        driver.findElement(By.cssSelector("input#quantity")).clear(); // clear the deafult
        driver.findElement(By.cssSelector("input#quantity")).sendKeys(quantity);
        driver.findElement(By.cssSelector("button#add-to-cart-button")).click();

    }
}