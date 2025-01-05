package Steps;

import Elements.ShopElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShopSteps extends ShopElements {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public ShopSteps(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void link() {
        driver.get("https://practice.automationtesting.in/my-account/");

    }

    public void registration(String mail, String pass) throws AWTException {
        mailInput.sendKeys(mail);
        passInput.sendKeys(pass);
        registerBtn.click();


    }

    public void registrationOrLogin(String mail, String pass) throws AWTException {
        registration(mail, pass);
        if (!alreadyRegisteredText.isEmpty()) {
            login(mail, pass);
        }
    }

    public void login(String username, String password) {
//        signInBtn.click();
        loginInput.sendKeys(username);
        loginPassInput.sendKeys(password);
        loginBtn.click();
    }

    public boolean isRegisterSuccessful(String value) {
        return welcomeText.getText().contains(value);
    }

    public void Scroll(int Y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(STR."window.scrollBy(0,\{Y})");
    }

    public void sortProducts() {
        shopBtn.click();
        Scroll(100);
        sortBtn.click();
        orderByPriceBtn.click();
    }

    public void checkSortedProducsts() {
        List<Double> extractedPrices = new ArrayList<>();
        for (WebElement el : productPrices) {
            extractedPrices.add(Double.parseDouble(el.getText().replace("₹", "")));
        }
        List<Double> sortedPrices = new ArrayList<>(extractedPrices);
        sortedPrices.sort(Comparator.reverseOrder());
        Assert.assertEquals(extractedPrices, sortedPrices);
    }

    public void CheckJSCategoryFilter() {
        JSFilterBtn.click();
        int itemCount = Integer.parseInt(JsCategoryCount.getText().replaceAll("[()]", ""));
        Assert.assertEquals(itemCount, JsProducts.size());

    }

    public String AddItemintoCart() {
        Scroll(100);
        JsProducts.getFirst().findElement(By.xpath("//a[contains(text(), 'Add to basket')]")).click();
        wait.until(ExpectedConditions.textToBePresentInElement(cartItemNum, "1 Item"));
        Assert.assertTrue(cartItemNum.getText().contains("1"));
        return JsProducts.getFirst().findElement(By.xpath("//a[contains(@class, 'woocommerce-LoopProduct-link')]/h3")).getText();
    }

    public void checkCart(String firstItemName) {
        cartBtn.click();
        Assert.assertTrue(cartItemName.getText().contains(firstItemName));
        cartRemoveBtn.click();
        wait.until(ExpectedConditions.textToBePresentInElement(cartItemNum, "0 Item"));
        Assert.assertTrue(cartItemNum.getText().contains("0"));

    }

    public void addItemsToCart() {
        shopBtn.click();
        Scroll(600);
        htmlItem.click();
        Scroll(600);
        rubyItem.click();
        Scroll(-1200);
        wait.until(ExpectedConditions.textToBePresentInElement(cartItemNum, "2 Items"));
        cartBtn.click();


    }

    public String checkout() {
        Scroll(400);
        checkoutBtn.click();
        billingFirstName.sendKeys("Alina");
        billingLastName.sendKeys("Mzhavanadze");
        billingCompany.sendKeys("credo");
        billingPhone.sendKeys("0544444444");
        Scroll(400);
        country.click();
        countrySearchInput.sendKeys("United Kingdom");
        countrySelect.click();
        billingAddress.clear();
        billingAddress.sendKeys("123 Street");
        homeAddress.clear();
        homeAddress.sendKeys("456 Street");
        billingCity.clear();
        billingCity.sendKeys("london");
        billingPostCode.clear();
        billingPostCode.sendKeys("E1 6AN");
        Scroll(1000);
        paymentMethodCOD.click();
        placeOrderBtn.click();
        return orderItemNum.getText();

    }

    public void validateOrder(String orderNumber) {
        Scroll(-1000);
        myAccountBtn.click();
        ordersBtn.click();
        boolean isOrderPresent = false;
        for (WebElement el : orders) {
            if (el.getText().contains(orderNumber)) {
                isOrderPresent = true;
            }
        }
        Assert.assertTrue(isOrderPresent);

    }

    public void changePassword(String firstName,String lastName,String password, String newPass){
        accountDetailsBtn.click();
        accountFirstName.sendKeys(firstName);
        accountLastName.sendKeys(lastName);
        Scroll(400);
        currentPassword.sendKeys(password);
        newPassword.sendKeys(newPass);
        passwordConfirmation.sendKeys(newPass);
        saveAccountDetailsBtn.click();

        logoutBtn.click();
    }

//    public void activateCoupon(String coupon) {
//
//        couponInput.sendKeys(coupon);
//        Scroll(250);
//        couponApplyBtn.click();
//        double subtotal = Double.parseDouble(subtotalAmount.getText().replace("₹", ""));
//        double tax = Double.parseDouble(taxAmount.getText().replace("₹", ""));
//        double couponDiscount = (subtotal + tax) - 50;
//        double totalAmount = Double.parseDouble(cartTotalAmount.getText().replace("₹", ""));
//        Assert.assertEquals(couponDiscount, totalAmount);
//
//    }
//
//    public void removeCoupon() {
//        removeCoupon.click();
//        couponInput.clear();
//        Scroll(-250);
//        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("woocommerce-message")),"Coupon has been removed."));
//        couponInput.click();
//
//    }


}

