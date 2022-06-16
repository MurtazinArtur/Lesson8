package uitests.perfomancelab_page;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.RegisterExtension;
import ui.page.GoogleResultsPage;
import ui.page.GoogleSearchPage;
import ui.page.PerformanceLabPage;
import ui.page.TestingSitesPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerformanceLabPageTest {
    @RegisterExtension
    static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true).to("target/screenshots");

    PerformanceLabPage perfPage;

    @BeforeEach
    void searchPerformanceLabPage() {
        step("Ищем страницу Перфоманс Лаб в Google", () -> {
            GoogleSearchPage searchPage = open("https://google.com", GoogleSearchPage.class);
            GoogleResultsPage resultsPage = searchPage.search("performance lab");
            resultsPage.clickPerformanceLabHref();
        });
        perfPage = new PerformanceLabPage();
    }

    @AfterEach
    void closeSelenide() {
        closeWebDriver();
    }

    @Test
    @Tags(value = {@Tag("UI_PerfPageTest"), @Tag("task_1")})
    @DisplayName("UI тест. Задание первое")
    void getMainPagePerformanceLab() {
        step("Проверяем что открыта страница Перфоманс Лаб", () -> {
            assertTrue("Перфоманс Лаб".equalsIgnoreCase(perfPage.getTitleMainPage()));
        });
    }

    @Test
    @Tags(value = {@Tag("UI_PerfPageTest"), @Tag("task_2")})
    @DisplayName("UI тест. Задание второе")
    void getTestingSitesPageInPerformanceLab() {
        TestingSitesPage testingSitesPage = step("В выпадающем меню нажимаем пункт \"Тестирование сайта\"", () -> {
            return perfPage.clickToMenu("Тестирование сайта");
        });
        step("Проверяем что цвет кнопки \"Узнать цены\" синего цвета", () -> {
            assertTrue("#4FADFF".equalsIgnoreCase(testingSitesPage.getColorButton()));
        });
    }

    @Test
    @Tags(value = {@Tag("UI_PerfPageTest"), @Tag("task_3")})
    @DisplayName("UI тест. Задание третье")
    void getAutoTestingPageInPerformanceLab() {
        TestingSitesPage testingSitesPage = step("В выпадающем меню нажимаем пункт \"Автоматизация тестирования\"", () -> {
            return perfPage.clickToMenu("Автоматизация тестирования");
        });
        step("Прокручиваем страницу вниз и нажимаем на картинку", testingSitesPage::startVisibleForm);
        step("Проверяем что форма действительно открылась", testingSitesPage::assertVisibleForm);
    }
}