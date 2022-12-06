package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;
import pages.components.ModalComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
    CalendarComponents calendarComponents = new CalendarComponents();
    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
        firstNameInput = $("#firstName"),
        lastNameInput = $("#lastName"),
        emailInput = $("#userEmail"),
        genderInput = $("#gender-radio-2"),
        numberInput = $("#userNumber"),
        birthdayInput = $("#dateOfBirthInput"),
        subjectsInput = $("#subjectsInput"),
        hobbyInput = $("[for=hobbies-checkbox-2]"),
        pictureInput = $("#uploadPicture"),
        addressInput = $("#currentAddress"),
        closeInput = $("#closeLargeModal");

    public PracticeForm openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));

        return this;
    }
    public PracticeForm setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }
    public PracticeForm setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }
    public PracticeForm setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }
    public PracticeForm setGender() {
        genderInput.doubleClick();

        return this;
    }
    public PracticeForm setNumber(String value) {
        numberInput.setValue(value);

        return this;
    }
    public PracticeForm setBirthday(String day, String month, String year) {
        birthdayInput.click();
        calendarComponents.setDate(day, month, year);

        return this;
    }
    public PracticeForm setSubjects() {
        subjectsInput.click();
        subjectsInput.setValue("H");
        subjectsInput.pressEnter();

        return this;
    }
    public PracticeForm setHobby() {
        hobbyInput.click();

        return this;
    }
    public PracticeForm setPicture() {
        pictureInput.uploadFile(new File("src/test/Files/test.png"));

        return this;
    }
    public PracticeForm setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }
    public PracticeForm setState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();

        return this;
    }
    public PracticeForm setCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        $("#submit").click();

        return this;
    }
    public PracticeForm setCheck() {
        ModalComponent modalComponent = new ModalComponent();
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
        );

        return this;
    }
    public PracticeForm setModalComponent() {
        ModalComponent modalComponent;
        modalComponent.setModal();
        return this;
    }
    public PracticeForm setClose() {
        closeInput.click();

        return this;
    }

}
