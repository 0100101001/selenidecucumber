package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static util.ActionsOnElements.removeEvilBanner;

public class ItemCardPage {
    public void validateIsExpectedPage() {
        $(By.xpath(".//div[contains(@class,'sel-pdp-container')]")).should(exist);
    }

    public SelenideElement addToCartButton = $(By.xpath(".//div[@class='o-pay ']//input[@data-init='addToBasket']"));

    public SelenideElement popupBlock = $x(".//div[@class='c-popup__close']//parent::div[@class='c-popup__block']");

    public SelenideElement btnClosePopup = $x("//div[@class='c-popup__close']");

    public SelenideElement productTitle = $x(".//div[@class='o-pdp-topic__title']//h1");

    public SelenideElement getButton(String buttonText) {
        SelenideElement element = null;
        switch (buttonText.trim()) {
            case "Добавить в корзину":
                element = $x(".//div[@class='o-pay ']//input[@data-init='addToBasket']");
                break;
            case "Продолжить покупки":
                element = $x(".//a[@data-sel='page_name-a-close_popup']");
                break;
            case "Перейти в корзину":
                element = $x(".//a[@data-sel='page_name-a-cart_redirect']");
        }
        return element;
    }


}

