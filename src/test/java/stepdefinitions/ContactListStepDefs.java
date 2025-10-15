package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import pages.*;

public class ContactListStepDefs {

    SignUpPage signUpPage;
    CLLoginPage loginPage;
    contactListPage contactListPage;
    EditPage editPage;
    contactDetailsPage contactDetailsPage;

    @When("user enters firstName {string}")
    public void userEntersFirstName(String fname) {
        signUpPage = new SignUpPage();
        signUpPage.enterFirstName(fname);
    }

    @And("user enters lastName {string}")
    public void userEntersLastName(String lname) {
        signUpPage = new SignUpPage();
        signUpPage.enterLastName(lname);
    }


    @And("user enter contact list password {string}")
    public void userEnterPassword(String pass) {
        signUpPage = new SignUpPage();
        signUpPage.enterPassword(pass);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        signUpPage = new SignUpPage();
        signUpPage.clickSubmitButton();
    }
    @Then("assert that user is created")
    public void assert_that_user_is_created() {
        signUpPage = new SignUpPage();
        signUpPage.assertUserCreated();
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage = new CLLoginPage();
        loginPage.clickLoginButton();
    }

    @Then("assert that user is logged in")
    public void assertThatUserIsLoggedIn() {
        loginPage = new CLLoginPage();
        loginPage.assertUserLoggedIn();
    }

    @When("user clicks on add contact button")
    public void userClicksOnAddContactButton() {
        contactListPage = new contactListPage();
        contactListPage.clickAddContactButton();
    }

    @Then("assert that contact {string} is added")
    public void assertThatContactIsAdded(String name) {
        contactListPage = new contactListPage();
        contactListPage.assertContactAdded(name);
    }

    @When("user edits the contact contains {string}")
    public void userEditsTheContactContains(String name) {
        contactListPage = new contactListPage();
        contactListPage.clickName(name);
    }

    @And("user clicks on edit button")
    public void userClicksOnEditButton() {
        contactDetailsPage = new contactDetailsPage();
        contactDetailsPage.clickEditButton();

    }

    @Then("assert that contact {string} is edited")
    public void assertThatContactIsEdited(String name) {
        contactDetailsPage = new contactDetailsPage();
        contactDetailsPage.clickReturnButton();
        contactListPage = new contactListPage();
        contactListPage.assertContactUpdated(name);
    }


    @And("user enter contact list email {string}")
    public void userEnterContactListEmail(String email) {
        editPage = new EditPage();
        editPage.editEmail(email);
    }

    @When("user click on cotact contains {string}")
    public void user_click_on_cotact_contains(String name) {
        contactListPage = new contactListPage();
        contactListPage.clickName(name);
    }
    @When("user clicks on delete button")
    public void user_clicks_on_delete_button() {
        contactDetailsPage = new contactDetailsPage();
        contactDetailsPage.clickDeleteButton();
    }
    @Then("assert that contact {string} is deleted")
    public void assert_that_contact_is_deleted(String name) {
        contactListPage = new contactListPage();
        contactListPage.assertContactDeleted(name);
    }
}
