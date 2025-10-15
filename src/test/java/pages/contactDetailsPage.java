package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class contactDetailsPage {

    private By editButton = By.id("edit-contact");
    private By returnButton = By.id("return");
    private By deleteButton = By.id("delete");

    public contactDetailsPage clickEditButton() {
        Driver.getDriver().findElement(editButton).click();
        return this;
    }

    public contactDetailsPage clickReturnButton() {
        Driver.getDriver().findElement(returnButton).click();
        return this;
    }

    public contactDetailsPage clickDeleteButton() {
        Driver.getDriver().findElement(deleteButton).click();
        Driver.getDriver().switchTo().alert().accept();
        return this;
    }
}
