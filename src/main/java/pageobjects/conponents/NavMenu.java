package pageobjects.conponents;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pageobjects.Component;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static util.ActionsOnElements.removeEvilBanner;

public class NavMenu extends Component {
    public NavMenu() {
        validateComponentIsAvailable();
        removeEvilBanner();
    }

    @Override
    public void validateComponentIsAvailable() {
        $(By.className("header-nav")).should(exist);
    }

    public ElementsCollection categoriesList = $$(By.xpath(
            ".//nav[@class='header-nav']//child::li[contains(@class, 'header-nav-item has-dropdown')]"));

    public ElementsCollection subCategoriesList = $$(By.xpath(".//strong[@class='header-nav-drop-down-title']"));

    public ElementsCollection itemSubCategoriesList = $$(By.xpath(".//li[contains(@class,'header-nav-drop-down-list-item')]"));


    public SelenideElement getItemSubCategories(String nameItem) {
        String selector = String.format(".//li[contains(@class,'header-nav-drop-down-list-item') " +
                "and contains(string(),'%s')]", nameItem);
        return $$(By.xpath(selector)).findBy(exactText(nameItem));
    }
}
