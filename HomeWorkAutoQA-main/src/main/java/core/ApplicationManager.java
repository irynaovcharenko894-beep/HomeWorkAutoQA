package core;

import fw.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

WebDriver driver;
UserHelper userHelper;

    public UserHelper getUserHelper() {
        return userHelper;
    }

    protected void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        userHelper= new UserHelper(driver);
    }


    protected void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

}
