package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.Если;

import static pageobjects.PageObjectProvider.elementProvider;
import static util.TestHelper.rememberAddedItemToCart;

public class ActionsWithElementsSteps {
    @Если("^нажать на '(.+)' в (.+)$")
    public void clickElement(String elementText, String elementPosition) {
        if (elementText.equals("Добавить в корзину")) rememberAddedItemToCart();
        elementProvider(elementText, elementPosition).shouldBe(Condition.visible).click();
    }
}
