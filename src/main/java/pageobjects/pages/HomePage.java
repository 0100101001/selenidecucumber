package pageobjects.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void validateIsExpectedPage() {
        $(By.className("home")).should(exist);
    }
}

