package kmsLighthouse.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import kmsLighthouse.data.Data;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected static WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(Data.BASE_URL);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
