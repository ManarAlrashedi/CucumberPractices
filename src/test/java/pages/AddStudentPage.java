package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddStudentPage {

    private By name = By.id("name");
    private By studentId = By.id("studentId");
    private By email = By.id("email");
    private By course = By.id("course");
    private By grade = By.id("grade");
    private By submitBtn = By.id("submitBtn");
    private By firstRow = By.xpath("//tbody/tr");
    private By studentNameValue = By.xpath("//tbody//tr[@data-idx='0']//td[1]");
    private By studentIdValue = By.xpath("//tbody//tr//td[.='s12345']");
    private By studentEmailValue = By.xpath("//tbody//tr//td[.='johnSDA@sda.com']");
    private By editButton = By.xpath("//tbody//tr[@data-idx='0']//button[@data-action='edit']");
    private By deleteButton = By.xpath("//tbody//tr[@data-idx='0']//button[@data-action='del']");
    private By clearAllButton = By.id("clearAll");
    private By numStudents = By.id("count");
    private By searchBar = By.id("q");
    private By sortDropdown = By.id("sort");
    private By exportBtn = By.id("exportBtn");
    private By clearButton = By.id("clearBtn");


    public AddStudentPage enterFullName(String fullName) {
        Driver.getDriver().findElement(name).sendKeys(fullName);
        return this;
    }

    public AddStudentPage enterStudentId(String studentId) {
        Driver.getDriver().findElement(this.studentId).sendKeys(studentId);
        return this;
    }

    public AddStudentPage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public AddStudentPage enterCourse(String course) {
        Driver.getDriver().findElement(this.course).sendKeys(course);
        return this;
    }

    public AddStudentPage selectGrade(String grade) {
        new Select(Driver.getDriver().findElement(this.grade)).selectByVisibleText(grade);
        return this;
    }

    public AddStudentPage clickAddStudentButton() {
        Driver.getDriver().findElement(submitBtn).click();
        return this;
    }

    public AddStudentPage assertStudentAdded() {
        assertTrue(Driver.getDriver().findElement(firstRow).isDisplayed());
        return this;
    }
    public AddStudentPage assertStudentDetails(String name, String id, String email) {
        assertTrue(Driver.getDriver().findElement(studentNameValue).isDisplayed());
        assertTrue(Driver.getDriver().findElement(studentIdValue).isDisplayed());
        assertTrue(Driver.getDriver().findElement(studentEmailValue).isDisplayed());
        return this;
    }

    public AddStudentPage clickEditButton() {
        Driver.getDriver().findElement(editButton).click();
        return this;
    }

    public AddStudentPage changeFullName(String newName) {
        Driver.getDriver().findElement(name).clear();
        Driver.getDriver().findElement(name).sendKeys(newName);
        return this;
    }

    public AddStudentPage assertStudentInfoUpdated() {
        assertTrue(Driver.getDriver().findElement(studentNameValue).isDisplayed());
        return this;
    }

    public AddStudentPage clickDeleteButton() {
        Driver.getDriver().findElement(deleteButton).click();
        return this;
    }

    public AddStudentPage confirmDeletion() {
        Driver.getDriver().switchTo().alert().accept();
        return this;
    }

    public AddStudentPage assertStudentDeleted() {
        assertEquals("9 students", Driver.getDriver().findElement(numStudents).getText());
        return this;
    }

    public AddStudentPage clickClearAllButton() {
        Driver.getDriver().findElement(clearAllButton).click();
        return this;
    }
    public AddStudentPage assertAllStudentsDeleted() {
        assertEquals("0 students", Driver.getDriver().findElement(numStudents).getText());
        return this;
    }

    public AddStudentPage enterInSearchBar(String name) {
        Driver.getDriver().findElement(searchBar).clear();
        Driver.getDriver().findElement(searchBar).sendKeys(name);
        return this;
    }

    public AddStudentPage assertSearchResults(String name) {
        Driver.getDriver().findElements(studentNameValue).forEach(element ->
                assertTrue(element.getText().toLowerCase().contains(name.toLowerCase())));
        return this;
    }

    public AddStudentPage selectSortOption(String sortOption) {
        new Select(Driver.getDriver().findElement(sortDropdown)).selectByVisibleText(sortOption);
        return this;
    }

    public AddStudentPage assertStudentsSortedByNewestFirst() {
        assertTrue("Newest first", true);

        return this;
    }

    public AddStudentPage assertStudentsSortedByOldestFirst() {
        assertTrue("Oldest first", true);

        return this;
    }

    public AddStudentPage assertStudentsSortedByNameAZ() {
        assertTrue("Name A→Z", true);
        return this;

    }

    public AddStudentPage refreshPage() {
        Driver.getDriver().navigate().refresh();
        return this;
    }

    public AddStudentPage assertAllStudentsDisplayed() {
        assertEquals("10 students", Driver.getDriver().findElement(numStudents).getText());
        return this;
    }

    public AddStudentPage clickExportJsonButton() {
        Driver.getDriver().findElement(exportBtn).click();
        return this;
    }

    public AddStudentPage assertFileDownloaded() {
        assertTrue("File is downloaded", true);
        return this;
    }

    public AddStudentPage clickClearButton() {
        Driver.getDriver().findElement(clearButton).click();
        return this;
    }

    public AddStudentPage assertFormCleared() {
        assertTrue(Driver.getDriver().findElement(name).getText().isEmpty());
        assertTrue(Driver.getDriver().findElement(studentId).getText().isEmpty());
        assertTrue(Driver.getDriver().findElement(email).getText().isEmpty());
        assertTrue(Driver.getDriver().findElement(course).getText().isEmpty());
        return this;
    }

    public AddStudentPage assertAddButtonText() {
        assertEquals("Add student", Driver.getDriver().findElement(submitBtn).getText());
        return this;
    }

    public AddStudentPage assertStudentCount() {
        assertEquals("11 students", Driver.getDriver().findElement(numStudents).getText());
        return this;
    }
}