
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class HW3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openHomePageTest() {
        System.out.println("Page title is: " + driver.getTitle());
    }
    @Test
    public void findElementsTest() {
        driver.findElement(By.id("nivo-slider")); // лого корзинка

        driver.findElement(By.className("search-box-button")); // поиск кнопка

        driver.findElement(By.cssSelector("input[value='Search store']")); // инпут серча


        driver.findElement(By.tagName("h2")); // по заголовкам


        driver.findElement(By.cssSelector(".ico-register")); //Регистрация "." это класс, найти элемент где  в классе есть  ico-register


        driver.findElement(By.cssSelector(".ico-login")); // Логин кнопка

        driver.findElement(By.cssSelector("#topcartlink")); //  # = ИД - найти эллемент где ИД = topcartlink


        driver.findElement(By.className("block-category-navigation")); // меню категорий слева


        driver.findElement(By.cssSelector(".footer")); // футер


        driver.findElement(By.id("newsletter-subscribe-block")); // подписка

        System.out.println("Вот мои 10 элементов");
    }



    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}

