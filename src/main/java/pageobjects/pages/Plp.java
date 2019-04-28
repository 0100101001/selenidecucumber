package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import pageobjects.PageObject;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Plp extends PageObject {
    public Plp() {
        validateIsExpectedPage();
    }

    @Override
    public void validateIsExpectedPage() {
        $(By.className("o-plp-container_sub-header")).should(exist);
        $(By.xpath("//div[contains(@class, 'o-plp-container__main-block')]")).should(exist);
    }

    public ElementsCollection productTitleList = $$(By.xpath(".//div[@data-init='productTileList']//child::h4[@title]"));

}
