package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_CitizebShipParameter {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.Click(dc.LoginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.txtDashboard, "Dashboard");
    }

    @And("Navigate to Citizenship")
    public void navigateToCitizenship() {
        ln.Click(ln.setup);
        ln.Click(ln.parameters);
        ln.Click(ln.citizenships);
    }

    @When("Create a Citizenship name as {string} short name as {string}")
    public void createACitizenshipNameAsShortNameAs(String name, String shortname) {
        dc.Click(dc.addButton);
        dc.mySendKeys(dc.Name,name);
        dc.mySendKeys(dc.shortName,shortname);
        dc.Click(dc.SaveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.ExistMessage,"already");
    }
}
