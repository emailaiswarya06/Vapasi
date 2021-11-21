package com.spree.TestsWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClassTest {

    WebDriver driver;
    @BeforeTest
    public void setDriver(){

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="https://spree-vapasi-prod.herokuapp.com/login";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @AfterTest
    public void tearDown(){

       // driver.close();
       // driver.quit();
    }

}
