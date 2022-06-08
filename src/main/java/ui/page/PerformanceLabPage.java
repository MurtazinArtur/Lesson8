package ui.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class PerformanceLabPage {
    public TestingSitesPage clickToMenu(String menuText) {
        SelenideElement menu = $("nav");
        menu.find(withText("Услуги и продукты")).hover();
        ElementsCollection elements = $$(byXpath(String.format("//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-957']//a[contains(text(),'%s')]", menuText)));
        elements.get(1).click();

        return page(TestingSitesPage.class);
    }

    public String getTitleMainPage() {
        SelenideElement title = $x("//a[@class='navbar-brand logo']");
        return title.attr("title");
    }
}
