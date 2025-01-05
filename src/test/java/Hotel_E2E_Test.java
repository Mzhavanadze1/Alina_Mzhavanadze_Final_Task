import Drivers.Selenide_Driver;
import Steps.HotelSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Hotel_E2E_Test extends Selenide_Driver {
@Test
    public void setUp() {
        super.SetUpDriver();
    }

@Test
    public void HotelTest() throws InterruptedException {
        open("https://www.phptravels.net/");
        HotelSteps hotelSteps = new HotelSteps();

        String password = "Credo2025)@";
        String firstName = "Alina";
        String lastName = "Mzhavannadze";
        String phoneNumber = "593123456";
        String email = "giogio.kh@gmail.com";
        String country = "Georgia";
        String addrs = "tbilisi 1";


        hotelSteps.signUp(firstName, lastName, phoneNumber, email, password, country);
        hotelSteps.searchHotel();
        hotelSteps.filterHotel();
        hotelSteps.openHotelDetails();
        hotelSteps.FillPaymentDetails(firstName, lastName, email, phoneNumber, addrs);
        hotelSteps.downloadRecipe();
        hotelSteps.uploadRecipe();
    }
}

