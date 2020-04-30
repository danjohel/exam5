package demo.hooks;

import demo.webdriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverHook {
    @Before
    public void initializeWebDriver(){
        WebDriverInstance.initialize();
    }

    @After
    public void quitWebDriver(){
        WebDriverInstance.driverQuit();
    }
}
