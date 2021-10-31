package stepDefinitions;

import cucumber.api.java.en.Then;
import pages.TopNav;

public class _02_sucht_eine_sache {
    TopNav t=new TopNav();
    @Then("^Serach a value$")
    public void serachAValue() {
        t.finElementandSendKeys("searchButton","Reifen");
    }
}
