package demo.steps;

import demo.pages.AddToDoPage;
import demo.pages.StatisticPage;
import demo.pages.ToDoHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ToDoStepDefinition {

    private ToDoHomePage toDoHomePage = new ToDoHomePage();
    private AddToDoPage addToDoPage = new AddToDoPage();
    private StatisticPage statisticPage = new StatisticPage();

    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {

        toDoHomePage.isOnPage();
    }

    @When("User click on add task button")
    public void userClickOnAddTaskButton() {

        toDoHomePage.clickButton();
    }

    @Then("User input title {string}")
    public void userInputTitle(String noteTitle) {

        addToDoPage.inputTitle(noteTitle);
    }

    @And("User input description {string}")
    public void userInputDescription(String noteDesc) {

        addToDoPage.inputDescription(noteDesc);
    }

    @And("User click on add button")
    public void userClickOnAddButton() {

        addToDoPage.clickAdd();
    }

    @Then("User see title {string} on to do list page")
    public void userSeeTitleNoteOnToDoListPage(String noteTitle) {
        String actual = toDoHomePage.getTitle();
        Assert.assertEquals(noteTitle, actual);
    }

    @When("User click on checkbox")
    public void userClickOnCheckbox() throws InterruptedException {
        toDoHomePage.clickComplete();
    }

    @Then("User see checkbox is checked")
    public void userSeeCheckboxIsChecked(){
        Assert.assertTrue(toDoHomePage.isComplete());
    }


    @Then("User see checkbox is unchecked")
    public void userSeeCheckboxIsUnchecked() {
        Assert.assertFalse(toDoHomePage.isComplete());
    }

    @When("User click on filter button")
    public void userClickOnFilterButton() {
        toDoHomePage.clickFilter();
    }

    @Then("User see menu of filter button")
    public void userSeeMenuOfFilterButton() {
        toDoHomePage.isOnFilterMenu();
    }

    @When("User click on Active")
    public void userClickOnActive() {
        toDoHomePage.clickOnActive();
    }

    @Then("User see {string} on Active todo")
    public void userSeeAllActiveTodo(String noteTitle) throws InterruptedException {
        String actual = toDoHomePage.getTitle();
        Assert.assertEquals(noteTitle, actual);
        Thread.sleep(5000);
    }

    @When("User click on Complete Button")
    public void userClickOnCompleteButton() {
        toDoHomePage.clickOnComplete();
    }

    @Then("User see {string} on Complete todo")
    public void userSeeOnCompleteTodo(String noteTitle) throws InterruptedException {
        String actual = toDoHomePage.getTitle();
        Assert.assertEquals(noteTitle, actual);
        Thread.sleep(5000);
    }

    @When("User click on more options")
    public void userClickOnMoreOptions() {
        toDoHomePage.clickMoreOptions();
    }

    @Then("User see more options menu")
    public void userSeeMoreOptionsMenu() {
        toDoHomePage.isOnMoreOptionsMenu();
    }

    @When("User click on Refresh button")
    public void userClickOnRefreshButton() throws InterruptedException {
        toDoHomePage.clickOnRefresh();
        Thread.sleep(3000);
    }

    @When("User click on Clear Completed button")
    public void userClickOnClearCompletedButton() {
        toDoHomePage.clickOnClearCompleted();
    }

    @When("User click on Navigate button")
    public void userClickOnNavigateButton() {
        toDoHomePage.clickNavigate();
    }

    @Then("User see menu of Navigate button")
    public void userSeeMenuOfNavigateButton() {
        toDoHomePage.isOnNavigateMenu();
    }

    @When("User click on Statistics")
    public void userClickOnStatistics() {
        toDoHomePage.clickStatistics();
    }

    @Then("User see Statistic view")
    public void userSeeStatisticView() {
        statisticPage.isOnStatisticMenu();

    }
}
