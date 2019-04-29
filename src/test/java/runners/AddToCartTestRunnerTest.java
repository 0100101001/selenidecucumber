package runners;

import base.Context;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;
import util.TestListener;

import static com.codeborne.selenide.WebDriverRunner.addListener;
import static steps.ItemCardPageSteps.addedProductList;


@CucumberOptions(features = "src/test/resources/features/",
        glue = {"steps"},
        tags = "@smoke")
public class AddToCartTestRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setUp() {
        Context.initialize();
        addListener(new TestListener());
    }

    @After
    public void clearData() {
        // Очистка списка добавленных товаров в тесте
        addedProductList.clear();
    }
}
