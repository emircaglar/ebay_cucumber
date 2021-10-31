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

    WebElement element;

    public void finElementandSendKeys(String elementName, String value) {
        switch (elementName) {

            case "searchButton":
                element = searchButton;
                break;
        }

        sendKeysFunction(element, value);

    }


}
