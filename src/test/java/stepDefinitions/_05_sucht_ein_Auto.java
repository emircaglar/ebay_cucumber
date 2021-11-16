package stepDefinitions;

import cucumber.api.java.en.Then;
import pages.LeftNav;

public class _05_sucht_ein_Auto {
    LeftNav l=new LeftNav();

    @Then("^User click auto categories$")
    public void userClickAutoCategories() {
    l.findElementandclick("AutoKatagorie");
    l.findElementandclick("");
    }
}
