package steps;

import cucumber.api.java.ru.Тогда;

import static pageobjects.CheckOnSePagesProvider.checkTheAppearanceOfTheElement;
import static pageobjects.CheckOnSePagesProvider.validateIsExpectedPage;

public class CheckSteps {

    @Тогда("^открыта страница '(.+)'$")
    public void checkExpectedPage(String pageName) {
        validateIsExpectedPage(pageName);
    }

    @Тогда("^появится '(.+)'$")
    public void checkApperanceElement(String elementName) {
        checkTheAppearanceOfTheElement(elementName);
    }
}
