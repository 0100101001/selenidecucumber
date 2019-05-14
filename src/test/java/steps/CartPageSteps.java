package steps;

import cucumber.api.java.ru.Ктомуже;
import cucumber.api.java.ru.Тогда;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static org.assertj.core.api.Assertions.assertThat;
import static pageobjects.PageObjectProvider.cartPage;
import static util.TestHelper.addedProductList;

public class CartPageSteps {

    @Тогда("^открыта корзина$")
    public void checkOpenCartPage() {
        cartPage.validateIsExpectedPage();
    }

    @Ктомуже("^в корзине отображаются добавленные товары$")
    public void addedCheckingOfGoods() {
        assertThat(addedProductList).as("Список добавленных товаров пуст! \n" + addedProductList).isNotNull();

        for (String product : addedProductList) {
            cartPage.itemTitleInCartList.findBy(text(product)).should(exist);
        }
    }
}
