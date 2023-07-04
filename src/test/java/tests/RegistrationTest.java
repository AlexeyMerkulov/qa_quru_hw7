package tests;

import pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFirstName("Alexey")
                .setLastName("Merkulov")
                .setUserEmail("mail@mail.ru")
                .setGender("Male")
                .setUserNumber("9999999999")
                .setBirthDay("30", "March", "1993")
                .setSubject("English")
                .setHobby("Sports")
                .uploadPicture("selenide.jpg")
                .setAddress("Bay Area,100")
                .setState("Uttar Pradesh")
                .setCity("Agra")
                .submitInputData()
                .verifyModalDialogAppeared()
                .verifyResult("Student Name", "Alexey Merkulov")
                .verifyResult("Student Email", "mail@mail.ru")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "9999999999")
                .verifyResult("Date of Birth", "30 March,1993")
                .verifyResult("Subjects", "English")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Picture", "selenide.jpg")
                .verifyResult("Address", "Bay Area,100")
                .verifyResult("State and City", "Uttar Pradesh Agra");
    }
}



