package yahoo.andreikuzn.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WebpagesAboutSberLoTests extends TestBase {

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка секции О Компании сайта СберЛогистика")
    void aboutDpdPageTests() throws IOException {
        aboutCompanyPage.openIndexPage()
                .checkIndexText()
                .openAboutPage()
                .checkAboutText()
                .checkAboutContentText()
                .openBranchesPage()
                .checkBranchesText()
                .checkBranchesContentText()
                .openPressPage()
                .checkPressText()
                .checkPressContentText()
                .openDocsPage()
                .checkDocsText()
                .checkDocsContentText()
                .checkPublicOfferDoc()
                .openQuestionsAndAnswersPage()
                .checkQuestionsAndAnswersText()
                .checkQuestionsAndAnswersContentText()
                .openContactsPage()
                .checkContactsText()
                .checkContactsContentText()
                .openVacancyPage()
                .checkVacancyText()
                .checkVacancyContentText();
    }
}




