package framework.driver;

import framework.utils.ConfPropertiesManager;
import framework.utils.Logger;
import org.openqa.selenium.WebDriver;

public class DriverUtils {
    private static WebDriver instance;

    public DriverUtils() { }

    public static WebDriver getInstance() {
        Logger.writeLog("Initializing the framework.driver");
        if (instance == null) {
            instance = BrowserFactory.getBrowser(ConfPropertiesManager.getProperty("browser.name"));
        }
        return instance;
    }

    public static void maximizeWindow() {
        Logger.writeLog("Maximize window");
        getInstance().manage().window().maximize();
    }

    public static void getStartUrl() {
        Logger.writeLog("Get the test url");
        getInstance().get(ConfPropertiesManager.getProperty("test.url"));
    }

    public static void quitDriver() {
        if (getInstance() != null) {
            Logger.writeLog("Quit framework.driver and stop testing");
            getInstance().quit();
        }
    }

}
