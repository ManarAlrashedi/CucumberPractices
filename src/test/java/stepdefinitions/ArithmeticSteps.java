package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ArithmeticPage;
import utilities.Driver;

public class ArithmeticSteps {


    ArithmeticPage page = new ArithmeticPage();

    @Given("I open the calculator page")
    public void i_open_the_calculator_page() {
        Driver.getDriver().get("https://web2.0calc.com/");
    }

    @When("I press 3 plus 3 and calculate")
    public void i_press_3_plus_3_and_calculate() {
        page.click3();
        page.clickPlus();
        page.click3();
        page.clickEqual();
    }

    @When("I press 3 minus 5 and calculate")
    public void i_press_3_minus_5_and_calculate() {
        page.click3();
        page.clickMinus();
        page.click5();
        page.clickEqual();
    }

    @When("I press 4 divided by 0 and calculate")
    public void i_press_4_divided_by_0_and_calculate() {
        page.click4();
        page.clickDivide();
        page.click0();
        page.clickEqual();
    }

    @Then("the result should contain {string}")
    public void the_result_should_contain(String expected) throws InterruptedException {
        Thread.sleep(1000);
        String result = page.getResult();
        Assert.assertTrue(result.contains(expected));
        Driver.closeDriver();
    }

    @Then("an error message should appear")
    public void an_error_message_should_appear() throws InterruptedException {
        Thread.sleep(1000);
        String result = page.getResult();
        Assert.assertTrue(result.toLowerCase().contains("divbyzero"));
        Driver.closeDriver();
    }
}