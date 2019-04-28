package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pageobjects.PageObject;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static util.ActionsOnElements.removeEvilBanner;

public class ItemCardPage extends PageObject {
    public ItemCardPage() {
        validateIsExpectedPage();
        removeEvilBanner();
    }

    @Override
    public void validateIsExpectedPage() {
        $(By.xpath(".//div[contains(@class,'sel-pdp-container')]")).should(exist);
    }

    public SelenideElement addToCartButton = $(By.xpath(".//div[@class='o-pay ']//input[@data-init='addToBasket']"));

    public SelenideElement popupBlock = $(By.xpath(".//div[@class='c-popup__close']//parent::div[@class='c-popup__block']"));

    public SelenideElement btnContinueShopping = $(By.xpath(".//a[@data-sel='page_name-a-close_popup']"));

    public SelenideElement btnClosePopup = $(By.xpath("//div[@class='c-popup__close']"));

    public SelenideElement productTitle = $(By.xpath(".//div[@class='o-pdp-topic__title']//h1"));

}

