package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShadowElement {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void  shadow(){
        driver.get("https://www.lambdatest.com/selenium-playground/shadow-dom");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        String name= "return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"div>input\")";

      WebElement nameElement =(WebElement) js.executeScript(name);
      nameElement.sendKeys("hello");

      String email ="return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"input[type='email']\")";

      WebElement  emailElement =(WebElement) js.executeScript(email);
      emailElement.sendKeys("dnvjsmn vms vm ");

      WebElement rangeElement =(WebElement) js.executeScript("return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"input[type='range']\")");

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(rangeElement,1000,0).build().perform();

    }

    @Test
    public void login(){

        driver.get("https://www.lambdatest.com/selenium-playground/shadow-dom");

        JavascriptExecutor executor = (JavascriptExecutor)driver;

        WebElement userName=(WebElement) executor.executeScript("return document.querySelector(\"shadow-signup-form\").shadowRoot.querySelector(\"input[name='username']\")");
        userName.sendKeys("hello");

        WebElement emailAddress=(WebElement) executor.executeScript("return document.querySelector(\"shadow-signup-form\").shadowRoot.querySelector(\"input[name='email']\")");
        emailAddress.sendKeys("adhbvjhdsdnabv");

        WebElement password =(WebElement) executor.executeScript("return document.querySelector(\"shadow-signup-form\").shadowRoot.querySelector(\"input[name='password']\")");
        password.sendKeys("vbhjsabvhjbv");



        WebElement cPassword =(WebElement) executor.executeScript("return document.querySelector(\"shadow-signup-form\").shadowRoot.querySelector(\"input[name='confirm_password']\")");
         cPassword.sendKeys("vbhjsabvhjbv");


         WebElement submit =(WebElement) executor.executeScript("return document.querySelector(\"shadow-signup-form\").shadowRoot.querySelector(\"button[type='button']\")");
         submit.click();

    }


    @Test
    public void complexShadow(){

        driver.get("https://developer.salesforce.com/");
        String d= "return document.querySelector(\"dx-section:nth-of-type(2)\").querySelector('dx-button')";

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement element =(WebElement) executor.executeScript(d);
        element.click();
    }
}
