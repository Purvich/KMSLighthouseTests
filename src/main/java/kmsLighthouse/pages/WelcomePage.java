package kmsLighthouse.pages;

import kmsLighthouse.base.BaseView;
import kmsLighthouse.locators.WelcomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BaseView {

    //Получение текста после успешного перехода
    public String successText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(locators().welcomeBanner));
        String successText = locators().headingTitle.getText();
        return successText;
    }

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    private WelcomePageLocators locators() {
        return new WelcomePageLocators(driver);
    }
}
