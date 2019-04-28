package steps;

import cucumber.api.java.bg.И;
import pageobjects.conponents.Header;
import pageobjects.pages.CartPage;

public class HeaderSteps {

    @И("^перейти в корзину через иконку в шапке сайта$")
    public void clickIconCartInHeader() {
        Header header = new Header();

        header.iconCartInHeader.click();
    }
}
