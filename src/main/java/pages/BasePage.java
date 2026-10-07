package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) {
        return findElement(locator, Duration.ofSeconds(10));
    }

    public WebElement findElement(By locator, Duration duration) {
        wait = new WebDriverWait(driver, duration);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<WebElement> findElements(By locator) {
        return findElements(locator, Duration.ofSeconds(10));
    }

    public List<WebElement> findElements(By locator, Duration duration) {
        wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElements(locator);
    }

    public boolean navigateToPage(String redirectedUrl) {
        return Objects.equals(driver.getCurrentUrl(), redirectedUrl);
    }
}