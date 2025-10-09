package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class CommonStepDefinitions {

    @Then("close browser")
    public void close_browser() {
        Driver.closeDriver();
    }

    @Given("user visits {string}")
    public void userVisits(String url) {
        Driver.getDriver().get(url);
    }
}
