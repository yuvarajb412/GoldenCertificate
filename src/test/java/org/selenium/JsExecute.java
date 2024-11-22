package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class JsExecute {
    WebDriver driver;

    @BeforeMethod
    public  void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void scrollToElement(){
        driver.get("https://www.lambdatest.com/selenium-playground/table-records-filter-demo");
      WebElement element= driver.findElement(By.xpath("(//div[@class='flex smtablet:block']/div[2]/div)[1]"));

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }



    @Test
    public void ScrollToBottom(){
        driver.get("https://www.lambdatest.com/selenium-playground/table-records-filter-demo");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        executor.executeScript("window.scrollTo (0,0);");

    }


    @Test
    public void scrollBy(){
        driver.get("https://www.lambdatest.com/selenium-playground/table-records-filter-demo");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800);");
    }

    @Test
    public void click(){

        driver.get("https://www.lambdatest.com/selenium-playground/");

        WebElement element = driver.findElement(By.linkText("Auto Healing"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",element);
    }

    @Test
    public  void  send(){

        driver.get("https://www.lambdatest.com/selenium-playground/");

        WebElement element = driver.findElement(By.linkText("Auto Healing"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",element);

        executor.executeScript("arguments[0].value= 'yuvaraj';",driver.findElement(By.id("username")));


        System.out.println("-------------------------------------------------------------------------------");

        executor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("username")));
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        executor.executeScript("window.scrollTo(0,0);");
        executor.executeScript("window.scrollBy(0,600);");






    }
}