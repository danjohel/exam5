package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToDoPage {

    public void inputTitle(String title){
        WebElement inputTitle = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputTitle.sendKeys(title);
    }

    public void inputDescription(String desc){
        WebElement inputDesc = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_description"));
        inputDesc.sendKeys(desc);
    }

    public void clickAdd(){
        WebElement addButton = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));
        addButton.click();
    }
}
