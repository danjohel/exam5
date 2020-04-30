package demo.webdriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {

    public static AndroidDriver<AndroidElement> androidDriver;

    public static void initialize(){
        String appiumUrl = "http://0.0.0.0:4723/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "device");
        caps.setCapability("udid", "8CTFG17A20000373");
        caps.setCapability("app", "D:/G2/FE QA/Day23/TodoApp.apk");
        caps.setCapability("automationName", "UIAutomator2");

        try {
            androidDriver = new AndroidDriver<>(new URL(appiumUrl), caps);
            androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quit(){
        androidDriver.quit();
    }
}
