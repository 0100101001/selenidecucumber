package steps;

import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;
import static pageobjects.PageObjectProvider.navMenu;

public class NavMenuSteps {

    @When("в разделе '(.+)' выбрать категорию '(.+)'")
    public void goToTheCategorySection(String nameSection, String category) {

        navMenu.sectionsList.findBy(text(nameSection))
                .shouldBe(visible)
                .hover()
                .waitWhile(attribute("class", "header-nav-item has-dropdown active"), 5);
        navMenu.getCategory(category).click();
    }
}
