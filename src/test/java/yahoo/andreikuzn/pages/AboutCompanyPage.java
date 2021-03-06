package yahoo.andreikuzn.pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;
import configuration.WebDriverUtil;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AboutCompanyPage {

    private final String INDEX_TEXT = "Отследить посылку",
            ABOUT_TEXT = "О компании",
            CONTENT_ABOUT_TEXT = "Добро пожаловать в компанию",
            BRANCHES_TEXT = "Региональные офисы",
            CONTENT_BRANCHES_TEXT = "Красноярск",
            PRESS_TEXT = "Пресс-центр",
            CONTENT_PRESS_TEXT = "Новости",
            DOCS_TEXT = "Документы",
            CONTENT_DOCS_TEXT = "Публичная оферта",
            QUESTIONS_OPEN_TEXT = "Вопрос/ответ",
            QUESTIONS_TEXT = "Вопросы и ответы",
            CONTENT_QUESTIONS_TEXT = "компания экосистемы Сбер",
            CONTACTS_TEXT = "Контакты",
            CONTENT_CONTACTS_TEXT = "Реквизиты",
            VACANCY_TEXT = "Вакансии",
            CONTENT_VACANCY_TEXT = "Все категории",
            COOKIES_ACCEPT_BUTTON = "Закрыть";

    private SelenideElement
            searchText = $("#content-wrapper"),
            contentText = $("#content-wrapper section:nth-child(1) div div div.item.item-33.mh-240 div p"),
            vacancyText = $("#vacancy_filter_section"),
            openAboutPage = $("ul.nav"),
            downloadLink = $("#content-wrapper section:nth-child(3) div div div p:nth-child(1) a"),
            downloadText = $(byText("Положение о тарифах")),
            cookiesAccept = $("div.cookie-popup__wrapper");

    WebDriverUtil webDriver = new WebDriverUtil();

    @Step("Открываем главную страницу сайта СберЛогистика")
    public AboutCompanyPage openIndexPage() {
        webDriver.openIndexPage();

        return this;
    }

    @Step("Проверяем, что открыта главная страница")
    public AboutCompanyPage checkIndexText() {
        searchText.shouldHave(text(INDEX_TEXT));

        return this;
    }

    @Step("Открываем страницу О Компании сайта СберЛогистика")
    public AboutCompanyPage openAboutPage() {
        openAboutPage.$(byText(ABOUT_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы О компании правильный")
    public AboutCompanyPage checkAboutText() {
        searchText.shouldHave(text(ABOUT_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы О компаниии правильное")
    public AboutCompanyPage checkAboutContentText() {
        searchText.shouldHave(text(CONTENT_ABOUT_TEXT));

        return this;
    }

    @Step("Открываем страницу Региональные офисы")
    public AboutCompanyPage openBranchesPage() {
        searchText.$(byText(BRANCHES_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы Региональные офисы правильный")
    public AboutCompanyPage checkBranchesText() {
        searchText.shouldHave(text(BRANCHES_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы Региональные офисы правильное")
    public AboutCompanyPage checkBranchesContentText() {
        searchText.shouldHave(text(CONTENT_BRANCHES_TEXT));

        return this;
    }

    @Step("Открываем страницу Пресс-центр")
    public AboutCompanyPage openPressPage() {
        searchText.$(byText(PRESS_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы Пресс-центр правильный")
    public AboutCompanyPage checkPressText() {
        searchText.shouldHave(text(PRESS_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы Пресс-центр правильное")
    public AboutCompanyPage checkPressContentText() {
        searchText.shouldHave(text(CONTENT_PRESS_TEXT));

        return this;
    }

    @Step("Открываем страницу Документы")
    public AboutCompanyPage openDocsPage() {
        searchText.$(byText(DOCS_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы Документы правильный")
    public AboutCompanyPage checkDocsText() {
        searchText.shouldHave(text(DOCS_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы Документы правильное")
    public AboutCompanyPage checkDocsContentText() {
        searchText.shouldHave(text(CONTENT_DOCS_TEXT));

        return this;
    }

    @Step("Проверяем, что документ Положение о тарифах содержит 224 страниц")
    public AboutCompanyPage checkPublicOfferDoc() throws IOException {
        cookiesAccept.$(byText(COOKIES_ACCEPT_BUTTON)).click();
        downloadText.click();
        File pdf = downloadLink.download();
        PDF parsedPdf = new PDF(pdf);
        Assertions.assertEquals(224, parsedPdf.numberOfPages);

        return this;
    }

    @Step("Открываем страницу Вопросы и ответы")
    public AboutCompanyPage openQuestionsAndAnswersPage() {
        searchText.$(byText(QUESTIONS_OPEN_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы Вопросы и ответы правильный")
    public AboutCompanyPage checkQuestionsAndAnswersText() {
        searchText.shouldHave(text(QUESTIONS_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы Вопросы и ответы правильное")
    public AboutCompanyPage checkQuestionsAndAnswersContentText() {
        searchText.shouldHave(text(CONTENT_QUESTIONS_TEXT));

        return this;
    }

    @Step("Открываем страницу Контакты")
    public AboutCompanyPage openContactsPage() {
        searchText.$(byText(CONTACTS_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы Контакты правильный")
    public AboutCompanyPage checkContactsText() {
        searchText.shouldHave(text(CONTACTS_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы Контакты правильное")
    public AboutCompanyPage checkContactsContentText() {
        searchText.shouldHave(text(CONTENT_CONTACTS_TEXT));

        return this;
    }

    @Step("Открываем страницу Вакансии")
    public AboutCompanyPage openVacancyPage() {
        searchText.$(byText(VACANCY_TEXT)).click();

        return this;
    }

    @Step("Проверяем, что заголовок страницы Вакансии правильный")
    public AboutCompanyPage checkVacancyText() {
        searchText.shouldHave(text(VACANCY_TEXT));

        return this;
    }

    @Step("Проверяем, что содержание страницы Вакансии правильное")
    public AboutCompanyPage checkVacancyContentText() {
        vacancyText.shouldHave(text(CONTENT_VACANCY_TEXT));

        return this;
    }

    @Step("Открываем страницу О компании сайта СберЛогистика")
    public AboutCompanyPage openAboutPageLink() {
        open("https://sberlogistics.ru/about");

        return this;
    }

    @Step("Открываем страницу Региональные офисы сайта СберЛогистика")
    public AboutCompanyPage openBranchesPageLink() {
        open("https://sberlogistics.ru/about/regions");

        return this;
    }

    @Step("Открываем страницу Пресс-центр сайта СберЛогистика")
    public AboutCompanyPage openPressPageLink() {
        open("https://sberlogistics.ru/about/press_center");

        return this;
    }

    @Step("Открываем страницу Документы сайта СберЛогистика")
    public AboutCompanyPage openDocsPageLink() {
        open("https://sberlogistics.ru/about/documents");

        return this;
    }

    @Step("Открываем страницу Вопросы и ответы сайта СберЛогистика")
    public AboutCompanyPage openFaqPageLink() {
        open("https://sberlogistics.ru/about/faq");

        return this;
    }

    @Step("Открываем страницу Контакты сайта СберЛогистика")
    public AboutCompanyPage openContactsPageLink() {
        open("https://sberlogistics.ru/about/contacts");

        return this;
    }

    @Step("Открываем страницу Вакансии сайта СберЛогистика")
    public AboutCompanyPage openVacanciesPageLink() {
        open("https://sberlogistics.ru/about/vacancies");

        return this;
    }
}

