package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SingeltonDriver;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(SingeltonDriver.getDriver(), this);

    }

    @FindBy(id = "gdpr-banner-accept")
    public WebElement cookiesAkzeptieren;

    @FindBy(id = "site-search-submit")
    public WebElement searchButtonClick;

    WebElement element;

    public void finElementandSendKeys(String elementName, String value) {
        switch (elementName) {


        }

        sendKeysFunction(element, value);

    }

    public void finElementandClick(String elementName) {
        switch (elementName) {

            case "cookiesAkzeptieren":
                element = cookiesAkzeptieren;
                break;
        }

        ClickFunction(element);

    }


}
