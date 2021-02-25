package webdriver.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



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
        return new ChromeDriver(chromeOptions);
    }

}
