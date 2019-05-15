package util;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static pageobjects.PageObjectProvider.itemCardPage;

public class TestHelper {
    public static List<String> addedProductList = new ArrayList<>();

    public static void rememberAddedItemToCart() {
        String titleItem = itemCardPage.productTitle.getText().replaceAll("\n", "").trim();
        // Запомним добавленный товар
        addedProductList.add(titleItem);
        assertThat(addedProductList).as("Товар не добавлен! \n" + addedProductList).contains(titleItem);
    }
}