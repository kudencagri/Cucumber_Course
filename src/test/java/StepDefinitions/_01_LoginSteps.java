package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static Utilities.GWD.driver;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();


    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        //driver.get("https://test.mersys.io/");

        GWD.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password and click login Button")
    public void enter_username_and_password_and_click_login_button() {

      dc.username.sendKeys("turkeyts");
      dc.password.sendKeys("TeknoStudy123");
      dc.LoginButton.click();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        System.out.println("sonuç doğrulandı");

    }
}
