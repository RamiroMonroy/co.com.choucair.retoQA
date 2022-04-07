package co.com.choucair.retoQA.stepdefinitions;

import co.com.choucair.retoQA.interactions.OpenSource;
import co.com.choucair.retoQA.models.DataMainMenu;
import co.com.choucair.retoQA.models.HomePage;
import co.com.choucair.retoQA.questions.ValidationMainMenu;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @Given("^the user is on the web page$")
    public void theUserIsOnTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenSource.on(homePage));
    }

    @Then("^the user should see the options of main menu$")
    public void theUserShouldSeeTheOptionsOfMainMenu(List<DataMainMenu> data) {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(ValidationMainMenu.isVisible(data.get(0)))));
    }

}
