package HomeWork5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

        @Test
        public void createNewAccountPositiveTest() {


            clickOnButtons(".ico-register", "gender-female", "register-button");
            fillRegisterForm(new User("Test1", "Test1", "irynaovcharenko894@gmail.com", "Aa12345!", "Aa12345!"));
           
            int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
            String email = "irynaovcharenko894" + i + "@gmail.com";

            Assert.assertTrue(isRegistrationSuccessMessagePresent(),
                    "Сообщение об успешной регистрации не найдено!");

            }


}







