package kmsLighthouse.pages;

import kmsLighthouse.BaseView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YouTubeVideoPage extends BaseView {

    public YouTubeVideoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class = \"title style-scope ytd-video-primary-info-renderer\"]")
    public WebElement nameVideo;

    //Получение название видео после успешного перехода

    public String successText() {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
                .xpath("//*[@class = \"title style-scope ytd-video-primary-info-renderer\"]")));
        String successText = nameVideo.getText();
        return successText;
    }
}
