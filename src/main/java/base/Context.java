package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;


public class Context {

    private static Context context = null;

    private Configuration configuration = null;

    private String sessionIdentifier = null;

    protected Context() {
        configuration = ConfigFactory.create(Configuration.class, System.getProperties());
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

    protected void initializeSelenide() {

        // URL
        com.codeborne.selenide.Configuration.baseUrl = configuration.siteUrl();

        // Браузер
        com.codeborne.selenide.Configuration.browser = configuration.selenideBrowser();

        // Версия браузера
        com.codeborne.selenide.Configuration.browserVersion = "74.0.3729.108";//configuration.selenidebrowserVersion();

        // Режим запуска браузера (автономный режим)
        com.codeborne.selenide.Configuration.headless = configuration.selenideHeadless();

        // Оставлять ли открытым окно браузера после выполнения тестов
        com.codeborne.selenide.Configuration.holdBrowserOpen = configuration.selenideHoldBrowserOpen();

        // Окно браузера максимально развернуто при запуске.
        com.codeborne.selenide.Configuration.startMaximized = configuration.selenideStartMaximized();

        // Делать ли скриншот при неудачных тестах
        com.codeborne.selenide.Configuration.screenshots = configuration.selenideRecordScreenshots();

        // Расположение каталога, в котором будут сохранены скриншоты/отчеты из Selenide
        com.codeborne.selenide.Configuration.reportsFolder = configuration.selenideReportsFolder() + "/" + sessionIdentifier;

        // Обработка страницы после запуска события load
        // - normal - > возврат после события загрузки
        // - eager - > возврат после DOMContentLoaded
        // - none - > немедленно вернуться
        com.codeborne.selenide.Configuration.pageLoadStrategy = configuration.selenidePageLoadStrategy();

        // Сохранять ли исходный код страницы при неудачных тестах.
        com.codeborne.selenide.Configuration.savePageSource = configuration.selenideSavePageSource();

        // Тайм-аут в миллисекундах для неудачного теста, если условия все еще не выполнены.
        com.codeborne.selenide.Configuration.timeout = configuration.selenideTimeout();
    }
}
