package demoqa;

import core.TestBase;
import model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUserHelper().login( new User().setEmail("ovcharenko894@gmail.com").setPassword("Aa12345!"));
    }

    @Test
    public void addItemToCartPositiveTest() {
        app.getUserHelper().click(By.xpath("(//input[@value='Add to cart'])[2]"));
        app.getUserHelper().click(By.xpath("(//span[@class='cart-label'])[1]"));
        Assert.assertTrue(app.getUserHelper().elementIsPresent(By.linkText("14.1-inch Laptop")), "Товар не найден в корзине!");
    }
}

