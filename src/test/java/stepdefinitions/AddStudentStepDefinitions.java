package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import pages.AddStudentPage;

public class AddStudentStepDefinitions {
    AddStudentPage studentPage;


    @When("user enters full name {string}")
    public void user_enters_full_name(String name) {
        studentPage = new AddStudentPage();
        studentPage.enterFullName(name);


    }

    @When("user enters student id {string}")
    public void user_enters_student_id(String id) {
        studentPage = new AddStudentPage();
        studentPage.enterStudentId(id);

    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
        studentPage = new AddStudentPage();
        studentPage.enterEmail(email);
    }

    @When("user enters course {string}")
    public void user_enters_course(String course) {
        studentPage = new AddStudentPage();
        studentPage.enterCourse(course);
    }

    @When("user selects grade {string}")
    public void user_selects_grade(String grade) {
        studentPage = new AddStudentPage();
        studentPage.selectGrade(grade);
    }

    @When("user click on add student button")
    public void user_click_on_add_student_button() {
        studentPage = new AddStudentPage();
        studentPage.clickAddStudentButton();
    }

    @Then("assert that student is added")
    public void assert_that_student_is_added() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentAdded();
    }

    @Then("assert that error message is displayed as {string}")
    public void assertThatErrorMessageIsDisplayedAs(String message) {

    }

    @Given("student named {string} with ID {string}, email {string}")
    public void student_named_with_id_email(String name, String id, String email) {
        studentPage = new AddStudentPage();
        studentPage.assertStudentDetails(name, id, email);
    }
    @When("user click Edit button")
    public void user_click_edit_button() {
        studentPage = new AddStudentPage();
        studentPage.clickEditButton();
    }
    @When("user change the full name to {string}")
    public void user_change_the_full_name_to(String name) {
        studentPage = new AddStudentPage();
        studentPage.changeFullName(name);
    }
    @When("user click save changes button")
    public void user_click_save_changes_button() {
        studentPage = new AddStudentPage();
        studentPage.clickAddStudentButton();
    }
    @Then("assert that student information is updated")
    public void assert_that_student_information_is_updated() {
       studentPage = new AddStudentPage();
       studentPage.assertStudentInfoUpdated();

    }

    @When("user click Delete button")
    public void user_click_delete_button() {
        studentPage = new AddStudentPage();
        studentPage.clickDeleteButton();
    }
    @When("user confirms the deletion")
    public void user_confirms_the_deletion() {
        studentPage = new AddStudentPage();
        studentPage.confirmDeletion();
    }
    @Then("assert that student is deleted")
    public void assert_that_student_is_deleted() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentDeleted();
    }

    @When("user click on Clear all button")
    public void user_click_on_clear_all_button() {
        studentPage = new AddStudentPage();
        studentPage.clickClearAllButton();
    }
    @Then("assert that all students are deleted")
    public void assert_that_all_students_are_deleted() {
        studentPage = new AddStudentPage();
        studentPage.assertAllStudentsDeleted();
    }

    @When("user enters {string} in the search bar")
    public void user_enters_in_the_search_bar(String name) {
        studentPage = new AddStudentPage();
        studentPage.enterInSearchBar(name);
    }
    @Then("assert that only students matching {string} are displayed")
    public void assert_that_only_students_matching_are_displayed(String string) {
        studentPage = new AddStudentPage();
        studentPage.assertSearchResults(string);
    }

    @When("user selects {string} from the sort dropdown")
    public void user_selects_from_the_sort_dropdown(String sortOption) {
        studentPage = new AddStudentPage();
        studentPage.selectSortOption(sortOption);
    }
    @Then("assert that students are sorted by newest first")
    public void assert_that_students_are_sorted_by_newest_first() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentsSortedByNewestFirst();
    }
    @Then("assert that students are sorted by oldest first")
    public void assert_that_students_are_sorted_by_oldest_first() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentsSortedByOldestFirst();
    }
    @Then("assert that students are sorted alphabetically by name A→Z")
    public void assert_that_students_are_sorted_alphabetically_by_name_a_z() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentsSortedByNameAZ();
    }

    @When("user refreshes the page")
    public void user_refreshes_the_page() {
        studentPage = new AddStudentPage();
        studentPage.refreshPage();
    }
    @Then("assert that all previously added students are still displayed")
    public void assert_that_all_previously_added_students_are_still_displayed() {
        studentPage = new AddStudentPage();
        studentPage.assertAllStudentsDisplayed();
    }

    @When("user clicks on Export JSON button")
    public void user_clicks_on_export_json_button() {
        studentPage = new AddStudentPage();
        studentPage.clickExportJsonButton();
    }
    @Then("assert that a JSON file is downloaded")
    public void assert_that_a_json_file_is_downloaded() {
        studentPage = new AddStudentPage();
        studentPage.assertFileDownloaded();
    }

    @When("user click on Clear fields button")
    public void user_click_on_clear_fields_button() {
        studentPage = new AddStudentPage();
        studentPage.clickClearButton();
    }
    @Then("assert that all form fields are empty")
    public void assert_that_all_form_fields_are_empty() {
        studentPage = new AddStudentPage();
        studentPage.assertFormCleared();
    }
    @Then("assert that the add button text is Add Student")
    public void assert_that_the_add_button_text_is_add_student() {
        studentPage = new AddStudentPage();
        studentPage.assertAddButtonText();
    }

    @When("user adds a student")
    public void user_adds_a_student() {
        studentPage = new AddStudentPage();
        studentPage.enterFullName("Hadi");
        studentPage.enterEmail("hadiSDA@sda.com");
        studentPage.enterStudentId("s06783");
        studentPage.enterCourse("Math");
        studentPage.selectGrade("A");
        studentPage.clickAddStudentButton();
    }
    @Then("assert that the student count is displayed")
    public void assert_that_the_student_count_is_displayed() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentCount();
    }
    @When("user deletes a student")
    public void user_deletes_a_student() {
        studentPage = new AddStudentPage();
        studentPage.clickDeleteButton();
        studentPage.confirmDeletion();
    }


    @Then("assert that the student count is changed")
    public void assert_that_the_student_count_is_changed() {
        studentPage = new AddStudentPage();
        studentPage.assertAllStudentsDisplayed();
    }
}
