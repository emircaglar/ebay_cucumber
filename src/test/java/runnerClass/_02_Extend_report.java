package runnerClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/java/featureFiles/_02_sucht_eine_sache.feature"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Ebay_extentReport/ExtentReport_ebay.html"},
        glue = {"stepDefinitions"}
        //tags = {"@SmokeTest"}
)
public class _02_Extend_report extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/xmlFiles/Extend_report_ebay.xml");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Aplication name","ebay");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");


    }

}
