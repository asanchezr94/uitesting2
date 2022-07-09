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
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strAge;
    private String strPassword;

    public Register(String strFirtsname, String strLastname, String strEmail, String strMonth, String strDay, String strAge, String strPassword) {
        this.strFirtsname = strFirtsname;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strAge = strAge;
        this.strPassword = strPassword;

    }

    public static Register onThePage(String strFirstname, String strLastname, String strEmail, String strMonth, String strDay, String strAge, String strPassword) {
        return Tasks.instrumented(Register.class,strFirstname,strLastname,strEmail,strMonth,strDay,strAge,strPassword);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegister.LOGIN_BUTTON),
            Enter.theValue(strFirtsname).into(UtestRegister.INPUT_DATA),
            Enter.theValue(strLastname).into(UtestRegister.INPUT_USER),
            Enter.theValue(strEmail ).into(UtestRegister.INPUT_EMAIL),
            SelectFromOptions.byValue(strMonth).from(UtestRegister.SELECT_MENU),
            SelectFromOptions.byValue(strDay).from(UtestRegister.SELECT_DAY),
            SelectFromOptions.byValue(strAge).from(UtestRegister.SELECT_AGE),
            Click.on(UtestRegister.NEXT_BUTTON),
            Enter.theValue("").into(UtestRegister.INPUT_CITY),
            Click.on(UtestRegister.BACK),
            Click.on(UtestRegister.NEXT),
            Click.on(UtestRegister.NEXT_BUTTON2),
            Click.on(UtestRegister.BACK2),
            Click.on(UtestRegister.NEXT2),
            Click.on(UtestRegister.NEXT_LAST),
            Enter.theValue(strPassword).into(UtestRegister.INPUT_PASSWORD),
            Enter.theValue(strPassword).into(UtestRegister.INPUT_CONFIRMPASS),
            Click.on(UtestRegister.ENTER_VERIFI1),
            Click.on(UtestRegister.ENTER_VERIFI2),
            Click.on(UtestRegister.ENTER_VERIFI3),
            Click.on(UtestRegister.ENTER_BUTTON)

        );
    }
}
