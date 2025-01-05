package Steps;

import Elements.HotelElements;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HotelSteps extends HotelElements {
    @Test
    public void signUp(String name, String lastname, String phoneNum, String emailAdd, String pass, String countryName) throws InterruptedException {
        $("#navbarSupportedContent > div.nav-item--right > ul > li:nth-child(4) > a").click();
        signUpLink.click();
        firstName.setValue(name);
        lastName.setValue(lastname);
        phone.setValue(phoneNum);
        email.setValue(emailAdd);
        password.setValue(pass);
        dropdownButton.click();
        searchBox.setValue(countryName);
        firstResult.shouldBe(visible).click();
        solveCaptcha();
        submitBtn.click();
        $("#navbarSupportedContent > div.nav-item--right > ul > li:nth-child(4) > a").click();
        signInBtn.click();
    }

    public void solveCaptcha() throws InterruptedException {
        // Click the captcha checkbox
        password.scrollTo().shouldBe(Condition.visible);;
        switchTo().frame(recaptchaIframe);
        captchaCheckbox.click();
        switchTo().defaultContent();
        sleep(10000);


    }
//ori eqaunti damibloka, amitom loginis gareshe avirchev sastumros
    public void login(String emailAdd, String pass) throws InterruptedException {
        loginEmail.setValue(emailAdd);
        loginPassword.setValue(pass);
        loginBtn.click();
        verifySuccessLogin.shouldHave(text("Alina Mzhavannadze"));
        System.out.println("Hotel page opened");


    }

    public void searchHotel(){
        hotelsBtn.click();
        checkInCalendar.setValue("15-01-2025");
        checkOutCalendar.setValue("18-01-2025");
        hotelPlace.shouldBe(visible).click();
        chooseHotelPlace.setValue("Dubai");
        sleep(400);
        chooseHotelPlace.pressEnter();
        sleep(1000);
        searchHotel.click();

    }

    public void FillPaymentDetails(String firstGuestName, String firstGuestLastName, String email, String phone, String addr) {
        guestFirstName.setValue(firstGuestName);
        guestLasttName.setValue(firstGuestLastName);
        guestEmail.setValue(email);
        guestPhone.setValue(phone);
        guestAddr.setValue(addr);
        guest1Name.scrollTo().shouldBe(Condition.visible);;
        guest1Name.setValue(firstGuestName);
        guest1LastName.setValue(firstGuestLastName);
        guest2Name.setValue(firstGuestName);
        guest2lastName.setValue(firstGuestLastName);
        paymentTable.scrollTo().shouldBe(Condition.visible);;
        paymentMethodBtn.click();
        paymentMethodBtn.scrollTo().shouldBe(Condition.visible);;
        paymentAgreeBtn.click();
        paymentBtn.scrollTo().shouldBe(Condition.visible);
        paymentBtn.click();

    }


    public void filterHotel(){
        fiveStar.click();
        highToLowest.scrollTo().shouldBe(Condition.visible);;
        highToLowest.click();
        applyFiltBtn.scrollTo().shouldBe(Condition.visible);;
        applyFiltBtn.click();

    }
    public void openHotelDetails(){
        expensiveHotel.click();
        sleep(300);
        tableHeader.scrollTo().shouldBe(Condition.visible);;
        bookNowBtn.click();
    }

    public void downloadRecipe(){
        downloadRecipe.scrollTo().shouldBe(Condition.visible);
        downloadRecipe.click();

    }

    public void uploadRecipe(){
        open("https://webdriveruniversity.com/File-Upload/index.html");
        File invoice = new File("build/downloads").listFiles()[0].listFiles()[0];
        $("#myFile").uploadFile(invoice);
        fileUploadBtn.click();

        Assert.assertEquals(switchTo().alert().getText(), "Your file has now been uploaded!");

    }
}
