package steps;

import cucumber.api.java.ru.Ктомуже;
import cucumber.api.java.ru.Тогда;
import pageobjects.pages.CartPage;

import java.util.ArrayList;
import java.util.List;

import static steps.ItemCardPageSteps.addedProductList;

public class CartPageSteps {

    public static List<String> listOfItemsInCart = new ArrayList<>();

    @Тогда("^открыта корзина$")
    public void checkOpenCartPage() {
        new CartPage();
    }

    @Ктомуже("^в корзине отображаются добавленные товары$")
    public void addedCheckingOfGoods() {
        CartPage cartPage = new CartPage();
        listOfItemsInCart.add(String.valueOf(cartPage.itemTitleInCartList));
        //TODO не готово

//        addedProductList.containsAll(listOfItemsInCart);
        System.out.println(listOfItemsInCart);
        System.out.println(addedProductList);
        System.out.println(listOfItemsInCart.containsAll(addedProductList));
    }
}
