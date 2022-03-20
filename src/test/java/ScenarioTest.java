import kmsLighthouse.pages.MainPage;
import kmsLighthouse.Params;
import kmsLighthouse.pages.WelcomePage;
import kmsLighthouse.pages.YouTubeVideoPage;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ScenarioTest extends BaseTest {

    @Test
    @Order(1)
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
                        Params.FIRST_NAME,
                        Params.LAST_NAME,
                        Params.E_MAIL,
                        Params.PHONE_NUMBER,
                        Params.COMPANY_NAME)
                .clickButtonSubmit();

        Assertions.assertEquals(Params.SUCCESS_TEXT, new WelcomePage(driver).successText());
    }

    @Test
    @Order(2)
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

        Assertions.assertEquals(Params.NAME_VIDEO, new YouTubeVideoPage(driver).successText());
    }
}
