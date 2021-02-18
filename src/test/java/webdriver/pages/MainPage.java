package webdriver.pages;

import static webdriver.pages.MainPageLocators.USER_NAME;

public class MainPage extends BasePage {

    public static String getUserName() {
        return initElement(USER_NAME).getText();
    }


}
