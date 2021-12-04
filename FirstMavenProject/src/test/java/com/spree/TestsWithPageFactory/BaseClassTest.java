package com.spree.TestsWithPageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IReporter;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BaseClassTest {

    WebDriver driver;

   public static ExtentHtmlReporter htmlReporter;

    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeClass
    public void reportSetup(){

       // htmlReporter = new ExtentHtmlReporter(".src/ExtentReport/extent.html");
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/ExtentReport/testReport.html");
        htmlReporter.config().setAutoCreateRelativePathMedia(true);

        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle( driver.getTitle());
        htmlReporter.config().setReportName("Spree Website Reports");
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        test = extent.createTest("New user order");
        test.log(Status.INFO,"Testing started");


    }


    @AfterMethod
    public void resultsReport(ITestResult result){


        test = extent.createTest(result.getName());

            if(result.getStatus()==ITestResult.FAILURE) {

                try {
                    TakesScreenshot screenshot = (TakesScreenshot) driver;
                    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

                    String screenshotPath = System.getProperty("user.dir")+"/screenshots/"+ result.getName() + ".png";
                    File destFile = new File(screenshotPath);
                   // File destFile = new File("./src/test/java/FailedScreenshots/" + result.getName() + ".png");
                    FileUtils.copyFile(srcFile, destFile);

                    String methodName = result.getMethod().getMethodName();

                    String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  FAILED" + "</b>";

                    Markup markup = MarkupHelper.createLabel(logText, ExtentColor.RED);
                    //test.log(Status.FAIL,m);
                    //test.addScreenCaptureFromPath(destFile.getAbsolutePath());


                    test.log(Status.FAIL, markup);
                    test.fail(result.getThrowable().getMessage());
                    test.addScreenCaptureFromPath(screenshotPath);

                } catch (Exception e) {
                    System.out.println("Exception while taking screenshot " + e.getMessage());
                }
            }else if(result.getStatus()==ITestResult.SUCCESS){
                String methodName = result.getMethod().getMethodName();

                String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  PASSED" + "</b>";

                Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
                test.log(Status.PASS,m);
                //test.pass(m);

            }else{

                System.out.println("Test Skipped");
            }
        }




    @BeforeTest
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="https://spree-vapasi-prod.herokuapp.com/login";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);




    }

    @AfterTest
    public void tearDown(){

        test.log(Status.INFO,"Testing started");
        extent.flush();
        driver.close();
        driver.quit();
    }




/*

          public void takeScreenshot(){

        //downcast the driver to access TakesScreenshot method

        TakesScreenshot ts = (TakesScreenshot)driver;
        //capture screenshot as output type FILE
        File file = ts.getScreenshotAs(OutputType.FILE);
        try {
//save the screenshot taken in destination path
            FileUtils.copyFile(file, new File("./src/screenshots/orderComplete.png"));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println("order Complete page screenshot is taken");

          }
*/


}
