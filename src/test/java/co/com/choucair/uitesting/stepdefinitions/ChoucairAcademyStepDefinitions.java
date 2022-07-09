package co.com.choucair.uitesting.stepdefinitions;

import co.com.choucair.uitesting.model.LoginData;
import co.com.choucair.uitesting.questions.Answer;
import co.com.choucair.uitesting.tasks.OpenUp;
import co.com.choucair.uitesting.tasks.Register;
import co.com.choucair.uitesting.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.uitesting.tasks.Register.*;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
    OnStage.setTheStage(new OnlineCast()); }

    @Given("^Go to the utes home page, select the Join Today button to register, and fill in all the details$")
    public void goToTheUtesHomePageSelectTheJoinTodayButtonToRegisterAndFillInAllTheDetails(List<LoginData> loginData) throws Exception {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), Register.onThePage(loginData.get(0).getStrFirstname(),loginData.get(0).getStrLastname(),loginData.get(0).getStrEmail(),loginData.get(0).getStrMonth(),loginData.get(0).getStrDay(),loginData.get(0).getStrAge(),loginData.get(0).getStrPassword()));
    }


    @When("^Andres has already registered, we are going to try entering the log in and we are going to select Enter the email and select reset password$")
    public void andresHasAlreadyRegisteredWeAreGoingToTryEnteringTheLogInAndWeAreGoingToSelectTheEmailAndSelectResetPassword(List<LoginData> loginData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(loginData.get(0).getStrLogin()));
    }

    @Then("^The login window will load, with the title login$")
    public void theLoginWindowWillLoadWithTheTitleLogin(List<LoginData> loginData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(loginData.get(0).getStrQuestion())));
    }
}
