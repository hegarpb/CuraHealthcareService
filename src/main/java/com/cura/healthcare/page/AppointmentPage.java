package com.cura.healthcare.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    private WebDriver driver;
    private By facility = By.id("combo_facility");
    private By checkReadmission= By.cssSelector("#chk_hospotal_readmission");
    private By radioPrograms = By.name("programs");
    private By visitDate = By.id("txt_visit_date");
    private By comment = By.id("txt_comment");
    private By btnBook = By.id("btn-book-appointment");
    private By confirmMessage = By.xpath("//h2[normalize-space()='Appointment Confirmation']");



    public AppointmentPage (WebDriver driver){
        this.driver= driver;
    }

    public void selectFacility(String facilityName){
        Select select = new Select(driver.findElement(facility));
        select.selectByVisibleText(facilityName);
    }

    public void setReadmission(boolean value){
        WebElement checkbox= driver.findElement(checkReadmission);
        if (checkbox.isSelected() != value){
            checkbox.click();
        }
    }

     public void selectProgram(String programName) {
        List<WebElement> radios = driver.findElements(radioPrograms);
        for (WebElement radio : radios) {
            if (radio.getAttribute("value").equalsIgnoreCase(programName)) {
                radio.click();
                break;
            }
        }
    }

        public void setVisitDate(String date) {
        driver.findElement(visitDate).sendKeys(date);
    }

  public void setComments (String coments){
    driver.findElement(comment).sendKeys(coments);
}


    public void clickBtnBook(){
        driver.findElement(btnBook).click();
    }

    public String getConfirmAppointment(){
        return driver.findElement(confirmMessage).getText();
    }

    public String getVisitDateValidationMessage() {
    return driver.findElement(visitDate).getAttribute("validationMessage");
}

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
    
}
