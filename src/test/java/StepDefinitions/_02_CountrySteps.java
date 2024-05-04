package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();


    @And("Navigate to country")
    public void navigateToCountry() {
        ln.Click(ln.setup);
        ln.Click(ln.parameters);
        ln.Click(ln.country);

    }

    @When("Create county")
    public void createCounty() {
        String ulkeAdi= RandomStringUtils.randomAlphabetic(8);
        String ulkeKodi=RandomStringUtils.randomNumeric(4);

     dc.Click(dc.addButton);
     dc.mySendKeys(dc.CountryName,ulkeAdi);
     dc.mySendKeys(dc.CountryCode, ulkeKodi);
     dc.Click(dc.SaveButton);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.SuccessMessage, "success");
    }
}
