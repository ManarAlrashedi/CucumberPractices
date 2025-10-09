package stepdefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserRegistrationPage;

public class UserRegistrationStepDefinitions {


    UserRegistrationPage userRegistrationPage ;

    @When("user enter Ssn {string}")
    public void userEnterSsn(String ssn) {
      userRegistrationPage= new UserRegistrationPage();
      userRegistrationPage.ssn(ssn);
    }



    @And("user enter fname {string}")
    public void userEnterFname(String fname) {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.fname(fname);

    }

    @And("user enter lname {string}")
    public void userEnterLname(String lastName) {
        userRegistrationPage= new UserRegistrationPage();
      userRegistrationPage.lname(lastName);
    }


    @And("user enter address {string}")
    public void userEnterAddress(String Address) {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.address(Address);

    }


    @And("user enter phone number {string}")
    public void userEnterPhoneNumber(String phoneNumber) {
        userRegistrationPage= new UserRegistrationPage();
         userRegistrationPage.phoneNumber(phoneNumber);
    }

    @And("user enter username {string}")
    public void userEnterUsername(String userName) {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.userName(userName);

    }

    @And("user enter email {string}")
    public void userEnterEmail(String email) {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.email(email);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.password(password);

    }

    @And("user enter confirm password {string}")
    public void userEnterConfirmPassword(String confirmPassword) {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.confirmPassword(confirmPassword);
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.registerButton();
    }

    @Then("user should see registration success message")
    public void userShouldSeeRegistrationSuccessMessage() {
        userRegistrationPage= new UserRegistrationPage();
        userRegistrationPage.assertRegistrationSuccess();

    }
}
