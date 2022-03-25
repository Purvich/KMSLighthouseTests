package kmsLighthouse.pages;

import kmsLighthouse.base.BaseView;
import kmsLighthouse.locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BaseView {

    //Ожидание popup
    public MainPage waitForPopup() {
        webDriverWait.until(ExpectedConditions.visibilityOf(locators().popupMenu));
        return this;
    }

    //Закрытие popup
    public MainPage closePopup() {
        locators().closeButtonForPopup.click();
        return this;
    }

    //Метод заполнения всех обязательных полей
    public MainPage fillAllInputs(String firstName, String lastName, String eMail,
                                  String phoneNumber, String companyName) {
        locators().inputFirstName.sendKeys(firstName);
        locators().inputLastName.sendKeys(lastName);
        locators().inputEmail.sendKeys(eMail);
        locators().inputPhoneNumber.sendKeys(phoneNumber);
        locators().inputCompanyName.sendKeys(companyName);
        return this;
    }

    //Метод нажатия на кнопку Submit
    public WelcomePage clickButtonSubmit() {
        locators().buttonSubmit.click();
        return new WelcomePage(driver);
    }

    //Добавлены отдельные методы заполнения полей для использования в других тестах.
    public MainPage fillInputFirstName(String firstName) {
        locators().inputFirstName.sendKeys(firstName);
        return this;
    }

    public MainPage fillInputLastName(String lastName) {
        locators().inputLastName.sendKeys(lastName);
        return this;
    }

    public MainPage fillInputEmail(String eMail) {
        locators().inputEmail.sendKeys(eMail);
        return this;
    }

    public MainPage fillInputPhone(String phoneNumber) {
        locators().inputPhoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public MainPage fillInputCompanyName(String companyName) {
        locators().inputCompanyName.sendKeys(companyName);
        return this;
    }

    //Метод получения ссылки на видео
    public String getLinkVideo() {
        String linkVideo = this.locators().elementWithLinkVideo.getAttribute("href");
        return linkVideo;
    }

    //метод открытия ссылки на видео

    public YouTubeVideoPage goToYouTubeVideoPage() {
        driver.get(getLinkVideo());
        return new YouTubeVideoPage(driver);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private MainPageLocators locators() {
        return new MainPageLocators(driver);
    }
}
