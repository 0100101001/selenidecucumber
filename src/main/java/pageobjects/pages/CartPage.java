package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import pageobjects.PageObject;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import static util.ActionsOnElements.removeEvilBanner;

public class CartPage extends PageObject {
    public CartPage() {
        validateIsExpectedPage();
        removeEvilBanner();
    }

    @Override
    public void validateIsExpectedPage() {
        $x(".//div[@data-init='cart']").should(exist);
    }

    public ElementsCollection itemTitleInCartList = $$(By.xpath(".//a[@class='c-link c-cart-item__title']"));
}
