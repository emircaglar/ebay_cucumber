package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SingeltonDriver;

public class LeftNav extends Parent{

    public  LeftNav(){
        PageFactory.initElements(SingeltonDriver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@class='text-link-secondary treelist-headline']" )
    public WebElement AutoKatagorie;

    @FindBy(xpath ="//a[text()='Autos']" )
    public WebElement algemeinAutosKatagorie;

    @FindBy(xpath ="//a[text()='Volkswagen']" )
    public WebElement modelVolkswagen;

    WebElement element;

    public void findElementandclick(String elementName){

        switch (elementName){

            case "AutoKatagorie":
                element=AutoKatagorie;

        }

       clickable(element);

    }


}
