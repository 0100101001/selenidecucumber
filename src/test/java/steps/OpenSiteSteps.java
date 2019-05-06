package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import pageobjects.pages.HomePage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class OpenSiteSteps {
    @Дано("^открыть сайт Мвидео$")
    public void openSite() {
        open(baseUrl);
        checkOpenHomePage();
    }

    @Тогда("^открыта Главная страница$")
    public void checkOpenHomePage() {
        new HomePage();
    }
}
