package com.cura.healthcare.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username = By.id("txt-username");
    private By password = By.id("txt-password");
    private By btnLogin = By.id("btn-login");
    private By errorMessage = By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]");

    public LoginPage(WebDriver driver){
        this.driver =driver;
    }
    
    public void setUsername(String value){
        driver.findElement(username).sendKeys(value);
    }

    public void setPassword(String value){
        driver.findElement(password).sendKeys(value);
    }

    public void clickLoginBtn(){
        driver.findElement(btnLogin).click();
    }

    public String getErrorMessage(){
    try {
        return driver.findElement(errorMessage).getText();
    }   catch (NoSuchElementException e){
        return null;
        }
    }

    public void performLogin(){
        setUsername("John Doe");
        setPassword("ThisIsNotAPassword");
        clickLoginBtn();
    }

    public void performLogin(String username, String password) {
    setUsername(username);
    setPassword(password);
    clickLoginBtn();
  }
    
}
