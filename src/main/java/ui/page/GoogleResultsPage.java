package ui.page;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage {
    public void clickPerformanceLabHref() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.findElement(By.xpath("//a[@href='https://www.performance-lab.ru/']")).click();
    }
}
