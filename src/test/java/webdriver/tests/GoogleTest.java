package webdriver.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import webdriver.driver.Driver;

public class GoogleTest extends BaseTest {

    @Test
    public void googleTest() {
        WebDriver driver = Driver.getDriver();
        driver.get("http://google.com");
        driver.findElement(By.className("q"));
    }

}
