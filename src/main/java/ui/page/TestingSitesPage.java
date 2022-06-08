package ui.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class TestingSitesPage {
    public String getColorButton() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        setNewCurrentUrl(driver);
        WebElement button = driver.findElement(By.xpath("//a[@href='#1']"));
        return Color.fromString(button.getCssValue("background-color")).asHex();
    }

    public void startVisibleForm() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        setNewCurrentUrl(driver);
        SelenideElement picture = $x("//*[@src='http://test.pflb.ru/wp-content/uploads/2016/07/promo-autocase.jpg']");
        picture.scrollTo();
        sleep(500);
        picture.click();
    }

    public void assertVisibleForm(){
        SelenideElement form = $x("//*[@id='hubspot-Modal-form-Brochur']");
        form.shouldBe(visible);
    }

    private void setNewCurrentUrl(WebDriver driver) {
        String currentUrl = driver.getCurrentUrl();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (!(currentUrl.equals(driver.getCurrentUrl()))) {
                driver.get(driver.getCurrentUrl());
            }
        }
    }
}
