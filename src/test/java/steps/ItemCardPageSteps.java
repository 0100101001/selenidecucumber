package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pageobjects.pages.ItemCardPage;

import java.util.ArrayList;
import java.util.List;

public class ItemCardPageSteps {

    public static List<String> addedProductList = new ArrayList<>();

    @Тогда("^открыта карточка товара$")
    public void checkOpenItemCardPage() {
        new ItemCardPage();
    }

    @Дано("^нажать на кнопку добавления товара в корзину$")
    public void addToCartProduct() {
        ItemCardPage itemCardPage = new ItemCardPage();

        itemCardPage.addToCartButton.click();
        // Запомним добавленный товар
        addedProductList.add(itemCardPage.productTitle.getText().replaceAll("\n", "").trim());
    }

    @Когда("^появится всплывающий блок$")
    public void checkPopupBlock() {
        ItemCardPage itemCardPage = new ItemCardPage();

        itemCardPage.popupBlock.shouldBe(Condition.visible);
    }

    @Тогда("^закрыть всплывающий блок$")
    public void closePopupBlock() {
        ItemCardPage itemCardPage = new ItemCardPage();

        itemCardPage.btnClosePopup.click();
    }
}
