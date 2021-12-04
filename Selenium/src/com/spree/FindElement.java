package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

    public static void main(String[] args) {
       String url ="https://spree-vapasi-prod.herokuapp.com/login";
        //String url ="https://spree-vapasi-prod.herokuapp.com/signup";
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
       /* driver.findElement(By.id("taxon")).sendKeys("Brands");
        driver.findElement(By.cssSelector("input[data-disable-with='Search']")).click();*/
       // driver.findElement(By.xpath("//a[href='/signup']")).click();
        driver.findElement(By.cssSelector("a[href='/signup']")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("user1@gmail.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys("Password@1");
        driver.findElement(By.cssSelector("input[id='spree_user_password_confirmation']")).sendKeys("Password@1");
        driver.findElement(By.cssSelector("input[data-disable-with='Create']")).click();


    }
}
