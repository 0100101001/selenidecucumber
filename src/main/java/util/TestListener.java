package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import static util.ActionsOnElements.removeEvilBanner;

public class TestListener extends AbstractWebDriverEventListener {
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        removeEvilBanner();
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        removeEvilBanner();
    }
}
