package core;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;


public class TestBase {

    protected static ApplicationManager app = new ApplicationManager
            (System.getProperty("browser",Browser.CHROME.browserName()));
    public static final Logger LOGGER = (Logger) LoggerFactory.getLogger(TestBase.class);



    @BeforeMethod
    public void setUp() {
        LOGGER.info("StartTest:");
        app.init();
    }

    @AfterMethod(enabled = true)
    public void tearDown(Method method, ITestResult result) {
        if (result.isSuccess()) {
            LOGGER.info("Test is PASSED: [" + method.getName() + "]");
        } else {
            LOGGER.error("Test is FAILED: [" + method.getName() + "], Screenshot: [" + app.getUserHelper().takeScreenshot() + "]");
        }
        System.out.println("app.stop");
        app.stop();
    }


}






