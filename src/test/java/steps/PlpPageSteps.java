package steps;

import cucumber.api.java.ru.Пусть;

import static pageobjects.PageObjectProvider.plp;


public class PlpPageSteps {

    @Пусть("^нажать на заголовок (.+) товара в списке$")
    public void clickProductBySerialNumber(int serialNumber) {
        plp.productTitleList.get(serialNumber).click();
    }
}
