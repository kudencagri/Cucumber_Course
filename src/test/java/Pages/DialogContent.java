package Pages;

import Utilities.GWD;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public WebElement Name;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'code')]/input")
    public WebElement CountryCode;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'shortName')] /input")
    public WebElement shortName;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted'] / button")
    public WebElement SaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement SuccessMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement ExistMessage;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]/button")
    public WebElement DeleteButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    public WebElement SearchName;

    @FindBy(xpath = "//ms-search-button/div")
    public WebElement SearchButton;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement CloseButton;

    @FindBy(xpath = "(//*[@class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']/span)[2]")
    public WebElement delete;

    public void deleteItem(String searchText){
        mySendKeys(SearchName, searchText);
        Click(SearchButton); // fuse bar ı çocukları ortaya çıkıyor

        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
        //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        //wait.until(ExpectedConditions.stalenessOf(dc.deleteImageBtn)); //olabilir ama herzaman çözmez

        //2.yöntem sayfanın kendi waitini , loding ini yakalayalım. (en sağlam yöntem)
        //fuse-progress-bar/*    -> fuse-progress-bar ın çocukları
        // bu çocukların 0 olana bekle
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("(//div[@class='loading-shade ng-tns-c1233677153-66 ng-star-inserted'])[1]/*"),0));

        Click(DeleteButton);
        Click(delete);

        // silme ıslemı dıalogların ortak noktası olması sebebıyle buraya aldık. Silme islemi yapacagımız her seferınde tekrar tekrar kod yazmayalım dırekt cagıralım dıye aldık.
    }

}
