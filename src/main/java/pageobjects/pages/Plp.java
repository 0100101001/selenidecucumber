package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static util.ActionsOnElements.removeEvilBanner;

public class Plp {
    public Plp() {
        removeEvilBanner();
    }

    public ElementsCollection productTitleList = $$(By.xpath(".//div[@data-init='productTileList']//child::h4[@title]"));
}
