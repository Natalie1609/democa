import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormWPO {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "700x1200";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        String firstname = "Natalie";
        new PracticeForm().openPage();

        new PracticeForm().setFirstName(firstname);
        new PracticeForm().setLastName("Alexandrova");
        new PracticeForm().setEmail("123@gmail.com");
        new PracticeForm().setGender();
        new PracticeForm().setNumber("9556664433");
        new PracticeForm().setBirthday();
        new PracticeForm().setSubjects();
        new PracticeForm().setHobby();
        new PracticeForm().setPicture();
        new PracticeForm().setAddress("SPB");
        new PracticeForm().setState("Uttar Pradesh");
        new PracticeForm().setCity("Merrut");
        new PracticeForm().setCheck();
        new PracticeForm().setClose();
    }
    @AfterEach
    void afterEach() {
        System.out.println("Заполнение формы Practice form");
        System.out.println("Проверка данных из Practice form");
        System.out.println("Закрытие модального окна Thanks for submitting the form");
    }
}

