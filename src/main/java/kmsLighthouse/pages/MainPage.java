package kmsLighthouse.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    WebDriver driver;

    //Ожидание popup

    public MainPage waitForPopup() {
        new WebDriverWait(driver, 5).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[@class = \"leadin-preview-wrapper\"]")));
        return this;
    }

    //Закрытие popup

    @FindBy(xpath = "//*[@class = \"leadinModal-close\"]")
    public WebElement closeButtonForPopup;

    public MainPage closePopup() {
        closeButtonForPopup.click();
        return this;
    }

    @FindBy(name = "firstname")
    public WebElement inputFirstName;

    @FindBy(name = "lastname")
    public WebElement inputLastName;

    @FindBy(name = "email")
    public WebElement inputEmail;

    @FindBy(name = "phone")
    public WebElement inputPhoneNumber;

    @FindBy(name = "company")
    public WebElement inputCompanyName;

    //Метод заполнения всех обязательных полей

    public MainPage fillAllInputs(String firstName, String lastName, String eMail,
                                  String phoneNumber, String companyName) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputEmail.sendKeys(eMail);
        inputPhoneNumber.sendKeys(phoneNumber);
        inputCompanyName.sendKeys(companyName);
        return this;
    }

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement buttonSubmit;

    //Метод нажатия на кнопку Submit

    public WelcomePage clickButtonSubmit() {
        buttonSubmit.click();
        return new WelcomePage(driver);
    }

    //Добавлены отдельные методы заполнения полей для использования в других тестах.

    public MainPage fillInputFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
        return this;
    }

    public MainPage fillInputLastName(String lastName) {
        inputLastName.sendKeys(lastName);
        return this;
    }

    public MainPage fillInputEmail(String eMail) {
        inputEmail.sendKeys(eMail);
        return this;
    }

    public MainPage fillInputPhone(String phoneNumber) {
        inputPhoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public MainPage fillInputCompanyName(String companyName) {
        inputCompanyName.sendKeys(companyName);
        return this;
    }

    @FindBy(xpath = "//*[@class=\"leadinModal-description-body\"]/p/a")
    public WebElement elementWithLinkVideo;

    //Метод получения ссылки на видео

    public String getLinkVideo() {
        String linkVideo = this.elementWithLinkVideo.getAttribute("href");
        return linkVideo;
    }

    //метод открытия ссылки на видео

    public YouTubeVideoPage goToVideoPage() {
        driver.get(getLinkVideo());
        return new YouTubeVideoPage(driver);
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
