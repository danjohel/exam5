package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikipediaPage {

    public boolean isOnWikipediaPage(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 15);

        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id='firstHeading']"))).isDisplayed();
    }

    public String getName(){
        WebElement pokemonName = WebDriverInstance.driver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String name = pokemonName.getText();
        return name;
    }
    public String getNumber(){
        WebElement pokemonNumber = WebDriverInstance.driver.findElement(By.xpath("//big/b/abbr"));
        String number = pokemonNumber.getText();
        return number;
    }

}
