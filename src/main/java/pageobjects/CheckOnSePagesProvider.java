package pageobjects;

import com.codeborne.selenide.Condition;

import static pageobjects.PageObjectProvider.*;

public class CheckOnSePagesProvider {

    public static void validateIsExpectedPage(String expectedPage) {
        switch (expectedPage) {
            case "Корзина" : cartPage.validateIsExpectedPage();
            break;
            case "Карточка товара" : itemCardPage.validateIsExpectedPage();
            break;
            case "Главная" : homePage.validateIsExpectedPage();
            break;
            case "Страница списка товаров" : plp.validateIsExpectedPage();
        }
    }

    public static void checkTheAppearanceOfTheElement(String elementName) {
        switch (elementName) {
            case "Всплывающий блок":
                popupBlock.popupBlock.shouldBe(Condition.visible);
                break;
        }
    }
}
