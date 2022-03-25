package kmsLighthouse.locators;

import kmsLighthouse.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageLocators extends BaseView {

    //popup
    @FindBy(xpath = "//*[@class = \"leadin-preview-wrapper\"]")
    public WebElement popupMenu;

    //поле firstname
    @FindBy(name = "firstname")
    public WebElement inputFirstName;

    //поле lastname
    @FindBy(name = "lastname")
    public WebElement inputLastName;

    //поле email
    @FindBy(name = "email")
    public WebElement inputEmail;

    //поле phone
    @FindBy(name = "phone")
    public WebElement inputPhoneNumber;

    //поле company name
    @FindBy(name = "company")
    public WebElement inputCompanyName;

    //кнопка закрытия popup
    @FindBy(xpath = "//*[@class = \"leadinModal-close\"]")
    public WebElement closeButtonForPopup;

    //кнопка submit
    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement buttonSubmit;

    //ссылка на popup
    @FindBy(xpath = "//*[@class=\"leadinModal-description-body\"]/p/a")
    public WebElement elementWithLinkVideo;

    public MainPageLocators(WebDriver driver) {
        super(driver);
    }
}
