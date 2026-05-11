package demoqa;

import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

        @Test
        public void createNewAccountPositiveTest() {
            int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
            String email = "irynaovcharenko894" + i + "@gmail.com";
            app.getUserHelper().clickOnButtons(".ico-register", "gender-female", "register-button");
            app.getUserHelper().fillRegisterForm(new model.User("Test1", "Test1", email, "Aa12345!", "Aa12345!"));


            Assert.assertTrue(app.getUserHelper().isRegistrationSuccessMessagePresent(),
                    "Сообщение об успешной регистрации не найдено!");
            }
}







