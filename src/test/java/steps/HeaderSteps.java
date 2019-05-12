package steps;

import cucumber.api.java.bg.И;
import static pageobjects.PageObjectProvider.header;

public class HeaderSteps {

    @И("^перейти в корзину через иконку в шапке сайта$")
    public void clickIconCartInHeader() {
        header.iconCartInHeader.click();
    }
}
