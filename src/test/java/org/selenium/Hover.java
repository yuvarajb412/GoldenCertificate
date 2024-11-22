package org.selenium;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * Actions move
 * to element - hover
 */

public class Hover {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/");
        driver.get("https://www.lambdatest.com/selenium-playground/");

    }

    @Test
    @Ignore
    public void hover(){

        driver.findElement(By.linkText("Hovers")).click();

        Actions actions = new Actions(driver);

      WebElement element= driver.findElement(By.xpath("//div[@class='figure'][2]"));

           actions.moveToElement(element)
                   .click(driver.findElement(By.xpath("(//a[text()='View profile'])[2]")))
                   .build()
                   .perform();
           String actual=  driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(actual,"Not Found");

    }

    @Test
    public void hoverBlack(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Platform ']"))).
                click(driver.findElement(By.xpath(" //p[starts-with(text(),'Online Browser')]"))).
                perform();



    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {

        Thread.sleep(2000);
       driver.quit();
    }


}
