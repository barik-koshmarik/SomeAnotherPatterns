package webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FakePage extends BasePage {

    private final static WebElement LOGIN_FIELD = initElement(By.name(" "));
    private final static WebElement PASSWORD_FIELD = initElement(By.name(" "));
    private final static WebElement SIGN_IN_BUTTON = initElement(By.name(" "));

    public FakePage insertLogin(String userName) {
        LOGIN_FIELD.sendKeys(userName);
        return this;
    }

    public FakePage insertPassword(String userPassword) {
        PASSWORD_FIELD.sendKeys(userPassword);
        return this;
    }

    public MainPage pushSignInButton() {
        SIGN_IN_BUTTON.click();
        return new MainPage();
    }

    public void signIn() {
        insertLogin("");
        insertPassword("");
        pushSignInButton();
    }

    public static boolean loginUnSuccessful() {
        return getTitle().equals("SignIn Page");
    }
}
