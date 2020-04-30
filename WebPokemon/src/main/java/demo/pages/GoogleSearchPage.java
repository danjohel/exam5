package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage {

    public boolean isOnGoogleSearchPage(){
            WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 15);

            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/h2[@class='bNg8Rb']"))).isDisplayed();
    }

    public void clickOnFirstRes(){
        WebElement firstRes = WebDriverInstance.driver.findElement(By.cssSelector("body.srp.tbo.vasq:nth-child(2) div.big:nth-child(3) div.mw:nth-child(12) div.col:nth-child(2) div.med:nth-child(3) div.g:nth-child(1) div.rc div.r:nth-child(1) a:nth-child(1) > h3.LC20lb.DKV0Md:nth-child(2)"));
        firstRes.click();
    }
}
