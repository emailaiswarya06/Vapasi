
package com.spree.pages.POM;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import java.util.List;

public class CategorySelectPage {
    WebDriver driver;
    String keywordToSearch;

    public CategorySelectPage(WebDriver driver){

        this.driver = driver;

    }
    public void selectCategory(String keywordToSearch){
       driver.findElement(By.linkText(keywordToSearch)).click();

    }

    public void selectProduct(){

        driver.findElement(By.cssSelector("span[title='Spree Bag']")).click();
    }
}