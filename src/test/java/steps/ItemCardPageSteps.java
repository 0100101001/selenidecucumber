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

//    @Тогда("^нажать на (.+)$")
//    public void clickElement(String elementText) throws InterruptedException {
//        pageObjectProvider().elementProvider(elementText, null);
//        Thread.sleep(10000);
//    }

    @Тогда("^нажать на (.+) в (.+)$")
    public void clickElement(String elementText, String elementPosition) throws InterruptedException {
        pageObjectProvider().elementProvider(elementText, elementPosition).click();
        Thread.sleep(10000);
    }

    public PageObjectProvider pageObjectProvider() {
        return new PageObjectProvider();
    }
}
