package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class CLLoginPage extends contactListPage{

    private By email = By.id("email");
    private By password = By.id("password");
    private By loginBtn = By.id("submit");

    public CLLoginPage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }
    public CLLoginPage enterPassword(String password) {
        Driver.getDriver().findElement(this.password).sendKeys(password);
        return this;
    }
    public CLLoginPage clickLoginButton() {
        Driver.getDriver().findElement(loginBtn).click();
        return this;
    }

    public CLLoginPage assertUserLoggedIn() {
        Driver.getDriver().findElement(By.id("add-contact")).isDisplayed();
        return this;
    }
}
