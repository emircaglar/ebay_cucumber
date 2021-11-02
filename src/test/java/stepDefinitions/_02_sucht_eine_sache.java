package stepDefinitions;

import cucumber.api.java.en.Then;
import pages.DialogContent;
import pages.TopNav;

public class _02_sucht_eine_sache {
    TopNav t=new TopNav();
    DialogContent d=new DialogContent();

    @Then("^Serach a value$")
    public void serachAValue() {
        t.finElementandSendKeys("searchButton","Reifen");
    }

    @Then("^Search a value und click$")
    public void serachAValueUndClick() {
        t.finElementandSendKeys("searchButton","Reifen");
        t.finElementandClick("searchButtonClick");
    }
}
