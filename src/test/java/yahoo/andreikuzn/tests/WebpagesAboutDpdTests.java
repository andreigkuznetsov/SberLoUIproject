package yahoo.andreikuzn.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WebpagesAboutDpdTests extends TestBase {

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы О Компании сайта DPD.ru")
    void aboutDpdPage() {
        aboutCompanyPage.openAboutPage()
                .checkAboutText()
                .checkAboutBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы Миссия секции О Компании сайта DPD.ru")
    void missionDpdPage() {
        aboutCompanyPage.openMissionPage()
                .checkMissionText()
                .checkMissionBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы История секции О Компании сайта DPD.ru")
    void historyDpdPage() {
        aboutCompanyPage.openHistoryPage()
                .checkHistoryText()
                .checkHistoryBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы Факты и цифры секции О Компании сайта DPD.ru")
    void factsDpdPage() {
        aboutCompanyPage.openFactsPage()
                .checkFactsText()
                .checkFactsBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы Итории успеха секции О Компании сайта DPD.ru")
    void successDpdPage() {
        aboutCompanyPage.openSuccessPage()
                .checkSuccessText()
                .checkSuccessBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы Управление секции О Компании сайта DPD.ru")
    void managementDpdPage() {
        aboutCompanyPage.openManagementPage()
                .checkManagementText()
                .checkManagementBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы Лицензии секции О Компании сайта DPD.ru")
    void licenseDpdPage() {
        aboutCompanyPage.openLisencePage()
                .checkLisenceText()
                .checkLisenceBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка старницы Награды секции О Компании сайта DPD.ru")
    void awardsDpdPage() {
        aboutCompanyPage.openAwardsPage()
                .checkAwardsText()
                .checkAwardsBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка страницы Политика качества секции О Компании сайта DPD.ru")
    void qualityDpdPage() {
        aboutCompanyPage.openQualityPage()
                .checkQualityText()
                .checkQualityBreadcrumbs();
    }

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка PDF-файла Политика качества секции О Компании сайта DPD.ru")
    void qualityPolicyPdf() throws IOException {
        aboutCompanyPage.checkQualityPolicyDoc();
    }
}




