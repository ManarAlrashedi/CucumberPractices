package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;



public class ArithmeticPage {

    public ArithmeticPage() {
    PageFactory.initElements(Driver.getDriver(), this);
    }

    private By inputField = By.id("input");
    private By btn3 = By.id("Btn3");
    private By btn4 = By.id("Btn4");
    private By btn5 = By.id("Btn5");
    private By btn0 = By.id("Btn0");
    private By btnPlus = By.id("BtnPlus");
    private By btnMinus = By.id("BtnMinus");
    private By btnDiv = By.id("BtnDiv");
    private By btnCalc = By.id("BtnCalc");


    public void click3() {
        Driver.getDriver().findElement(btn3).click();
    }

    public void click4() {
        Driver.getDriver().findElement(btn4).click();
    }

    public void click5() {
        Driver.getDriver().findElement(btn5).click();
    }

    public void click0() {
        Driver.getDriver().findElement(btn0).click();
    }

    public void clickPlus() {
        Driver.getDriver().findElement(btnPlus).click();
    }

    public void clickMinus() {
        Driver.getDriver().findElement(btnMinus).click();
    }

    public void clickDivide() {
        Driver.getDriver().findElement(btnDiv).click();
    }

    public void clickEqual() {
        Driver.getDriver().findElement(btnCalc).click();
    }

    public String getResult() {
        return Driver.getDriver().findElement(inputField).getAttribute("value").trim();
    }
}