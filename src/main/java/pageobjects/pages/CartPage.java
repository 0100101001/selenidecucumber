package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class CartPage {

    public void validateIsExpectedPage() {
        $(By.xpath(".//div[@data-init='cart']")).should(exist);
    }

    public ElementsCollection itemTitleInCartList = $$x(".//a[@class='c-link c-cart-item__title']");
}
