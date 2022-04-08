package co.com.choucair.retoQA.stepdefinitions;

import co.com.choucair.retoQA.interactions.OpenSource;
import co.com.choucair.retoQA.models.DataMainMenu;
import co.com.choucair.retoQA.models.DataTitle;
import co.com.choucair.retoQA.models.HomePage;
import co.com.choucair.retoQA.questions.ValidateMessage;
import co.com.choucair.retoQA.questions.ValidationMainMenu;


import co.com.choucair.retoQA.tasks.GoToOption;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.retoQA.utils.Constants.ACTOR;

public class HomePageStepDefinitions {

    HomePage homePage;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }
    //CP-001
    @Given("^the user is on the web page$")
    public void theUserIsOnTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenSource.on(homePage));
    }

    @Then("^the user should see the options of main menu$")
    public void theUserShouldSeeTheOptionsOfMainMenu(List<DataMainMenu> data) {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(ValidationMainMenu.isVisible(data.get(0)))));
    }
    //CP-002
    @When("^enter in a option of the main menu$")
    public void enterInAOptionOfTheMainMenu(List<DataTitle> dataTitle){
        OnStage.theActorInTheSpotlight().attemptsTo(GoToOption.go(dataTitle.get(0)));
    }

    @Then("^the user should see this title$")
    public void theUserShouldSeeThisTitle(List<DataTitle> dataTitle) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessage.isEqual(dataTitle.get(0))));
    }

}
