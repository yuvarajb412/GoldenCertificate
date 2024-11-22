package org.cucumber.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/search.feature"},
        glue = {"org.cucumber.stepdef","org.cucumber.hooks"}
)



public class TestRunner extends AbstractTestNGCucumberTests {


}
