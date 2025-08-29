package com.cura.healthcare.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


   @CucumberOptions(features = {
        "src/test/resources/features/Authentication.feature",
        "src/test/resources/features/appointment.feature"

        
}, glue = {
        "com.cura.healthcare.definitions"
        
        
}, plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:target/cucumber-report/cucumber.json"
}
)
public class RunnerCuraTest extends AbstractTestNGCucumberTests {
}
 

