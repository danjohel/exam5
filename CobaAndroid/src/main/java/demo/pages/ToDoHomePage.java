package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoHomePage {

    public boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public void clickButton(){
        WebElement addButton = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));
        addButton.click();
    }

    public String getTitle(){
        WebElement noteTitle = AndroidDriverInstance.androidDriver.findElement(By.id("title"));
        String title = noteTitle.getText();
        return title;
    }

    public void clickComplete(){
        WebElement completeCheck = AndroidDriverInstance.androidDriver.findElement(By.id("complete"));
        completeCheck.click();
    }

    public boolean isComplete(){
        String isChecked = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("checked");
        boolean checkBox = Boolean.valueOf(isChecked);

        return checkBox;
    }

    public void clickFilter(){
        WebElement filterButton = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        filterButton.click();
    }

    public boolean isOnFilterMenu(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, 'Active')]"))).isDisplayed();
    }

    public void clickOnActive(){
        WebElement activeButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Active')]"));
        activeButton.click();
    }

    public void clickOnComplete(){
        WebElement activeButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Complete')]"));
        activeButton.click();
    }

    public void clickMoreOptions(){
        WebElement optionsButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc= 'More options']"));
        optionsButton.click();
    }

    public boolean isOnMoreOptionsMenu(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, 'Refresh')]"))).isDisplayed();
    }

    public void clickOnRefresh(){
        WebElement refreshButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Refresh')]"));
        refreshButton.click();
    }

    public void clickOnClearCompleted(){
        WebElement clearCompletedButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Clear completed')]"));
        clearCompletedButton.click();
    }

    public void clickNavigate(){
        WebElement navigateButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
        navigateButton.click();
    }

    public boolean isOnNavigateMenu(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.CheckedTextView[contains(@text, 'Statistics')]"))).isDisplayed();
    }

    public void clickStatistics(){
        WebElement statisticsButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text, 'Statistics')]"));
        statisticsButton.click();
    }

}
