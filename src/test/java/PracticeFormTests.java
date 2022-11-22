import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "7680x4320";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Natalie");
        $("#lastName").setValue("Alexandrova");
        $("#userEmail").setValue("123@gmail.com");
        $("#gender-radio-2").doubleClick();
        $("#userNumber").setValue("89556664433");
//      Выбор днюхи:
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__day--016").click();

        $("#subjectsInput").click();
        $("#subjectsInput").setValue("H");
        $("#subjectsInput").pressEnter();

        $("[for=hobbies-checkbox-2]").click();
      //  $("#uploadPicture").uploadFile(new File("src/test/java/Files/test.png");
        $("#currentAddress").setValue("SPB");
        $("#state").click();
        $("#state").setValue("H");
        $("#state").pressTab();

        $("#submit").click();

        $(".modal-dialog modal-lg").shouldBe(Condition.visible);
//        $().shouldHave(Text(""));
    }
}
