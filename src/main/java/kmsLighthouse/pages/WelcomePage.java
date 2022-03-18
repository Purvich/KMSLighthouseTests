package kmsLighthouse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage {

    WebDriver driver;

    @FindBy(xpath = "//*[text() = \"Thank you for singing up! \"]")
    public WebElement headingTitle;

    //Получение текста после успешного перехода

    public String successText() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(By
                        .xpath("//*[@class = \"elementor-heading-title elementor-size-small\"]")));
        String successText = headingTitle.getText();
        return successText;
    }

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
