package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserRegistrationPage {

    public UserRegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "first-name")
    public WebElement fname;

    @FindBy(id = "last-name")
    public WebElement lname;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "phone")
    public WebElement phoneNumber;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "confirm-password")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"registrationForm\"]/button")
    public WebElement registerButton;

    @FindBy(id = "successMessage") // Change this to match your actual success message locator
    public WebElement registrationSuccessMsg;


    public void ssn(String ssn) { this.ssn.sendKeys(ssn); }

    public void fname(String fname) { this.fname.sendKeys(fname);}

    public void lname(String lastName) { this.lname.sendKeys(lastName);}

    public void address(String Address) {
        this.address.sendKeys(Address);
    }

    public void phoneNumber(String phoneNumber) {
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void userName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void email(String email) {
        this.email.sendKeys(email);
    }

    public void password(String password) {
        this.password.sendKeys(password);
    }

    public void confirmPassword(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public void registerButton() {
        registerButton.click();
    }

    public void assertRegistrationSuccess() {
        String actualMsg = registrationSuccessMsg.getText();
        Assert.assertEquals("Registration success message text is incorrect!", "User registered successfully! Log In", actualMsg);
    }
}

