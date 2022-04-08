package co.com.choucair.retoQA.tasks;

import co.com.choucair.retoQA.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.*;
import static co.com.choucair.retoQA.utils.Constants.CONSTANTS_TIME;

public class ClickTheButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPTION_JOBS));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Click.on(BUTTON_COOKIES));
        actor.attemptsTo(Click.on(BUTTON_IR_AL_PORTAL_DE_EMPLEOS));
    }

    public static ClickTheButton click(){
        return Tasks.instrumented(ClickTheButton.class);
    }
}
