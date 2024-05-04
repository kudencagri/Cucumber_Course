package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent(){
        PageFactory.initElements(GWD.getDriver(),this);
        // locatorları ben kullanacağım zaman driver üzerinden bulup başlatıp
        // bana hazır et artık findElementle uğraşmak istemiyorum.
    }

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement LoginButton;

    @FindBy(xpath = "//span[@class='nav-link-title']")
    public WebElement txtDashboard;

    @FindBy(xpath= "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'name')]/input")
    public WebElement CountryName;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'code')]/input")
    public WebElement CountryCode;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted'] / button")
    public WebElement SaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement SuccessMessage;



}
