package kmsLighthouse.locators;

import kmsLighthouse.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubeVideoPageLocators extends BaseView {

    //название видео
    @FindBy(xpath = "//*[@class = \"title style-scope ytd-video-primary-info-renderer\"]")
    public WebElement nameVideo;

    public YouTubeVideoPageLocators(WebDriver driver) {
        super(driver);
    }
}
