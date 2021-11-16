package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.DialogContent;
import utilities.SingeltonDriver;

public class _01_zu_ebay {

    DialogContent d=new DialogContent();
    @Given("^Navigate to ebay$")
    public void navigate_to_ebay() {
        WebDriver driver= SingeltonDriver.getDriver();
        driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.manage().window().maximize();
        d.finElementandClick("cookiesAkzeptieren");

    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        d.verifElement("loginVerify","Alle anzeigen");
    }
}
