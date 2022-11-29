import org.junit.jupiter.api.Test;

public class PracticeFormWPOTests extends TestBase {
    @Test
    void fillFormTest() {

        String firstname = "Natalie";
        practiceForm.openPage()
            .setFirstName(firstname)
            .setLastName("Alexandrova")
            .setEmail("123@gmail.com")
            .setGender()
            .setNumber("9556664433")
            .setBirthday()
            .setSubjects()
            .setHobby()
            .setPicture()
            .setAddress("SPB")
            .setState("Uttar Pradesh")
            .setCity("Merrut")
            .setCheck()
            .setClose();
    }

}

