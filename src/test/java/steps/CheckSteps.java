package steps;

import cucumber.api.java.en.Then;

import static pageobjects.CheckOnSePagesProvider.checkTheAppearanceOfTheElement;
import static pageobjects.CheckOnSePagesProvider.validateIsExpectedPage;

public class CheckSteps {

    @Then("^открыта страница '(.+)'$")
    public void checkExpectedPage(String pageName) {
        validateIsExpectedPage(pageName);
    }

    @Then("^появится '(.+)'$")
    public void checkApperanceElement(String elementName) {
        checkTheAppearanceOfTheElement(elementName);
    }
}
