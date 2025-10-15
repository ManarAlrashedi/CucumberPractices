package pages;

import org.openqa.selenium.By;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class SignUpPage {

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("email");
    private By password = By.id("password");
    private By submitBtn = By.id("submit");

    public SignUpPage enterFirstName(String fname) {
        Driver.getDriver().findElement(firstName).sendKeys(fname);
        return this;
    }
    public SignUpPage enterLastName(String lname) {
        Driver.getDriver().findElement(lastName).sendKeys(lname);
        return this;
    }
    public SignUpPage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public SignUpPage enterPassword(String pass) {
        Driver.getDriver().findElement(password).sendKeys(pass);
        return this;
    }

    public SignUpPage clickSubmitButton() {
        Driver.getDriver().findElement(submitBtn).click();
        return this;
    }

    public void assertUserCreated() {
        assertTrue(Driver.getDriver().findElement(By.tagName("h1")).isDisplayed());
    }
}
