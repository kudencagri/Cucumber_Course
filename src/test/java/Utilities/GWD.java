package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {

    public static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null) { // ilk kez 1 defa çalışsın
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        return driver;
    }

    public static void quitDriver(){
        // test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(driver!=null) { // driver var ise

            driver.quit();
            driver=null;

        }
    }
}
