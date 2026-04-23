
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

    public class HW4 {

        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com/");

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void findElementsCSS() {

            driver.findElement(By.cssSelector("#nivo-slider"));

            driver.findElement(By.cssSelector(".search-box-button"));

            driver.findElement(By.cssSelector("input[value='Search store']"));

            driver.findElement(By.cssSelector(".header-links .ico-register"));

            driver.findElement(By.cssSelector(".ico-login"));

            driver.findElement(By.cssSelector("#topcartlink"));

            driver.findElement(By.cssSelector("div.block-category-navigation"));

            driver.findElement(By.cssSelector("input#newsletter-subscribe-button"));

            driver.findElement(By.cssSelector(".footer .title"));

            driver.findElement(By.cssSelector("[class*='newsletter-email']"));
        }
        @Test
        public void findElementsXPath() {

            driver.findElement(By.xpath("//div[@id='nivo-slider']"));

            driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));

            driver.findElement(By.xpath("//a[text()='Register']"));

            driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));

            driver.findElement(By.xpath("//input[@value='Search store']"));

            driver.findElement(By.xpath("//strong[text()='Categories']"));

            driver.findElement(By.xpath("//li[@id='topcartlink']"));

            driver.findElement(By.xpath("//div[@class='footer']//div[@class='title']"));

            driver.findElement(By.xpath("//input[@type='button' and @value='Subscribe']"));

            driver.findElement(By.xpath("(//ul[@class='list']//a)[1]"));
        }



        @AfterMethod(enabled = true)
        public void tearDown() {
            driver.quit();
        }
    }

*/
