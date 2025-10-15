package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class EditPage {

    //private By firstName = By.xpath("//input[@id='firstName']");
    //private By lastName = By.xpath("//input[@id='lastName']");
    private By email = By.id("email");
    private By submitBtn = By.id("submit");

   /* public EditPage editFirstName(String firstname) {
        Driver.getDriver().findElement(firstName).clear();
        Driver.getDriver().findElement(firstName).sendKeys(firstname);
        return this;
    }
    public EditPage editLastName(String lastname) {
        Driver.getDriver().findElement(lastName).clear();
        Driver.getDriver().findElement(lastName).sendKeys(lastname);
        return this;
    }*/

    public EditPage editEmail(String email1) {
        Driver.getDriver().findElement(email).clear();
        Driver.getDriver().findElement(email).sendKeys(email1);
        return this;
    }
    public EditPage clickSubmitButton() {
        Driver.getDriver().findElement(submitBtn).click();
        return this;
    }


}
