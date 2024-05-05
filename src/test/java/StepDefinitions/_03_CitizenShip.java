package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _03_CitizenShip {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.Click(ln.setup);
        ln.Click(ln.parameters);
        ln.Click(ln.citizenships);

    }

    @When("Create CitizenShip")
    public void createCitizenShip() {
        dc.Click(dc.addButton);
        dc.mySendKeys(dc.Name,"Bakalım21");
        dc.mySendKeys(dc.shortName,"B21");
        dc.Click(dc.SaveButton);
    }
}
