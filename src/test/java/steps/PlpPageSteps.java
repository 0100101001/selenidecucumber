package steps;

import cucumber.api.java.en.Given;

import static pageobjects.PageObjectProvider.plp;


public class PlpPageSteps {

    @Given("^нажать на заголовок (.+) товара в списке$")
    public void clickProductBySerialNumber(int serialNumber) {
        plp.productTitleList.get(serialNumber).click();
    }
}
