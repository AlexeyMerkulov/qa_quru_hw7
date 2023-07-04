package tests;

import pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successfulTextBoxTest() {
        textBoxPage.openPage()
                .setFullName("Alexey Merkulov")
                .setEmail("mail@mail.ru")
                .setCurrentAddress("Some address")
                .setPermanentAddress("Another address")
                .submitInputData()
                .verifyResult(
                        "Alexey Merkulov",
                        "mail@mail.ru",
                        "Some address",
                        "Another address"
                        );
    }
}
