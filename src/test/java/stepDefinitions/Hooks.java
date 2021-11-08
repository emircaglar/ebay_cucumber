package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ExcelUtility;
import utilities.SingeltonDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
/*
            TakesScreenshot screenshot=(TakesScreenshot) ErsteDriver.getDriver();
            File file=screenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File("target/opencart_screnn/"+scenario.getName()+dateTime.format(formatter)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    @Before
    public void before(Scenario scenario) {
        System.out.println("scenario.getName() = " + scenario.getName() + " hat agefangen");


    }

    @After
    public void after(Scenario scenario) {

        System.out.println("scenario.getName()+\" ist vorbei\" = " + scenario.getName() + " ist vorbei");
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        if (scenario.isFailed()) {


            TakesScreenshot screenshot = (TakesScreenshot) SingeltonDriver.getDriver();
            File file = screenshot.getScreenshotAs(OutputType.FILE);


            try {
                FileUtils.copyFile(file, new File("target/screen/" + scenario.getName() + "" + date.format(formatter) + ".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ExcelUtility.writeExcel("src/test/java/apachiPOI/resourcess/report_Excel.xlsx", scenario.getName(), SingeltonDriver.getDriver().toString(), date.format(formatter), scenario.getStatus());
        SingeltonDriver.Quit();
    }
}
