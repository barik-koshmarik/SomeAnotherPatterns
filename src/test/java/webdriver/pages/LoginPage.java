package webdriver.pages;

import static webdriver.pages.LoginPageLocators.*;

public class LoginPage extends BasePage {

    public static void insertUserName(String demo) {
        input(USERNAME_INPUT, demo);
    }

    public static void insertUserPassword(String demo) {
        input(PASSWORD_INPUT, demo);
    }

    public static void clickSignInButton() {
        clickButton(SIGN_IN_BUTTON);
    }
}
