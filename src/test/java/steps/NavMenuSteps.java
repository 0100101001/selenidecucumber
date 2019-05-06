package steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import org.openqa.selenium.interactions.Actions;
import pageobjects.conponents.NavMenu;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static util.ActionsOnElements.removeEvilBanner;

public class NavMenuSteps {

    @Дано("^навести мышку на раздел '(.+)' в навигационном меню$")
    public void hoverOverSection(String nameSection) {
        NavMenu navMenu = new NavMenu();
        removeEvilBanner();
        navMenu.sectionsList.findBy(text(nameSection)).shouldBe(visible).hover();
    }

    @То("^раскрыто меню '(.+)'$")
    public void checkOpenSectionMenu(String nameSection) {
        NavMenu navMenu = new NavMenu();
        assertThat(navMenu.sectionsList.findBy(text(nameSection)).shouldBe(visible)
                .getAttribute("class")).contains("active");
    }

    @И("^нажать на категорию '(.+)'$")
    public void clickCategory(String category) {
        NavMenu navMenu = new NavMenu();
        navMenu.getCategory(category).click();
    }

    @Если("в разделе '(.+)' выбрать категорию '(.+)'")
    public void goToTheCategorySection(String nameSection, String category) {
        hoverOverSection(nameSection);
        checkOpenSectionMenu(nameSection);
        clickCategory(category);
    }
}