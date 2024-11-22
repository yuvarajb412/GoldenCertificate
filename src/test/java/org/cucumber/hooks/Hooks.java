package org.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public  void  setDriver(){
        WebDriverManager.chromedriver().setup();
        driver=  new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void  tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public static WebDriver getDriver() {
    return driver;
    }

}
