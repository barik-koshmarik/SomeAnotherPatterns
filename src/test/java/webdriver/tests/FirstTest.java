package webdriver.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webdriver.driver.Driver;
import webdriver.pages.LoginPage;
import webdriver.pages.SecondStepAuthPage;

import java.util.concurrent.TimeUnit;

import static webdriver.pages.LoginPage.*;

public class FirstTest {
    WebDriver driver;

    @BeforeTest
    public void init() {

    }

    @Test
    public void firstTest() {

        insertUserName("demo");
        insertUserPassword("demo");
        clickSignInButton();

        Assert.assertTrue(SecondStepAuthPage.isOpened());

    }

    @Test
    void secondTest() {

        driver.findElement(By.id("login-button")).click();
    }

    @AfterTest
    void tearDown() {
        driver.quit();
    }
}
