package runners;

import base.Context;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;


@CucumberOptions(features = "src/test/resources/features", glue = "steps")
public class AddToCartTestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setUp() {
        Context.initialize();
    }
}
