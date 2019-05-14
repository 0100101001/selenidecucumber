package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;
import static util.ActionsOnElements.removeEvilBanner;

public class Plp {
    public Plp() {
        removeEvilBanner();
    }

    public ElementsCollection productTitleList = $$x(".//div[@data-init='productTileList']//child::h4[@title]");

    public void validateIsExpectedPage() {
        $(By.className("o-plp-container_sub-header")).should(exist);
        $(By.xpath("//div[contains(@class, 'o-plp-container__main-block')]")).should(exist);
    }
}
