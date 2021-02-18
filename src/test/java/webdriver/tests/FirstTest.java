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

public class FirstTest {
    WebDriver driver;

    @BeforeTest
    public void init() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("https://idemo.bspb.ru/");
    }

    @Test
    public void firstTest() {

        LoginPage.insertUserName("demo");
        LoginPage.insertUserPassword("demo");
        LoginPage.clickSignInButton();

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
