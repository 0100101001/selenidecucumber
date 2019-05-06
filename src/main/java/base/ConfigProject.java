package base;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:src/main/java/config/project.properties"})

public interface ConfigProject extends Config {

    @DefaultValue("https://www.mvideo.ru")
    @Key("site.url")
    String siteUrl();

    @DefaultValue("Chrome")
    @Key("selenide.browser")
    String selenideBrowser();

    @DefaultValue("true")
    @Key("selenide.headless")
    boolean selenideHeadless();

    @DefaultValue("false")
    @Key("selenide.holdBrowserOpen")
    boolean selenideHoldBrowserOpen();

    @DefaultValue("true")
    @Key("selenide.startMaximized")
    boolean selenideStartMaximized();

    @DefaultValue("false")
    @Key("selenide.recordScreenshots")
    boolean selenideRecordScreenshots();

    @DefaultValue("8000")
    @Key("selenide.timeout")
    long selenideTimeout();

    @DefaultValue("./reports")
    @Key("selenide.reportsFolder")
    String selenideReportsFolder();

    @DefaultValue("normal")
    @Key("selenide.pageLoadStrategy")
    String selenidePageLoadStrategy();

    @DefaultValue("false")
    @Key("selenide.savePageSource")
    boolean selenideSavePageSource();
}
