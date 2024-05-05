package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav(){
        PageFactory.initElements(GWD.getDriver(),this);
        // locatorları ben kullanacağım zaman driver üzerinden bulup başlatıp
        // bana hazır et artık findElementle uğraşmak istemiyorum.
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "//span[text()='Countries']")
    public WebElement country;
    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenships;
}
