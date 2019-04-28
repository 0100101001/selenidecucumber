package pageobjects.conponents;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pageobjects.Component;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static util.ActionsOnElements.removeEvilBanner;

public class Header extends Component {
    public Header() {
        validateComponentIsAvailable();
        removeEvilBanner();
    }

    @Override
    public void validateComponentIsAvailable() {
        $(By.className("header-area")).should(exist);
    }

    public SelenideElement iconCartInHeader = $(By.xpath(".//div[@class='header-area']//child::div[@id='js-mini-basket']"));
}
