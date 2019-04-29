package steps;

import cucumber.api.java.ru.Ктомуже;
import cucumber.api.java.ru.Тогда;
import pageobjects.pages.CartPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static org.assertj.core.api.Assertions.assertThat;
import static steps.ItemCardPageSteps.addedProductList;

public class CartPageSteps {

    @Тогда("^открыта корзина$")
    public void checkOpenCartPage() {
        new CartPage();
    }

    @Ктомуже("^в корзине отображаются добавленные товары$")
    public void addedCheckingOfGoods() {
        CartPage cartPage = new CartPage();
        assertThat(addedProductList).as("Список добавленных товаров пуст! \n" + addedProductList).isNotNull();

        for (String product : addedProductList) {
            cartPage.itemTitleInCartList.findBy(text(product)).should(exist);
        }
    }
}
