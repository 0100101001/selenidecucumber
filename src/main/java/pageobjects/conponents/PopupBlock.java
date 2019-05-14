package pageobjects.conponents;

import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$x;

public class PopupBlock {

    public SelenideElement mapElements(String elementText) {
        HashMap<String, String> listElements = new HashMap<>();

        listElements.put("Продолжить покупки", ".//a[@data-sel='page_name-a-close_popup']");
        listElements.put("Перейти в корзину", ".//div[@class='c-popup__block']" +
                "//child::input[@value='Перейти в корзину'] | " +
                ".//div[@class='c-popup__block']//child::a[text()='Перейти в корзину']");

        return $x(listElements.get(elementText));
    }
}
