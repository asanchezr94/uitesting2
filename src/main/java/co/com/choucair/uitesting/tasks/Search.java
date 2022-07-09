package co.com.choucair.uitesting.tasks;

import co.com.choucair.uitesting.userinterface.SearchLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String login;

    public Search(String login){
        this.login = login;

    }

    public static Search the(String login) {
        return Tasks.instrumented(Search.class,login);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchLoginPage.LOGIN),
                Click.on(SearchLoginPage.FORGOUT),
                Enter.theValue("handreszz2103559@email.com").into(SearchLoginPage.EMAIL),
                Click.on(SearchLoginPage.RESET)

        );
    }
}
