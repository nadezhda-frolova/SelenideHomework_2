import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideHomework_2 {
    @Test
    void hoverCommandTest() {
        //1. На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
        // Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best.")
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".enterprise-hero").shouldHave(text("GitHub for enterprises"));
    }
}
