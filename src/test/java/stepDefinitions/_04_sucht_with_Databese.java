package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import utilities.DataBaseUtility;

import java.util.List;

public class _04_sucht_with_Databese {

    @Then("^Search a value und click with DataBase as query   \"([^\"]*)\"$")
    public void searchAValueUndClickWithDataBaseAsQuery(String query) {
        List<List<String>>dataBaseList= DataBaseUtility.getListData(query);
    }
}
