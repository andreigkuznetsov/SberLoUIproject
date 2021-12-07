package yahoo.andreikuzn.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import yahoo.andreikuzn.pages.AboutCompanyPage;

public class TestBase {

    AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;

    }

}
