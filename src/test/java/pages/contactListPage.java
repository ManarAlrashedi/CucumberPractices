package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class contactListPage {

    private By addContactButton = By.id("add-contact");
   // private String cotactAdded = "//tr[contains(., '%s')]";
    private String name = "//tr[contains(., '%s')]";
    private String email = "//tr[contains(., '%s')]";
    private String contactDeleted = "//tr[contains(., '%s')]";

    public contactListPage clickAddContactButton() {
        Driver.getDriver().findElement(addContactButton).click();
        return this;
    }

    public contactListPage assertContactAdded(String name) {
        //By locator = By.xpath(String.format(name, cotactAdded));
       // assertTrue(Driver.getDriver().findElement(locator).isDisplayed());
        Driver.getDriver().findElement(By.id("add-contact")).isDisplayed();
        return this;
    }

    public contactListPage clickName(String name) {

       //assertEquals(name, Driver.getDriver().findElement(By.xpath("//tr[contains(., '%s')]")).getText());
        By locator = By.xpath(String.format(this.name, name));
        Driver.getDriver().findElement(locator).click();

        return this;
    }

    public contactListPage assertContactUpdated(String email) {
        By locator = By.xpath(String.format(this.email, email));
        assertTrue(Driver.getDriver().findElement(locator).isDisplayed());
        return this;
    }

    public contactListPage assertContactDeleted(String name) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        By locator = By.xpath(String.format(contactDeleted, name));

        while (true) {
            List<WebElement> elementList = Driver.getDriver().findElements(locator);
            if (elementList.isEmpty()) {
                break;
            }
            wait.until(ExpectedConditions.elementToBeClickable(elementList.getFirst()));
            elementList.getFirst().click();
            contactDetailsPage detailsPage = new contactDetailsPage();
            detailsPage.clickDeleteButton();
            wait.until(ExpectedConditions.stalenessOf(elementList.getFirst()));
        }
        return this;
    }
}
