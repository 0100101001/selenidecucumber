package pageobjects.conponents;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static util.ActionsOnElements.removeEvilBanner;

public class Header {
    public Header() {
        removeEvilBanner();
    }

    public SelenideElement iconCartInHeader = $(By.xpath(".//div[@class='header-area']//child::div[@id='js-mini-basket']"));
}
