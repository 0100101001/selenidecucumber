package steps;

import cucumber.api.java.ru.Дано;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static pageobjects.PageObjectProvider.homePage;

public class OpenSiteSteps {
    @Дано("^открыть сайт Мвидео$")
    public void openSite() {
        open(baseUrl);
        homePage.validateIsExpectedPage();
    }
}
