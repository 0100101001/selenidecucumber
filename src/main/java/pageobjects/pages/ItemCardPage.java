package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.HashMap;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ItemCardPage {
    public void validateIsExpectedPage() {
        $(By.xpath(".//div[contains(@class,'sel-pdp-container')]")).should(exist);
    }

    public SelenideElement productTitle = $x(".//div[@class='o-pdp-topic__title']//h1");

    public SelenideElement mapElements(String elementText) {
        HashMap<String, String> listElements = new HashMap<>();
        listElements.put("Добавить в корзину", ".//div[@class='o-pay ']//child::input[@data-init='addToBasket']");
        return $x(listElements.get(elementText));
    }
}

