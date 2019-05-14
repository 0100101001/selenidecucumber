package pageobjects.conponents;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static util.ActionsOnElements.removeEvilBanner;

public class Header {
    public Header() {
        removeEvilBanner();
    }

    public SelenideElement iconCartInHeader = $(By.xpath(".//div[@class='header-area']//child::div[@id='js-mini-basket']"));

    public SelenideElement mapElements(String elementText) {
        HashMap<String, String> listElements = new HashMap<>();

        listElements.put("Иконка корзины", ".//div[@class='header-area']//child::div[@id='js-mini-basket'])");

        return $x(listElements.get(elementText));
    }
}
