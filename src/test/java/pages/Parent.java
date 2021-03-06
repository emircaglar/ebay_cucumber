package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.SingeltonDriver;

public class Parent {



    public void sendKeysFunction(WebElement element,String value){
      waitvisible(element);
      scrollToElement(element);
      element.clear();
      element.sendKeys(value);

    }

    public void ClickFunction(WebElement element){
        clickable(element);
      scrollToElement(element);
      element.click();

    }
    public void waitvisible(WebElement element){

        WebDriverWait wait=new WebDriverWait(SingeltonDriver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void clickable(WebElement element){

        WebDriverWait wait=new WebDriverWait(SingeltonDriver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js=(JavascriptExecutor) SingeltonDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void verifyContainstext(WebElement element,String value) {
        waitvisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));

    }

}
