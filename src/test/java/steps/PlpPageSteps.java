package steps;

import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import pageobjects.pages.Plp;


public class PlpPageSteps {

    @Тогда("^открыта страница со списком товаров$")
    public void checkPlpPage() {
        new Plp();
    }

    @Пусть("^нажать на заголовок '(.+)' товара в списке$")
    public void clickProductBySerialNumber(int serialNumber) {
        Plp plp = new Plp();
        plp.productTitleList.get(serialNumber).click();
    }
}
