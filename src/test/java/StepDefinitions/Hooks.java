package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before // Cucumber ın annotation ı
    public void before(){
        System.out.println("senaryo başladımı");
    }
    @After  // Cucumber ın annotation ı
    public void after(){
        System.out.println("senaryo bittimi");
        GWD.quitDriver();
    }
}
