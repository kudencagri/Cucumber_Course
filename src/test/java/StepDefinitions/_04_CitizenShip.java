package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _04_CitizenShip {
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
        String CitizenName= RandomStringUtils.randomAlphabetic(8);
        String CitizenShort=RandomStringUtils.randomNumeric(4);

        dc.Click(dc.addButton);
        dc.mySendKeys(dc.Name,CitizenName);
        dc.mySendKeys(dc.shortName,CitizenShort);
        dc.Click(dc.SaveButton);
    }
}
