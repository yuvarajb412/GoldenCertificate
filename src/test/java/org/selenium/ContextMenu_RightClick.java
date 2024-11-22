package org.selenium;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenu_RightClick {

    WebDriver driver;



    @BeforeMethod
    public  void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void rightClick(){

        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.findElement(By.linkText("Context Menu")).click();

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot")))
                .perform();

        Alert alert = driver.switchTo().alert();
         String actual = alert.getText();
         alert.accept();

        Assert.assertEquals(actual,"You selected a context menu");



    }


    @AfterMethod
    public void afterMethod() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }


}
