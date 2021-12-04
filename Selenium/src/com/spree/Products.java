package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Products {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url ="https://spree-vapasi-prod.herokuapp.com/";
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String keywordToSearch = "Spree";
        driver.findElement(By.cssSelector("input#keywords")).sendKeys(keywordToSearch);
        driver.findElement(By.cssSelector("input[data-disable-with='Search']")).click();
        List<WebElement> products = driver.findElements(By.cssSelector("div[id='products'] a"));

        System.out.println("Total number of products "+keywordToSearch+" : "+ products.size());

        driver.quit();

    }


}
