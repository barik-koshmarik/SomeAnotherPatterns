package webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakePage extends BasePage {
    WebDriver driver;
    @FindBy(name = " ")
    private static WebElement LOGIN_FIELD;
    @FindBy(name= " ")
    private static WebElement PASSWORD_FIELD;
    @FindBy(name= " ")
    private static WebElement SIGN_IN_BUTTON;

    public FakePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void insertLogin(String userName) {
        LOGIN_FIELD.sendKeys(userName);
    }

    public static void insertPassword(String userPassword) {
        PASSWORD_FIELD.sendKeys(userPassword);
    }

    public static void pushSignInButton() {
        SIGN_IN_BUTTON.click();
    }

    public static void signIn() {
        insertLogin("");
        insertPassword("");
        pushSignInButton();
    }

    public static boolean loginUnSuccessful() {
        return getTitle().equals("SignIn Page");
    }
}
