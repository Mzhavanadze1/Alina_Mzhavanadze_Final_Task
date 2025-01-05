package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Selenium_driver {

   public WebDriver driver;

   public WebDriver SetUpDriver(){
       ChromeOptions options = new ChromeOptions();
       options.addArguments("user-data-dir=C:/Users/alinamzhavanadze/AppData/Local/Google/Chrome/User Data/Profile 1");
       options.addArguments("--start-maximized");
       this.driver=new ChromeDriver(options);
       this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       return this.driver;

   }

    public void closeDriver() {
        this.driver.close();
    }
}
