package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {

    public void openGoogleHomePage(){
        WebDriverInstance.driver.get("https://www.google.com");
    }

    public void inputGoogleSearchPage(String keyword){
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.xpath("//div/input[@maxlength='2048']"));
        inputSearch.sendKeys(keyword);
    }

    public void hitEnter(){
        WebElement searchBar = WebDriverInstance.driver.findElement(By.xpath("//div/input[@maxlength='2048']"));
        searchBar.sendKeys(Keys.ENTER);
    }
}
