package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import pageobjects.conponents.NavMenu;

import static com.codeborne.selenide.Condition.*;
import static org.assertj.core.api.Assertions.assertThat;
import static util.ActionsOnElements.removeEvilBanner;

public class NavMenuSteps {

    @Дано("^навести мышку на раздел (.+) в навигационном меню$")
    public void hoverOverSection(String nameSection) {
        NavMenu navMenu = new NavMenu();
        removeEvilBanner();
        navMenu.categoriesList.findBy(text(nameSection)).hover();
    }

    @То("^раскрыто меню (.+)$")
    public void checkOpenSectionMenu(String nameSection) {
        NavMenu navMenu = new NavMenu();
        assertThat(navMenu.categoriesList.findBy(text(nameSection)).getAttribute("class")).contains("active");
    }

    @И("^нажать на подраздел (.+)$")
    public void clickSubSection(String nameSubSection) {
        NavMenu navMenu = new NavMenu();
        navMenu.subCategoriesList.findBy(text(nameSubSection)).click();
    }

    @И("^нажать на элемент подраздела (.+)$")
    public void clickItemSubSection(String nameItemSubSection) {
        NavMenu navMenu = new NavMenu();
        navMenu.getItemSubCategories(nameItemSubSection).click();
    }
}
