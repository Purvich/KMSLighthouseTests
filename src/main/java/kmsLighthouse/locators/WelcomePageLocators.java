package kmsLighthouse.locators;

import kmsLighthouse.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePageLocators extends BaseView {

    //приветственный баннер
    @FindBy(xpath = "//*[@class = \"elementor-heading-title elementor-size-small\"]")
    public WebElement welcomeBanner;

    //текст на баннере
    @FindBy(xpath = "//*[text() = \"Thank you for singing up! \"]")
    public WebElement headingTitle;

    public WelcomePageLocators(WebDriver driver) {
        super(driver);
    }
}
