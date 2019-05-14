package steps;

import cucumber.api.java.ru.Если;

import static com.codeborne.selenide.Condition.*;
import static pageobjects.PageObjectProvider.navMenu;

public class NavMenuSteps {

    @Если("в разделе '(.+)' выбрать категорию '(.+)'")
    public void goToTheCategorySection(String nameSection, String category) {

        navMenu.sectionsList.findBy(text(nameSection))
                .shouldBe(visible)
                .hover()
                .waitWhile(attribute("class", "header-nav-item has-dropdown active"), 5);
        navMenu.getCategory(category).click();
    }
}
