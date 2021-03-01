package webdriver.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Driver {
    private final static Logger LOG = LogManager.getRootLogger();
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        return (driver == null) ? driver = initDriver() : driver;
    }

    private static WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        LOG.info("Driver initialization");
        driver = new EventFiringWebDriver(new ChromeDriver(chromeOptions)).register(new WebDriverListener());
        return driver;
    }

    public static void closeDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
