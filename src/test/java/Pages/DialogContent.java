package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {

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
}