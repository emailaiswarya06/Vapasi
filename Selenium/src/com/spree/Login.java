package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url ="https://spree-vapasi-prod.herokuapp.com/login";
        driver.manage().window().maximize();
        driver.get(url);
       /* driver.findElement(By.id("taxon")).sendKeys("Brands");
        driver.findElement(By.cssSelector("input[data-disable-with='Search']")).click();*/

        driver.findElement(By.id("spree_user_email")).sendKeys("user1@gmail.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys("Password@1");
        //driver.findElement(By.cssSelector("#spree_user_remember_me")).sendKeys("True");
        driver.findElement(By.cssSelector("#spree_user_remember_me")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[name='commit']")).click();
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropdown);

        //System.out.println("The options available for Dropdown are : "+select.getOptions());
        select.selectByIndex(2);

        driver.findElement(By.cssSelector("input[value='Search']")).click();

        //Step 2

        driver.findElement(By.cssSelector("span[title='Spree Mug']")).click();
        driver.findElement(By.cssSelector("input#quantity")).clear(); // clear the deafult
        driver.findElement(By.cssSelector("input#quantity")).sendKeys("2");
        driver.findElement(By.cssSelector("button#add-to-cart-button")).click();
        Thread.sleep(2000);
        WebElement amount = driver.findElement(By.cssSelector("td[class='lead']"));
        String totalAmount = amount.getText();

        System.out.println("Total Amount "+totalAmount);


    }
}
