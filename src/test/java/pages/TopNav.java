package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SingeltonDriver;

public class TopNav extends Parent {

    public TopNav() {
        PageFactory.initElements(SingeltonDriver.getDriver(), this);

    }

    @FindBy(id = "site-search-query")
    public WebElement searchButton;

    @FindBy(id = "site-search-submit")
    public WebElement searchButtonClick;

    WebElement element;

    public void finElementandSendKeys(String elementName, String value) {
        switch (elementName) {

            case "searchButton":
                element = searchButton;
                break;
        }

        sendKeysFunction(element, value);

    }

    public void finElementandClick(String elementName) {
        switch (elementName) {

            case "searchButtonClick":
                element = searchButtonClick;
                break;
        }

        ClickFunction(element);

    }


}
