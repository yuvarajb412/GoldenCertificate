package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenImage {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void brokenImage() throws IOException {
        driver.get("https://www.lambdatest.com/selenium-playground/broken-image");

       List<WebElement> image = driver.findElements(By.xpath("(//div[@class='container'])[2]/div/div/div/div/img"));
        System.out.println(image.size());

       for (WebElement element : image){

           String va=element.getAttribute("src");

           URL url = new URL(va);
           URLConnection connections= url.openConnection();

           HttpURLConnection connection = (HttpURLConnection) connections;


           connection.connect();

           System.out.println( connection.getResponseCode()+ "  "+ connection.getResponseMessage()+" "+connection.getURL());
           connection.disconnect();

       }



    }

    @Test
    public void brokenLink() throws IOException {
        driver.get("https://www.lambdatest.com/selenium-playground/");

        List<WebElement> link = driver.findElements(By.xpath("(//div/section)[3]/div/ul/li/a"));


        for (WebElement element: link){
            String href = element.getAttribute("href");

            URL url = new URL(href);
           URLConnection connection= url.openConnection();

           HttpURLConnection httpURLConnection =(HttpURLConnection) connection;
           httpURLConnection.connect();

            System.out.println(httpURLConnection.getResponseCode()+" "+httpURLConnection.getResponseMessage());

            httpURLConnection.disconnect();

        }

    }
}
