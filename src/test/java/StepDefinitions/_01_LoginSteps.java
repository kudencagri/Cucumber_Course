package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Utilities.GWD.driver;

public class _01_LoginSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        //driver.get("https://test.mersys.io/");
        GWD.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password and click login Button")
    public void enter_username_and_password_and_click_login_button() {
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));  clear cod değil dialog contente alındı
//
//      dc.username.sendKeys("turkeyts");
//      dc.password.sendKeys("TechnoStudy123");
        //dc.LoginButton.click();  bunun yerine yazıldı

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.Click(dc.LoginButton);


    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {

        dc.verifyContainsText(dc.txtDashboard, "Dashboard");
    }


}
