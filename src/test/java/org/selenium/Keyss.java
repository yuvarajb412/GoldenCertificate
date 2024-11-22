package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyss {
    WebDriver driver;


    @BeforeMethod
    public  void  beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void keyPress(){

        driver.get("https://www.lambdatest.com/selenium-playground/");

        driver.findElement(By.linkText("Key Press")).click();
        WebElement keyPressBox = driver.findElement(By.id("my_field"));
        keyPressBox.sendKeys("Hiiiiiiiiiii123");

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("A")
                .keyDown(Keys.CONTROL)
                .sendKeys("x")
                .keyDown(Keys.CONTROL)
                 .sendKeys("v")
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                 .keyDown(Keys.DELETE)
                .perform();
    }

    @AfterMethod
    public  void afterMethod() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }
}
