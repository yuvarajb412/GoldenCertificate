package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class P {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.iplt20.com/points-table/men/2024");
    }

    @Test
    public  void pointsTable(){

        List<WebElement> elements = driver.findElements(By.xpath("//table//tbody[2]//tr"));


        LinkedHashMap<Integer,List<String>>  value= new LinkedHashMap<>();

        for (int i=0;i<elements.size();i++){

          WebElement pointTableName= driver.findElements(By.xpath("//td[3]//h2")).get(i);
            //tbody[2]/tr/td[3]/div/h2
          String teamName= pointTableName.getText();
          String pointTablePoint = driver.findElements(By.xpath("//tr//td[11]")).get(i).getText();
            Integer  point=Integer.valueOf(pointTablePoint);


            value.putIfAbsent(point,new ArrayList<>());
            value.get(point).add(teamName);

        }


        for (Map.Entry<Integer,List<String>>  entry : value.entrySet()){

            System.out.println(entry.getKey()+ "  "+ entry.getValue());

        }


    }




    @AfterMethod
    public void AfterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
