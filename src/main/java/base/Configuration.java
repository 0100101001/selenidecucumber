package base;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:config/project.properties"})

public interface Configuration extends Config {

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

    @DefaultValue("10000")
    @Key("selenide.fileDownloadTimeout")
    long selenideFileDownloadTimeout();

    @DefaultValue("false")
    @Key("project.debug")
    boolean projectDebug();

    @DefaultValue("./data")
    @Key("project.dataDirectory")
    String projectDataDirectory();

    @DefaultValue("small-ads.json")
    @Key("project.dataFile")
    String projectDataFile();
}
