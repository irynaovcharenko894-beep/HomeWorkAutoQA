package core;

import fw.UserHelper;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class ApplicationManager {

    private final String browser;
    WebDriver driver;

    UserHelper userHelper;

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    protected void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(

            );

        } else {
            driver = new ChromeDriver();
        }
        System.out.println(browser);

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        userHelper = new UserHelper(driver);
    }


    protected void stop() {
        System.out.println(driver);
        if (driver != null) {
            driver.quit();
        }
    }

}
