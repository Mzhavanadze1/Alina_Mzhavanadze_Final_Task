import Drivers.Selenium_driver;
import Steps.ShopSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Shop_E2E_test extends Selenium_driver {
    @BeforeMethod
    public void setUp() {
        driver = SetUpDriver();
    }

    @Test
    public void ShopTest() throws AWTException {
        ShopSteps steps = new ShopSteps(driver);
        String password = "Credo20255)@";
        String email = "Alina456@gmail.com";
        steps.link();
        steps.registrationOrLogin(email, password);
        steps.isRegisterSuccessful("Hello Alina");

        steps.sortProducts();
        steps.checkSortedProducsts();
        steps.CheckJSCategoryFilter();

        String itemName = steps.AddItemintoCart();
        steps.checkCart(itemName);
        steps.addItemsToCart();

        String orderNum = steps.checkout();
        steps.validateOrder(orderNum);

        String newPassword = "Credo20255)@#";
        steps.changePassword("Alina", "Mzhavanadze", password,newPassword);
        steps.registrationOrLogin(email, newPassword);
        steps.isRegisterSuccessful("Hello Alina");


//        steps.activateCoupon("krishnasakinala"); kuponis nawili agar mushaobs, amitom davakomentare.
//        steps.removeCoupon();
//        steps.activateCoupon("krishnasakinala");

    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }

}
