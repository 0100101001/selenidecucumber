package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static util.ActionsOnElements.removeEvilBanner;

public class CartPage {
    public CartPage() {
        removeEvilBanner();
    }

    public ElementsCollection itemTitleInCartList = $$(By.xpath(".//a[@class='c-link c-cart-item__title']"));
}
