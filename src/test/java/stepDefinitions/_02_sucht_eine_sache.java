package stepDefinitions;

import cucumber.api.java.en.Then;
import pages.DialogContent;
import pages.TopNav;
import utilities.ExcelUtility;

import java.util.List;

public class _02_sucht_eine_sache {
    TopNav t=new TopNav();
    DialogContent d=new DialogContent();

    @Then("^Serach a value$")
    public void serachAValue() {
        t.finElementandSendKeys("searchButton","Reifen");
    }

    @Then("^Search a value und click$")
    public void serachAValueUndClick() {
        List<List<String>> exceldata= ExcelUtility.getList("src/test/java/apachiPOI/resourcess/neu_Excel2(1).xlsx","Tabelle1",1);
        t.finElementandSendKeys("searchButton",exceldata.get(0).get(0));
        t.finElementandClick("searchButtonClick");
    }


}
