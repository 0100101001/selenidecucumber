package pageobjects.pages;

import org.openqa.selenium.By;
import pageobjects.PageObject;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static util.ActionsOnElements.removeEvilBanner;

public class HomePage extends PageObject {
    public HomePage() {
        validateIsExpectedPage();
        removeEvilBanner();
    }

    @Override
    public void validateIsExpectedPage() {
        $(By.className("home")).should(exist);
    }
}

