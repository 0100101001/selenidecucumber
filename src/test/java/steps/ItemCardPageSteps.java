package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Тогда;
import pageobjects.PageObjectProvider;
import pageobjects.pages.ItemCardPage;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static pageobjects.PageObjectProvider.itemCardPage;

public class ItemCardPageSteps {

    public static List<String> addedProductList = new ArrayList<>();

    @Тогда("^открыта карточка товара$")
    public void checkOpenItemCardPage() {
        new ItemCardPage();
    }

    @Если("добавить товар в корзину")
    public void addToCartProduct() {

        itemCardPage.addToCartButton.click();
        String titleItem = itemCardPage.productTitle.getText().replaceAll("\n", "").trim();
        // Запомним добавленный товар
        addedProductList.add(titleItem);
        assertThat(addedProductList).as("Товар не добавлен! \n" + addedProductList).contains(titleItem);
    }

    @Тогда("^появится всплывающий блок$")
    public void checkPopupBlock() {
        ItemCardPage itemCardPage = new ItemCardPage();
        itemCardPage.popupBlock.shouldBe(Condition.visible);
    }
}
