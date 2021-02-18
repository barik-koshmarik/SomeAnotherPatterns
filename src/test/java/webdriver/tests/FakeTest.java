package webdriver.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.pages.FakePage;
import webdriver.pages.MainPage;
import webdriver.pages.SecondStepAuthPage;

public class FakeTest {

    @Test
    public void logIn() {
        FakePage.insertLogin("Vasya");
        FakePage.pushSignInButton();

        Assert.assertTrue(FakePage.loginUnSuccessful());
    }

    @Test
    public void successfulLogin() {
        Assert.assertEquals(MainPage.getUserName(), "Vasya");
    }
}
