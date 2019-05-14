package steps;

import cucumber.api.java.ru.Тогда;

import static pageobjects.PageObjectProvider.elementProvider;
import static util.TestHelper.addedItemToCart;

public class ActionsWithElementsSteps {
    @Тогда("^нажать на '(.+)' в (.+)$")
    public void clickElement(String elementText, String elementPosition) {
        if (elementText.equals("Добавить в корзину")) addedItemToCart();
        elementProvider(elementText, elementPosition).click();
    }
}
