package steps;

import cucumber.api.java.ru.Если;

import static pageobjects.CheckOnSePagesProvider.validateIsExpectedPage;

public class CheckSteps {

    @Если("^открыта страница '(.+)'$")
    public void checkExpectedPage(String pageName) {
        validateIsExpectedPage(pageName);
    }
}
