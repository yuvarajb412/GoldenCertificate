package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoubleClick {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
    }

    @Test
    public void doubleClick() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();

        String actual= driver.switchTo().alert().getText();
        System.out.println(actual);
          driver.switchTo().alert().accept();

        Assert.assertEquals(actual,"You double clicked me.. Thank You..");

        Thread.sleep(2000);
        driver.quit();
    }
}
