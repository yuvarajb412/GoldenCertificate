package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandles {

   WebDriver driver;

    @BeforeMethod
    public  void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }


    @Test
    public void internetWindow(){
        driver.get("https://the-internet.herokuapp.com/windows");


        WebElement element = driver.findElement(By.xpath("(//div//div//div/a)[1]"));
        String mainWindow = driver.getWindowHandle();
        element.click();
        Set<String> el= driver.getWindowHandles();

        for (String s:el){
            if(!mainWindow.equals(s)){
                driver.switchTo().window(s);
            }
        }
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"New Window");
        driver.close();

    }

    @Test
    public void multiPWindow() throws InterruptedException {

        driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");


        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("(//div[starts-with(@class,'mt-30 rounded')]/div[1]/a)[2]")).click();

        Thread.sleep(5000);
        Set<String> total = driver.getWindowHandles();
        System.out.println(total.size());

        for (String s: total){

            driver.switchTo().window(s);

            if(driver.getTitle().equals("LambdaTest | Facebook")){

                String toremove=driver.getWindowHandle();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

                driver.findElement(By.xpath("//input[@id=':r2:' and starts-with(@class,'x1i')]")).sendKeys("hello");
                driver.findElement(By.xpath("//input[@id=':r5:']")).sendKeys("123");
                driver.findElement(By.xpath("(//div[@class='x1c436fg']/div/div)[2]")).click();

               String actual = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
               Assert.assertTrue(actual.contains("The password"));


               total.remove(toremove);

               driver.close();

            }


        }

       // driver.switchTo().window(mainWindow);

        for (String s:total){
            if(!s.equals(mainWindow)){
                driver.switchTo().window(s);
                driver.close();
                total.remove(s);
            }

        }

        System.out.println(total.size());

        driver.quit();



    }
}
