package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.SingeltonDriver;

public class Hooks {


    @Before
    public void before(){

    }
    @After
    public void after(){
        SingeltonDriver.Quit();
    }
}
