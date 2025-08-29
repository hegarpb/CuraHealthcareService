// package com.cura.healthcare.definitions.authentications;

// import org.testng.Assert;

// import com.cura.healthcare.page.AppointmentPage;
// import com.cura.healthcare.page.LoginPage;
// import com.cura.healthcare.utils.DriverUtil;

// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;

// public class PositiveLoginSteps {
//     LoginPage loginPage;
//     AppointmentPage appointmentPage;

//     @Given("saat menguji test positive, pengguna masuk ke halaman login.")
//     public void step01(){
//         DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
//         loginPage= new LoginPage(DriverUtil.getDriver()); 
//     }
//     @When("pengguna melakukan login dengan username {string} dan password {string} yang valid.")
//     public void step02(String username, String password){
//         loginPage.performLogin(username,password);
//     }

//     @Then("pengguna akan di bawa ke halaman appointment dengan url {string} untuk memeriksa hasil test.")
//     public void step03(String url){
//         appointmentPage = new AppointmentPage(DriverUtil.getDriver());
//         Assert.assertEquals(appointmentPage.getCurrentURL(),url);
//     }
    
// }
