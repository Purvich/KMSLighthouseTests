package kmsLighthouse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTubeVideoPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@class = \"title style-scope ytd-video-primary-info-renderer\"]")
    public WebElement nameVideo;

    //Получение название видео после успешного перехода

    public String successText() {
        new WebDriverWait(driver,5).until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(By
                        .xpath("//*[@class = \"title style-scope ytd-video-primary-info-renderer\"]")));
        String successText = nameVideo.getText();
        return successText;
    }

    public YouTubeVideoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
