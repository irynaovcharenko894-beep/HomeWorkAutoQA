package fw;

import core.BaseHelper;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }


    public boolean isRegistrationSuccessMessagePresent() {
        return elementIsPresent(By.xpath("//div[contains(text(),'Your registration completed')]"));
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
