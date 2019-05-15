package steps;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static pageobjects.PageObjectProvider.homePage;

public class OpenSiteSteps {
    @Given("^открыть сайт Мвидео$")
    public void openSite() {
        open(baseUrl);
        homePage.validateIsExpectedPage();
    }
}
