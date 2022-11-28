package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
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
        addressInput = $("#currentAddress");

    public void openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }
    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }
    public void setLastName(String value) {
        lastNameInput.setValue(value);
    }
    public void setEmail(String value) {
        emailInput.setValue(value);
    }
    public void setGender() {
        genderInput.doubleClick();
    }
    public void setNumber(String value) {
        numberInput.setValue(value);
    }
    public void setBirthday() {
        birthdayInput.click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__day--016").click();
    }
    public void setSubjects() {
        subjectsInput.click();
        subjectsInput.setValue("H");
        subjectsInput.pressEnter();
    }
    public void setHobby() {
        hobbyInput.click();
    }
    public void setPicture() {
        pictureInput.uploadFile(new File("src/test/Files/test.png"));
    }
    public void setAddress(String value) {
        addressInput.setValue(value);
    }
    public void setState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();
    }
    public void setCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        $("#submit").click();
    }
    public void setCheck() {
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
    }
    public void setClose() {
        $("#closeLargeModal").click();
    }

}
