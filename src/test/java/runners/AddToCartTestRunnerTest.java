package runners;

import base.Context;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;
import util.TestListener;

import static com.codeborne.selenide.WebDriverRunner.addListener;


@CucumberOptions(features = "src/test/resources/features/",
        glue = {"steps"},
        tags = "@smoke")
public class AddToCartTestRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setUp() {
        Context.initialize();
        addListener(new TestListener());
    }
}
