package yahoo.andreikuzn.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WebpagesAboutDpdTests extends TestBase {

    @Test
    @Owner("Andrei Kuznetsov")
    @DisplayName("Проверка секции О Компании сайта DPD.ru")
    void aboutDpdPageTests() throws IOException {
        aboutCompanyPage.openAboutPage()
                .checkAboutText()
                .checkAboutBreadcrumbs()
                .openMissionPage()
                .checkMissionText()
                .checkMissionBreadcrumbs()
                .openHistoryPage()
                .checkHistoryText()
                .checkHistoryBreadcrumbs()
                .openFactsPage()
                .checkFactsText()
                .checkFactsBreadcrumbs()
                .openSuccessPage()
                .checkSuccessText()
                .checkSuccessBreadcrumbs()
                .openManagementPage()
                .checkManagementText()
                .checkManagementBreadcrumbs()
                .openLisencePage()
                .checkLisenceText()
                .checkLisenceBreadcrumbs()
                .openAwardsPage()
                .checkAwardsText()
                .checkAwardsBreadcrumbs()
                .openQualityPage()
                .checkQualityText()
                .checkQualityBreadcrumbs()
                .checkQualityPolicyDoc();
    }
}




