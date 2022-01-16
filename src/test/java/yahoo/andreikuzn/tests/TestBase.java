package yahoo.andreikuzn.tests;

import configuration.WebDriverUtil;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import yahoo.andreikuzn.pages.AboutCompanyPage;

public class TestBase {

    AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();

    @BeforeAll
    static void setUp() {
        WebDriverUtil.configure();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}
