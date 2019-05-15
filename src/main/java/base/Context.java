package base;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;


public class Context {

    private static Context context = null;
    private ConfigProject configProject = null;
    private String sessionIdentifier = null;

    protected Context() {
        configProject = ConfigFactory.create(ConfigProject.class, System.getProperties());
    }

    public static void initialize() {
        get().initializeSelenide();
    }

    public static Context get() {
        if (context == null) {
            context = new Context();
        }
        return context;
    }

    private void initializeSelenide() {

        // URL
        Configuration.baseUrl = configProject.siteUrl();

        // Браузер
        Configuration.browser = configProject.selenideBrowser();

        // Установка нужной версии браузера
        installingBrowser(configProject.selenideBrowser());

        // Режим запуска браузера (автономный режим)
        Configuration.headless = configProject.selenideHeadless();

        // Оставлять ли открытым окно браузера после выполнения тестов
        Configuration.holdBrowserOpen = configProject.selenideHoldBrowserOpen();

        // Окно браузера максимально развернуто при запуске.
        Configuration.startMaximized = configProject.selenideStartMaximized();

        // Делать ли скриншот при неудачных тестах
        Configuration.screenshots = configProject.selenideRecordScreenshots();

        // Расположение каталога, в котором будут сохранены скриншоты/отчеты из Selenide
        Configuration.reportsFolder = configProject.selenideReportsFolder() + "/" + sessionIdentifier;

        // Стратегия загрузки страницы
        Configuration.pageLoadStrategy = configProject.selenidePageLoadStrategy();

        // Сохранять ли исходный код страницы при неудачных тестах.
        Configuration.savePageSource = configProject.selenideSavePageSource();

        // Тайм-аут в миллисекундах для неудачного теста, если условия все еще не выполнены.
        Configuration.timeout = configProject.selenideTimeout();
    }

    private void installingBrowser(String browserName) {
        if (browserName.contains("hrome")) {
            WebDriverManager.chromedriver().version("2.46").setup();
        }// по необходимости сделать для других браузеров
    }
}
