import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.PracticeForm;

public class TestBase {
    PracticeForm practiceForm = new PracticeForm();
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "700x1200";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @AfterEach
    void afterEach() {
        System.out.println("Заполнение формы Practice form");
        System.out.println("Проверка данных из Practice form");
        System.out.println("Закрытие модального окна Thanks for submitting the form");
    }
}
