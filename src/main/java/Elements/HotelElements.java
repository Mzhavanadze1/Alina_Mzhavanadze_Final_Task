package Elements;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HotelElements {
    public SelenideElement signUpLink = $("#navbarSupportedContent > div.nav-item--right > ul > li:nth-child(4) > ul > li:nth-child(2) > a");

    public SelenideElement firstName = $("#firstname");
    public SelenideElement lastName = $("#last_name");
    public SelenideElement phone = $("#phone");
    public SelenideElement email = $("#user_email");
    public SelenideElement password = $("#password");
    public SelenideElement submitBtn = $("#submitBTN");
    public SelenideElement dropdownButton = $("button[data-bs-toggle='dropdown']");
    public SelenideElement searchBox = $(".dropdown-menu.show .bs-searchbox input");
    public SelenideElement firstResult = $("ul.dropdown-menu.inner.show li a");
    public SelenideElement captchaCheckbox = $(".recaptcha-checkbox-border");
    public SelenideElement successMessage = $("#recaptcha-accessible-status");
    public SelenideElement recaptchaIframe = $("iframe[title='reCAPTCHA']");
    public SelenideElement singUpBtn=$(".signup_button");
    public SelenideElement signInBtn =$("#navbarSupportedContent > div.nav-item--right > ul > li:nth-child(4) > ul > li:nth-child(1) > a");

    public SelenideElement loginEmail=$("#email");
    public SelenideElement loginPassword=$("#password");
    public SelenideElement loginBtn=$("#submitBTN");
    public SelenideElement verifySuccessLogin=$("#fadein");
    public SelenideElement hotelBtn=$x("//a[contains(text(),'Hotel')]");
    public SelenideElement checkInCalendar=$("#checkin");
    public SelenideElement checkOutCalendar=$("#checkout");
    public SelenideElement hotelPlace=$("#select2-hotels_city-container");
    public SelenideElement chooseHotelPlace =$(".select2-search__field");
    public SelenideElement searchHotel=$(".search_button");
    public SelenideElement hotelsBtn=$x("//li/a[contains(text(), 'Hotels')]");
    public SelenideElement fiveStar=$("#starRating5");
    public SelenideElement highToLowest =$("#desc");
    public SelenideElement applyFiltBtn=$x("//button[contains(text(),'Apply Filter')]");
    public SelenideElement expensiveHotel=$x("//a[contains(text(),'View More')]");
    public SelenideElement tableHeader = $x("//th[contains(text(), 'Rooms Type')]");
    public SelenideElement bookNowBtn=$x("//table[contains(@class,'table')]//tbody/tr[1]/td[last()]//button[@type='submit']");;

    public SelenideElement guestFirstName = $("[name='user[first_name]'");
    public SelenideElement guestLasttName = $("[name='user[last_name]'");
    public SelenideElement guestEmail = $("[name='user[email]'");
    public SelenideElement guestPhone = $("[name='user[phone]'");
    public SelenideElement guestAddr = $("[name='user[address]'");
    public SelenideElement guest1Name = $("[name='firstname_1'");
    public SelenideElement guest1LastName = $("[name='lastname_1'");
    public SelenideElement guest2Name = $("[name='firstname_2'");
    public SelenideElement guest2lastName = $("[name='lastname_2'");
    public SelenideElement paymentTable = $x("//h3[contains(text(), 'Payment Methods')]");
    public SelenideElement paymentMethodBtn = $x("//strong[contains(text(), 'pay later')]");
    public SelenideElement paymentAgreeBtn = $("#agreechb");
    public SelenideElement paymentBtn = $("#booking");
    public SelenideElement downloadRecipe = $("#invoice > div.row.g-2 > div:nth-child(1) > button");
    public SelenideElement fileUploadBtn = $("#submit-button");


}
