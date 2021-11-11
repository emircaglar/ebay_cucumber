package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.DialogContent;
import pages.TopNav;
import utilities.DataBaseUtility;

import java.util.List;

public class _04_sucht_with_Databese {

    TopNav t=new TopNav();
    @Then("^Search a value und click with DataBase as query   \"([^\"]*)\"$")
    public void searchAValueUndClickWithDataBaseAsQuery(String query) {
        List<List<String>>dataBaseList= DataBaseUtility.getListData(query);
        t.finElementandSendKeys("searchButton",dataBaseList.get(0).get(1));
        t.finElementandClick("searchButtonClick");
    }
}
