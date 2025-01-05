package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class ShopElements {
    @FindBy(className = "fc-cta-do-not-consent")
    public WebElement rejectConsentBtn;

    @FindBy(id = "reg_email")
    public WebElement mailInput;

    @FindBy(id = "reg_password")
    public WebElement passInput;

    @FindBy(name = "register")
    public WebElement registerBtn;

    @FindBys(@FindBy(xpath = "//ul/li[contains(text(), 'An account is already registered')]"))
    public List<WebElement> alreadyRegisteredText;

    @FindBy(name = "username")
    public WebElement loginInput;

    @FindBy(name = "password")
    public WebElement loginPassInput;

    @FindBy(name = "login")
    public WebElement loginBtn;

    @FindBy(css = "#page-36 > div > div.woocommerce > div > p:nth-child(1)")
    public WebElement welcomeText;

    @FindBy(xpath = "//li/a[contains(text(), 'Shop')]")
    public WebElement shopBtn;


    @FindBy(className = "orderby")
    public WebElement sortBtn;

    @FindBy(xpath = "//option[@value='price-desc']")
    public WebElement orderByPriceBtn;

    @FindBys(@FindBy(xpath = "//span[contains(@class, 'price')]/ins/span[contains(@class, 'woocommerce-Price-amount')] |" + "//span[contains(@class, 'price')]/span[contains(@class, 'woocommerce-Price-amount') and not (parent::ins)]"))
    public List<WebElement> productPrices;

    @FindBy(xpath = "//li/a[contains(text(), 'JavaScript')]")
    public WebElement JSFilterBtn;

    @FindBy(xpath = "//*[@id='woocommerce_product_categories-2']/ul/li[3]/span[contains(@class, 'count')]")
    public WebElement JsCategoryCount;

    @FindBys(@FindBy(xpath = "//ul[contains(@class, 'products')]/li"))
    public List<WebElement> JsProducts;

    @FindBy(xpath = "//span[contains(@class, 'cartcontents')]")
    public WebElement cartItemNum;

    @FindBy(xpath = "//a[contains(@class, 'wpmenucart-contents')]")
    public WebElement cartBtn;

    @FindBy(xpath = "//td[contains(@class, 'product-name')]/a")
    public WebElement cartItemName;

    @FindBy(xpath = "//td[contains(@class, 'product-remove')]/a")
    public WebElement cartRemoveBtn;

    @FindBy(xpath = "//li[.//a/h3[contains(text(), 'HTML5 Forms')]]/a[contains(text(), 'Add to basket')]")
    public WebElement htmlItem;

    @FindBy(xpath = "//li[.//h3[contains(text(), 'Selenium Ruby')]]/a[contains(text(), 'Add to basket')]")
    public WebElement rubyItem;

    @FindBy(className = "checkout-button")
    public WebElement checkoutBtn;

    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement billingLastName;

    @FindBy(id = "billing_company")
    public WebElement billingCompany;

    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(id="select2-chosen-1")
    public WebElement country;

    @FindBy(id = "billing_address_1")
    public WebElement billingAddress;

    @FindBy(id = "billing_address_2")
    public WebElement homeAddress;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "billing_postcode")
    public WebElement billingPostCode;

    @FindBy(id = "payment_method_cod")
    public WebElement paymentMethodCOD;

    @FindBy(id = "place_order")
    public WebElement placeOrderBtn;

    @FindBy(className = "select2-input")
    public WebElement countrySearchInput;

    @FindBy(className = "select2-match")
    public WebElement countrySelect;

    @FindBy(xpath = "//a[contains(text(), 'My Account')]")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//a[contains(text(), 'Orders')]")
    public WebElement ordersBtn;

    @FindBy(xpath = "//li[contains(@class, 'order')]/strong")
    public WebElement orderItemNum;

    @FindBys(@FindBy(xpath = "//td[contains(@class, 'order-number')]/a"))
    public List<WebElement> orders;

    @FindBy(id = "account_first_name")
    public WebElement accountFirstName;

    @FindBy(id = "account_last_name")
    public WebElement accountLastName;

    @FindBy(xpath = "//a[contains(text(), 'Account Details')]")
    public WebElement accountDetailsBtn;

    @FindBy(id = "password_current")
    public WebElement currentPassword;

    @FindBy(id = "password_1")
    public WebElement newPassword;

    @FindBy(id = "password_2")
    public WebElement passwordConfirmation;

    @FindBy(name = "save_account_details")
    public WebElement saveAccountDetailsBtn;

    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    public WebElement logoutBtn;


//    @FindBy(name = "coupon_code")
//    public WebElement couponInput;
//
//    @FindBy(name = "apply_coupon")
//    public WebElement couponApplyBtn;
//
//    @FindBy(className = "woocommerce-remove-coupon")
//    public WebElement removeCoupon;
//
//    @FindBy(xpath = "//*[@id='page-34']/div/div[1]/div[2]/div/table/tbody/tr[4]/td/strong/span")
//    public WebElement cartTotalAmount;
//
//    @FindBy(xpath = "//*[@id=\"page-34\"]/div/div[1]/div[2]/div/table/tbody/tr[1]/td/span")
//    public WebElement subtotalAmount;
//
//    @FindBy(xpath = "//*[@id=\"page-34\"]/div/div[1]/div[2]/div/table/tbody/tr[3]/td/span")
//    public  WebElement taxAmount;



}
