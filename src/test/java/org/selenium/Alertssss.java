package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Alertssss {

    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Ignore
    public  void alert(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        driver.findElement(By.xpath("//ul/li[3]/button")).click();


        Alert alert= driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

    }

    @Test
    public void popUp(){



    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }


}
