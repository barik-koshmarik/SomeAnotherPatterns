package webdriver.tests;

import org.testng.annotations.AfterTest;
import webdriver.driver.Driver;

public class BaseTest {

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }
}
