package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClickAndSendKeys {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/");

    }


    /**
     * click()
     * sendkey()
     * getAttribute()
     * getTitle()
     * AutoHelling()
     * submit();
     * clear()
     * getText();
     *
     */
    @Test

    public void clickAndSendKeys(){

     driver.findElement(By.xpath("//a[text()='Auto Healing']")).click();
     WebElement element=driver.findElement(By.id("username"));
     element.sendKeys("Yuvaraj");
     driver.findElement(By.id("password")).sendKeys("Samson#11");
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();

      String  actual=   driver.findElement(By.xpath("//p[starts-with(@class,'text-green')]")).getText();

        System.out.println("hello"+ element.getAttribute("class"));
        System.out.println(driver.getTitle());

        Assert.assertEquals(actual,"Login Successful");
    }



    @AfterMethod
    public void afterMethod() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();
    }


}
