package com.cura.healthcare.definitions;



import org.testng.Assert;

import com.cura.healthcare.page.AppointmentPage;
import com.cura.healthcare.page.LoginPage;
import com.cura.healthcare.utils.DriverUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingAppointmentTest {
    LoginPage loginPage;
    AppointmentPage appointmentPage;

    @Given("user berada di halaman Make Appointment")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage = new LoginPage(DriverUtil.getDriver());
        loginPage.performLogin();
        appointmentPage = new AppointmentPage(DriverUtil.getDriver());
    }
    
    @When("user memilih fasilitas {string}")
    public void step02(String facility){
        appointmentPage.selectFacility(facility);
    }

    @When("user mencentang Apply for hospital readmission")
    public void step03(){
        appointmentPage.setReadmission(true);
    }

    @When("user memilih program kesehatan {string}")
    public void step04(String program){
        appointmentPage.selectProgram(program);
    }

    @When("user memasukkan tanggal kunjungan {string}")
    public void step05(String date){
        appointmentPage.setVisitDate(date);
    }

    @When("user memasukkan komentar {string}")
    public void step06(String comments){
        appointmentPage.setComments(comments);
    }

    @When("user menekan tombol Book Appointment")
    public void step07() throws InterruptedException{
        appointmentPage.clickBtnBook();
        Thread.sleep(2000);
    }

    @Then("user berhasil membuat janji temu dan melihat konfirmasi")
    public void step08() {
        
        String confirmationTitle= appointmentPage.getConfirmAppointment();
        Assert.assertEquals(confirmationTitle, "Appointment Confirmation");
        
    }
     @Then("muncul pesan validasi {string}")
    public void muncul_pesan_validasi(String expectedMessage) {
        String validation = appointmentPage.getVisitDateValidationMessage();
        Assert.assertEquals(validation, expectedMessage, "Pesan validasi tidak sesuai!");
    }

    
    
   

}
