package steps;

import cucumber.api.java.ru.Дано;

import static com.codeborne.selenide.Selenide.open;

public class OpenSiteSteps {
    @Дано("^открыть сайт Мвидео$")
    public void openSite() {
        open("/");
    }
}
