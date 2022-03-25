package kmsLighthouse.pages;

import kmsLighthouse.base.BaseView;
import kmsLighthouse.locators.YouTubeVideoPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YouTubeVideoPage extends BaseView {

    //Получение название видео после успешного перехода
    public String successText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(locators().nameVideo));
        String successText = locators().nameVideo.getText();
        return successText;
    }

    public YouTubeVideoPage(WebDriver driver) {
        super(driver);
    }

    private YouTubeVideoPageLocators locators() {
        return new YouTubeVideoPageLocators(driver);
    }
}
