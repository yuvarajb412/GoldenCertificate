package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class Iframe {

    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }


    @Test
    @Ignore
    public  void simpleFrame1(){

        driver.get("https://www.lambdatest.com/selenium-playground/");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//div/ul/li[@class='pt-10'][19]/a")).click();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//div[@class='rsw-toolbar']/following-sibling::div")).sendKeys("Yuvaraj");

        driver.switchTo().defaultContent();

        String actual=driver.findElement(By.xpath("//div[@class='w-12/12']/h1")).getText();
        System.out.println(actual);

        Assert.assertEquals(actual,"Simple iframe");


    }

    @Test
    @Ignore
    public void frameWebPage(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//div/ul/li[@class='pt-10'][19]/a")).click();



        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder']")).click();


        driver.findElement(By.xpath("//input[@id='docsearch-input']")).sendKeys("Lam");

        driver.switchTo().defaultContent();
        String actual=driver.findElement(By.xpath("//div[@class='w-12/12']/h1")).getText();
        System.out.println(actual);

        Assert.assertEquals(actual,"Simple iframe");


    }

    @Test
    public  void nestedFrame(){

        driver.get("https://the-internet.herokuapp.com/nested_frames");
//        driver.findElement(By.xpath("//div/ul/li[22]")).click();
//        driver.findElement(By.xpath("//div/ul/li[1]")).click();

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        String  actual=driver.findElement(By.xpath("//html//body")).getText();
        System.out.println(actual);




    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
       // driver.quit();

    }
}
