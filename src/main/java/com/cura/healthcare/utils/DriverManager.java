package com.cura.healthcare.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private WebDriver driver;

    public DriverManager (){
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless=new");
        // options.addArguments("--disable-gpu");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver(){
        driver.quit();
    }
}
