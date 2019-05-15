package pageobjects.conponents;

import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$x;

public class PopupBlock {

    public SelenideElement popupBlock = $x(".//div[@class='c-popup__close']" +
            "//parent::div[@class='c-popup__block']");

    public SelenideElement mapElements(String elementText) {
        HashMap<String, String> listElements = new HashMap<>();

        listElements.put("Продолжить покупки", ".//a[@data-sel='page_name-a-close_popup']");
        listElements.put("Перейти в корзину", ".//a[@data-sel='page_name-a-cart_redirect']");

        return $x(listElements.get(elementText));
    }
}
