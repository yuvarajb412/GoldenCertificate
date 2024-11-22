package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChallengingDom {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

    }

    @Test
    public void dom(){


        List<WebElement> list=  driver.findElements(By.xpath("//tbody//tr"));

        HashMap<String,String> H= new HashMap<>();
        for (int i=0;i<list.size();i++){

             String lorem=  driver.findElements(By.xpath("//td[1]")).get(i).getText();
             String amet = driver.findElements(By.xpath("//td[4]")).get(i).getText();

             H.put(lorem,amet);

        }

        for (Map.Entry<String,String> entry:H.entrySet()){

            System.out.println(entry.getKey()+  "     "+ entry.getValue());
        }


    }
}
