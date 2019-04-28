package steps;

import cucumber.api.java.ru.Тогда;
import pageobjects.pages.HomePage;


public class HomePageSteps {

    @Тогда("^открыта Главная страница$")
    public void checkOpenHomePage() {
        new HomePage();
    }
}
