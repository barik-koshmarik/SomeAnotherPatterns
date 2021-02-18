package webdriver.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webdriver.pages.FakePage;
import webdriver.pages.MainPage;

public class FakeTest {
    FakePage fakePage;

    @BeforeTest
    public void init() {
        fakePage = new FakePage();
    }

    @Test
    public void logIn() {
        MainPage mainPage = fakePage.insertLogin("")
                                    .insertPassword("")
                                    .pushSignInButton();

        Assert.assertEquals(mainPage.checkUser(), "");
    }

    @Test
    public void successfulLogin() {


        Assert.assertEquals(MainPage.getUserName(), "Vasya");
    }
}
