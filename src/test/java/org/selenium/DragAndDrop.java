package org.selenium;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * drag and drop  and drag and drop by
 */

public class DragAndDrop {

    WebDriver driver;
    @BeforeMethod
    public void method(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    @Ignore
    public void dragAndDrop(){

        driver.get("https://www.lambdatest.com/selenium-playground/");

        driver.findElement(By.linkText("Drag and Drop")).click();

     WebElement drag= driver.findElement(By.xpath("//div[@id='todrag']/span[1]"));
     WebElement drop = driver.findElement(By.xpath("//div[@class='w-1/2']/div"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();

        String actual = driver.findElement(By.xpath("//div[@class='w-1/4']//span")).getText();
        System.out.println(actual);

        Assert.assertEquals(actual,"Draggable 1");
    }

    @Test
    public void dragAndDropBy(){
        driver.get("https://www.lambdatest.com/selenium-playground/");

        driver.findElement(By.linkText("Drag & Drop Sliders")).click();

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(driver.findElement(By.xpath("//div[@class='sp__range']/input")),-50,0).perform();







    }



    @AfterMethod
    public  void afterMethod() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }
}
