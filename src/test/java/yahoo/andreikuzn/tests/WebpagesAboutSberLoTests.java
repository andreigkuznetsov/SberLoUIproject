package yahoo.andreikuzn.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WebpagesAboutSberLoTests extends TestBase {

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка главной страницы сайта СберЛогистика")
    void aboutSberLoIndexPageTests() {
        aboutCompanyPage.openIndexPage()
                .checkIndexText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка секции О Компании сайта СберЛогистика")
    void aboutSberLoAboutPageTests1() {
        aboutCompanyPage.openVacanciesPageLink()
                .openAboutPage()
                .checkAboutText()
                .checkAboutContentText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка раздела Региональные офисы секции О Компании сайта СберЛогистика")
    void aboutSberLoBranchesPageTests() {
        aboutCompanyPage.openAboutPageLink()
                .openBranchesPage()
                .checkBranchesText()
                .checkBranchesContentText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка раздела Пресс центр секции О Компании сайта СберЛогистика")
    void aboutSberLoPressPageTests() {
        aboutCompanyPage.openBranchesPageLink()
                .openPressPage()
                .checkPressText()
                .checkPressContentText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка раздела Документы секции О Компании сайта СберЛогистика")
    void aboutSberLoDocsPageTests() {
        aboutCompanyPage.openPressPageLink()
                .openDocsPage()
                .checkDocsText()
                .checkDocsContentText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка документа Положение о тарифах раздела Документы секции О Компании сайта СберЛогистика")
    void aboutSberLoPdfPageTests() throws IOException {
        aboutCompanyPage.openDocsPageLink()
                .checkPublicOfferDoc();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка раздела Вопросы и ответы секции О Компании сайта СберЛогистика")
    void aboutSberLoFaqPageTests() {
        aboutCompanyPage.openDocsPageLink()
                .openQuestionsAndAnswersPage()
                .checkQuestionsAndAnswersText()
                .checkQuestionsAndAnswersContentText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка раздела Контакты секции О Компании сайта СберЛогистика")
    void aboutSberLoContactsPageTests() {
        aboutCompanyPage.openFaqPageLink()
                .openContactsPage()
                .checkContactsText()
                .checkContactsContentText();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка раздела Вакансии секции О Компании сайта СберЛогистика")
    void aboutSberLoVacancyPageTests() {
        aboutCompanyPage.openContactsPageLink()
                .openVacancyPage()
                .checkVacancyText()
                .checkVacancyContentText();
    }
}




