package pageobjects;

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
}
