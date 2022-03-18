package kmsLighthouse.pages;

import kmsLighthouse.BaseView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BaseView {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text() = \"Thank you for singing up! \"]")
    public WebElement headingTitle;

    //Получение текста после успешного перехода

    public String successText() {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
                .xpath("//*[@class = \"elementor-heading-title elementor-size-small\"]")));
        String successText = headingTitle.getText();
        return successText;
    }
}
