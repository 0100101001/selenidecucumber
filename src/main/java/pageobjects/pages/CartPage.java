package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pageobjects.PageObject;

import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static util.ActionsOnElements.removeEvilBanner;

public class CartPage extends PageObject {
    public CartPage() {
        validateIsExpectedPage();
        removeEvilBanner();
    }

    @Override
    public void validateIsExpectedPage() {
        $(By.xpath(".//div[@data-init='cart']")).should(exist);
    }

    public List<String> itemTitleInCartList = $$(By.xpath(".//a[@class='c-link c-cart-item__title']")).texts();
}
