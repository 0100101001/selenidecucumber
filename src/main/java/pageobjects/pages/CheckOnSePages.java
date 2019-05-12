package pageobjects.pages;

import static pageobjects.PageObjectProvider.*;

public class CheckOnSePages {

    public void validateIsExpectedPage(String expectedPage) {
        switch (expectedPage) {
            case "Корзина": cartPage.validateIsExpectedPage();
            break;
            case "Карточка товара": itemCardPage.validateIsExpectedPage();
            break;
            case "Главная": homePage.validateIsExpectedPage();
        }
    }
}
