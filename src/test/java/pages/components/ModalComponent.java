package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ModalComponent {
    public void setModal() {
        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Natalie Alexandrova"),
                text("123@gmail.com"),
                text("Female"), text("9556664433"),
                text("16 September,1995"),
                text("Reading"),
                text("test.PNG"),
                text("SPB"),
                text("Uttar Pradesh Merrut")
    }
}
