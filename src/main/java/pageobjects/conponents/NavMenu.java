package pageobjects.conponents;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;
import static util.ActionsOnElements.removeEvilBanner;

public class NavMenu {
    public NavMenu() {
        removeEvilBanner();
    }

    public ElementsCollection sectionsList = $$(By.xpath(
            ".//nav[@class='header-nav']//child::li[contains(@class, 'header-nav-item has-dropdown')]"));

    public ElementsCollection categoriesList = $$(By.xpath(
            ".//nav[@class='header-nav']//child::li[contains(@class, 'header-nav-item has-dropdown')]"));

    public SelenideElement getCategory(String nameCategories) {
        String selector = String.format(".//li[contains(@class,'header-nav-drop-down-list-item') " +
                "and contains(string(),'%s')]", nameCategories);
        return $$(By.xpath(selector)).findBy(exactText(nameCategories));
    }
}
