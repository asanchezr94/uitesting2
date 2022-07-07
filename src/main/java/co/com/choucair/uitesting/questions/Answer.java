package co.com.choucair.uitesting.questions;

import co.com.choucair.uitesting.userinterface.SearchLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameSingin= Text.of(SearchLoginPage.SINGIN).viewedBy(actor).asString();
        if (question.equals(nameSingin)){
            result = true;}
        else{
            result = false;
        }

        return result;
    }
}
