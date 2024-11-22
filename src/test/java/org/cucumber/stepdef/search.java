package org.cucumber.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.cucumber.hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class search {

     private WebDriver driver = Hooks.getDriver();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println(" I am on the login page");
        driver.get("https://www.lambdatest.com/selenium-playground/auto-healing");
    }
    @When("user enter following Creditails:")
    public void user_enter_following_creditails(DataTable dataTable) {
        List<Map<String,String>> value = dataTable.asMaps();

      WebElement name= driver.findElement(By.id("username"));
      WebElement password= driver.findElement(By.id("password"));
      WebElement submit= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));


     for (int i=0;i<value.size();i++){

         Map<String,String> detail = value.get(i);
             String username= detail.get("username");
             name.clear();
             name.sendKeys(username);
             String pass=detail.get("password");
             password.clear();
             password.sendKeys("pass");
             submit.click();


     }



    }
    @Then("validating the alert message")
    public void validating_the_alert_message() {
        System.out.println("one one");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      String actual=  driver.findElement(By.xpath("(//form[starts-with(@siq_id,'autopick')])[2]/p")).getText();
        Assert.assertEquals(actual,"Login Successful");
    }


}
