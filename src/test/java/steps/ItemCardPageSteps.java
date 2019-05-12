package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.NoSuchElementException;
import pageobjects.PageObjectProvider;
import pageobjects.pages.ItemCardPage;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$$;
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
//        ItemCardPage itemCardPage = new ItemCardPage();

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

    @Тогда("^закрыть всплывающий блок$")
    public void closePopupBlock() {
        ItemCardPage itemCardPage = new ItemCardPage();
        itemCardPage.btnClosePopup.click();
    }
}
