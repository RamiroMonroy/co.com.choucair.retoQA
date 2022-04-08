package co.com.choucair.retoQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.CONFIRMATION_MESSAGE;

public class ConfirmationMessage implements Question<Boolean> {
    String message;

    public ConfirmationMessage(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CONFIRMATION_MESSAGE.resolveFor(actor).getText().equals(message);
    }

    public static ConfirmationMessage isEqual(String message){
        return new ConfirmationMessage(message);
    }
}
