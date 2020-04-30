package demo.webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class WebDriverInstance {

    public static WebDriver driver;

    public static void initialize(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito");

        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);


        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void driverQuit(){
        driver.quit();
    }
}
