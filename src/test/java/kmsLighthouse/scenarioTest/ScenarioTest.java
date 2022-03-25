package kmsLighthouse.scenarioTest;

import kmsLighthouse.base.BaseTest;
import kmsLighthouse.pages.MainPage;
import kmsLighthouse.data.Data;
import kmsLighthouse.pages.WelcomePage;
import kmsLighthouse.pages.YouTubeVideoPage;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ScenarioTest extends BaseTest{

    @Test
    @Order(1)
    @DisplayName("Scenario 1")
    void firstScenario() {

        /*
         * Open the following page: https://www.kmslh.com/automation-test/
         * Fill all the relevant information with random valid values
         * Submit
         * Confirmation the submit was successful
         */

        new MainPage(driver)
                .waitForPopup()
                .closePopup()
                .fillAllInputs(
                        Data.FIRST_NAME,
                        Data.LAST_NAME,
                        Data.E_MAIL,
                        Data.PHONE_NUMBER,
                        Data.COMPANY_NAME)
                .clickButtonSubmit();

        Assertions.assertEquals(Data.SUCCESS_TEXT, new WelcomePage(driver).successText());
    }

    @Test
    @Order(2)
    @DisplayName("Scenario 2")
    void secondScenario() {

        /*
         * Open the following page: https://www.kmslh.com/automation-test/
         * on the redirected page, wait for the popup and click copy link button
         * open the copied link.
         * Verify GE Healthcare: A KMS Lighthouse Success Story video is opened.
         */

        new MainPage(driver)
                .waitForPopup()
                .goToYouTubeVideoPage();

        Assertions.assertEquals(Data.NAME_VIDEO, new YouTubeVideoPage(driver).successText());
    }
}
