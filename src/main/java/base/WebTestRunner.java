package base;

import org.testng.annotations.BeforeClass;

public class WebTestRunner {

    @BeforeClass
    public void setUp() {
        Context.initialize();
    }
}
