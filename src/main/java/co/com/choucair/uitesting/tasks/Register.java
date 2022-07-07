package co.com.choucair.uitesting.tasks;

import co.com.choucair.uitesting.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private String strFirtsname;
    private String strLastname;
    public Register(String strFirtsname, String strLastname) {
        this.strFirtsname = strFirtsname;
        this.strLastname = strLastname;
    }

    public static Register onThePage(String strFirstname, String strLastname) {
        return Tasks.instrumented(Register.class,strFirstname,strLastname);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegister.LOGIN_BUTTON),
            Enter.theValue(strFirtsname).into(UtestRegister.INPUT_DATA),
            Enter.theValue(strLastname).into(UtestRegister.INPUT_USER),
            Enter.theValue("andreszz203559@email.com").into(UtestRegister.INPUT_EMAIL),
            SelectFromOptions.byValue("number:3").from(UtestRegister.SELECT_MENU),
            SelectFromOptions.byValue("number:5").from(UtestRegister.SELECT_DAY),
            SelectFromOptions.byValue("number:1994").from(UtestRegister.SELECT_AGE),
            Click.on(UtestRegister.NEXT_BUTTON),
            Enter.theValue("").into(UtestRegister.INPUT_CITY),
            Click.on(UtestRegister.BACK),
            Click.on(UtestRegister.NEXT),
            Click.on(UtestRegister.NEXT_BUTTON2),
            Click.on(UtestRegister.BACK2),
            Click.on(UtestRegister.NEXT2),
            Click.on(UtestRegister.NEXT_LAST),
            Enter.theValue("QAtesting1088*").into(UtestRegister.INPUT_PASSWORD),
            Enter.theValue("QAtesting1088*").into(UtestRegister.INPUT_CONFIRMPASS),
            Click.on(UtestRegister.ENTER_VERIFI1),
            Click.on(UtestRegister.ENTER_VERIFI2),
            Click.on(UtestRegister.ENTER_VERIFI3),
            Click.on(UtestRegister.ENTER_BUTTON)

        );
    }
}
