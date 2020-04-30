package demo.steps;

import demo.Pokemon;
import demo.pages.GoogleHomePage;
import demo.pages.GoogleSearchPage;
import demo.pages.WikipediaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PokemonStepDefinition {

    private GoogleHomePage googleHomePage = new GoogleHomePage();
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    private WikipediaPage wikipediaPage = new WikipediaPage();
    private Pokemon pokemon = new Pokemon();

    @Given("User open Google Home page")
    public void userOpenGoogleHomePage() {
        googleHomePage.openGoogleHomePage();
    }

    @When("User input {string} on google search bar")
    public void userInputOnGoogleSearchBar(String keyword) {
        googleHomePage.inputGoogleSearchPage(keyword);
    }

    @And("user hit enter")
    public void userHitEnter() {
        googleHomePage.hitEnter();
    }

    @Then("User see google search page list")
    public void userSeeGoogleSearchPageList() {
        googleSearchPage.isOnGoogleSearchPage();
    }

    @Then("User click on the first search result")
    public void userClickOnTheFirstSearchResult() {
        googleSearchPage.clickOnFirstRes();
    }

    @Then("User go to Wikipedia Page")
    public void userGoToWikipediaPage() {
        wikipediaPage.isOnWikipediaPage();
    }

    @And("User see name {string}")
    public void userSeeName(String keyword) {
        String actualName = wikipediaPage.getName();
        Assert.assertEquals(keyword, actualName);
    }

    @And("User see number {string}")
    public void userSeeNumber(String keyword) {
        String actualNumber = wikipediaPage.getNumber();
        Assert.assertEquals(keyword,actualNumber);
    }
}
