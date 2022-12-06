package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
    }
}
