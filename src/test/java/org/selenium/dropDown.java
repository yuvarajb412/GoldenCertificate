package org.selenium;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class dropDown {

    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }



    @Test
    @Ignore
    public void singleSelect(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.findElement(By.linkText("Select Dropdown List")).click();

        WebElement element
                = driver.findElement(By.id("select-demo"));

        Select select = new Select(element);

        select.selectByIndex(1);

        String actual = driver.findElement(By.xpath("//p[starts-with(@class,'selected-value')] ")).getText();

        Assert.assertTrue(actual.contains("Sunday"));

        System.out.println( select.getAllSelectedOptions().getFirst().getText());
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println(select.getOptions().getFirst().getText());


    }

    @Test
    public void multiSelect(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.findElement(By.xpath("//div/ul/li[@class=\"pt-10\"][32]")).click();

        WebElement element = driver.findElement(By.id("multi-select"));

        Select select = new Select(element);
        List<WebElement> all =select.getOptions();


        System.out.println(all.size());

        for (int i=0;i<all.size();i++){

            if(i==2){

            }else {
                String w = all.get(i).getText();
                select.selectByVisibleText(w);
            }
        }

        select.deselectAll();


    }




    @AfterMethod
    public void afterMethod() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }
}
