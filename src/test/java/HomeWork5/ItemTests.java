package HomeWork5;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase{

    @BeforeMethod
    public void precondition() {

        click(By.className("ico-login"));
        type(By.id("Email"), "irynaovcharenko894@gmail.com");
        type(By.id("Password"), "Aa12345!");
        click(By.cssSelector(".button-1.login-button"));
    }

    @Test
    public void addItemToCartTest() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
        click(By.className("ico-cart"));
        Assert.assertTrue(elementIsPresent(By.linkText("14.1-inch Laptop")), "Товар не найден в корзине!");
    }
}

