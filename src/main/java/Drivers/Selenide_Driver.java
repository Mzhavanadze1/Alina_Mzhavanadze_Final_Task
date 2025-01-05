package Drivers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenide_Driver{
    public void SetUpDriver (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:/Users/alinamzhavanadze/AppData/Local/Google/Chrome/User Data/Profile 1");
        options.addArguments("--start-maximized");
    }

}
