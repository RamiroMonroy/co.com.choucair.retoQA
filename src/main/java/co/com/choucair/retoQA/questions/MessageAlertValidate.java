package co.com.choucair.retoQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.ALERT_MESSAGE;

public class MessageAlertValidate implements Question<Boolean> {
    String message;

    public MessageAlertValidate(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ALERT_MESSAGE.resolveFor(actor).getText().replaceAll("\n","").equals(message);
    }

    public static MessageAlertValidate validate(String message){
        return new MessageAlertValidate(message);
    }
}
