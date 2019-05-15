package pageobjects.conponents;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$x;

public class NavMenu {

    public ElementsCollection sectionsList = $$x(
            ".//nav[@class='header-nav']//child::li[contains(@class, 'header-nav-item has-dropdown')]");

    public ElementsCollection categoriesList = $$x(
            ".//nav[@class='header-nav']//child::li[contains(@class, 'header-nav-item has-dropdown')]");

    public SelenideElement getCategory(String nameCategories) {
        String selector = String.format(".//li[contains(@class,'header-nav-drop-down-list-item') " +
                "and contains(string(),'%s')]", nameCategories);
        return $$x(selector).findBy(exactText(nameCategories));
    }
}
