package com.cura.healthcare.definitions.authentications;

import org.testng.Assert;

import com.cura.healthcare.page.AppointmentPage;
import com.cura.healthcare.page.LoginPage;
import com.cura.healthcare.utils.DriverUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginSteps {

    LoginPage loginPage;
    AppointmentPage appointmentPage;


    @Given("pengguna masuk ke halaman login.")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage= new LoginPage(DriverUtil.getDriver());
    }
    
    @When("pengguna memasukkan username {string}.")
    public void step02(String username){
        loginPage.setUsername(username);
    }

    @And ("pengguna memasukkan password {string}.")
    public void step03(String password){
        loginPage.setPassword(password);
    }
    @And("pengguna menekan tombol login.")
    public void step04(){
        loginPage.clickLoginBtn();
    }

      @Then("pengguna akan di bawa ke halaman appointment dengan url {string} untuk memeriksa hasil test.")
    public void loginSucces(String url){
        appointmentPage = new AppointmentPage(DriverUtil.getDriver());
        Assert.assertEquals(appointmentPage.getCurrentURL(),url);
    }
    

    @Then("pengguna akan melihat pesan kesalahan {string}.")
    public void step05(String message){
        Assert.assertEquals(loginPage.getErrorMessage(),message);
    }
}
