package HomeWork5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isRegistrationSuccessMessagePresent() {
        return elementIsPresent(By.xpath("//div[contains(text(),'Your registration completed')]"));
    }

    public boolean elementIsPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void clickOnButtons(String registerButton, String genderButton, String confirmRegisterButton) {
        click(By.cssSelector(registerButton));
        click(By.id(genderButton));
        click(By.id(confirmRegisterButton));
    }

    public void login(User user) {
        click(By.className("ico-login"));
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        click(By.cssSelector(".button-1.login-button"));
    }

    public void fillRegisterForm(User user) {
        type(By.id("FirstName"),user.getFirstName());
        type(By.id("LastName"), user.getLastName());
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getConfirmPassword());
    }

}






