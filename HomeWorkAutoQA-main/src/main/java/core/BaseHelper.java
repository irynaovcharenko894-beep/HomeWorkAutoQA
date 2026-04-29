package core;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseHelper {
    protected static WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;

    }


    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean elementIsPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void clickOnButtons(String registerButton, String genderButton, String confirmRegisterButton) {
        click(By.cssSelector(registerButton));
        click(By.id(genderButton));
        click(By.id(confirmRegisterButton));

    }

    public String takeScreenshot() {
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Path dir = Paths.get("src/test_screenshots");
        try {
            Files.createDirectories(dir); // создаст, если не существует
        } catch (IOException e) {
            throw new RuntimeException("Failed to create directory", e);
        }

        Path screenshot = dir.resolve("screen-" + System.currentTimeMillis() + ".png");

        try {
            Files.copy(tmp.toPath(), screenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Screenshot saved to: [" + screenshot.toAbsolutePath() + "]");
        return screenshot.toAbsolutePath().toString();
    }
}
