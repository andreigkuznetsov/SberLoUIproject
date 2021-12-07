package yahoo.andreikuzn.pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AboutCompanyPage {

    private final String ABOUT_TEXT = "О компании",
            ABOUT_BREADCRUMBS = "Главная  >  О DPD  >  О компании",
            MISSION_TITLE = "Миссия",
            MISSION_TEXT = "Миссия и корпоративные ценности",
            MISSION_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Миссия",
            HISTORY_TITLE = "История",
            HISTORY_TEXT = "История",
            HISTORY_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  История",
            FACTS_TITLE = "Факты и цифры",
            FACTS_TEXT = "Факты и цифры",
            FACTS_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Факты и цифры",
            SUCCESS_TITLE = "Истории успеха",
            SUCCESS_TEXT = "Истории успеха",
            SUCCESS_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Истории успеха",
            MANAGEMENT_TITLE = "Управление",
            MANAGEMENT_TEXT = "Управление",
            MANAGEMENT_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Управление",
            LISENCE_TITLE = "Лицензии",
            LISENCE_TEXT = "Лицензии",
            LISENCE_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Лицензии",
            AWARDS_TITLE = "Награды",
            AWARDS_TEXT = "Награды",
            AWARDS_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Награды",
            QUALITY_TITLE = "Политика качества",
            QUALITY_TEXT = "Политика качества",
            QUALITY_BREADCRUMBS = "Главная  >  О DPD  >  О компании  >  Политика качества";

    private SelenideElement
            titleText = $("div.sub_navigation"),
            searchText = $("div.content_wrapp"),
            pathBreadcrumbs = $("#breadcrumb"),
            downloadButton = $("div.content_grid div div:nth-child(2) a"),
            downloadText = $(byText("Скачать"));

    @Step("Открываем страницу О компании сайта DPD.ru")
    public AboutCompanyPage openAboutPage() {
        open("https://www.dpd.ru/dpd/o-dpd/o-kompanii.do2");

        return this;
    }
    @Step("Проверяем, что открыта страница О компании")
    public AboutCompanyPage checkAboutText() {
        searchText.shouldHave(text(ABOUT_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице О компаниии правильный")
    public AboutCompanyPage checkAboutBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(ABOUT_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Миссия раздела О компании DPD.ru")
    public AboutCompanyPage openMissionPage() {
        titleText.$(byText(MISSION_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Миссия раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkMissionText() {
        searchText.shouldHave(text(MISSION_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Миссия раздела О компаниии правильный")
    public AboutCompanyPage checkMissionBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(MISSION_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу История раздела О компании DPD.ru")
    public AboutCompanyPage openHistoryPage() {
        titleText.$(byText(HISTORY_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница История раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkHistoryText() {
        searchText.shouldHave(text(HISTORY_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице История раздела О компаниии правильный")
    public AboutCompanyPage checkHistoryBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(HISTORY_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Факты и цифры раздела О компании DPD.ru")
    public AboutCompanyPage openFactsPage() {
        titleText.$(byText(FACTS_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Факты и цифры раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkFactsText() {
        searchText.shouldHave(text(FACTS_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Факты и цифры раздела О компаниии правильный")
    public AboutCompanyPage checkFactsBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(FACTS_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Истории успеха раздела О компании DPD.ru")
    public AboutCompanyPage openSuccessPage() {
        titleText.$(byText(SUCCESS_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Истории успеха раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkSuccessText() {
        searchText.shouldHave(text(SUCCESS_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Истории успеха раздела О компаниии правильный")
    public AboutCompanyPage checkSuccessBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(SUCCESS_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Управление раздела О компании DPD.ru")
    public AboutCompanyPage openManagementPage() {
        titleText.$(byText(MANAGEMENT_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Управление раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkManagementText() {
        searchText.shouldHave(text(MANAGEMENT_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Управление раздела О компаниии правильный")
    public AboutCompanyPage checkManagementBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(MANAGEMENT_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Лицензии раздела О компании DPD.ru")
    public AboutCompanyPage openLisencePage() {
        titleText.$(byText(LISENCE_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Лицензии раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkLisenceText() {
        searchText.shouldHave(text(LISENCE_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Лицензии раздела О компаниии правильный")
    public AboutCompanyPage checkLisenceBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(LISENCE_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Награды раздела О компании DPD.ru")
    public AboutCompanyPage openAwardsPage() {
        titleText.$(byText(AWARDS_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Награды раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkAwardsText() {
        searchText.shouldHave(text(AWARDS_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Награды раздела О компаниии правильный")
    public AboutCompanyPage checkAwardsBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(AWARDS_BREADCRUMBS));

        return this;
    }
    @Step("Открываем страницу Политика качества раздела О компании DPD.ru")
    public AboutCompanyPage openQualityPage() {
        titleText.$(byText(QUALITY_TITLE)).click();

        return this;
    }
    @Step("Проверяем, что открыта страница Политика качества раздела О компании сайта DPD.ru")
    public AboutCompanyPage checkQualityText() {
        searchText.shouldHave(text(QUALITY_TEXT));

        return this;
    }
    @Step("Проверяем, что путь в хлебных крошках на странице Политика качества раздела О компаниии правильный")
    public AboutCompanyPage checkQualityBreadcrumbs() {
        pathBreadcrumbs.shouldHave(text(QUALITY_BREADCRUMBS));

        return this;
    }
    @Step("Проверяем, что документ Политика качества содержит 1 страницу")
    public AboutCompanyPage checkQualityPolicyDoc() throws IOException {
        downloadText.scrollTo();
        File pdf = downloadButton.download();
        PDF parsedPdf = new PDF(pdf);
        Assertions.assertEquals(1, parsedPdf.numberOfPages);

        return this;
    }
}

