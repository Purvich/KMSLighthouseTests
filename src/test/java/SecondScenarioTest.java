import kmsLighthouse.Params;
import kmsLighthouse.pages.MainPage;
import kmsLighthouse.pages.YouTubeVideoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SecondScenarioTest extends BaseTest{

    @Test
    void secondScenario() {

        /*
         * Open the following page: https://www.kmslh.com/automation-test/
         * on the redirected page, wait for the popup and click copy link button
         * open the copied link.
         * Verify GE Healthcare: A KMS Lighthouse Success Story video is opened.
         */

        new MainPage(driver)
                .waitForPopup()
                .goToVideoPage();

        Assertions.assertEquals(Params.NAME_VIDEO, new YouTubeVideoPage(driver).successText());
    }
}
