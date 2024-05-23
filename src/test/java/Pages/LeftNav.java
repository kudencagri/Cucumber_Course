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
    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;
    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement fees;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement EntranceExams;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement EntranceSetup;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement EntranceEx;


    public WebElement getWebelement(String strElement){
        switch (strElement){
            case "setup" : return this.setup;
            case "parameters" : return this.parameters;
            case "country"  :return this.country;
            case "citizenships" : return this.citizenships;
            case "nationalities" : return this.nationalities;
            case "fees" : return this.fees;
            case "EntranceExams" : return this.EntranceExams;
            case "EntranceSetup" : return this.EntranceSetup;
            case "EntranceEx" : return this.EntranceEx;
        }
        return null;
    }

//span[@class='nav-link-title ng-tns-c1153576442-20 ng-star-inserted']
}
