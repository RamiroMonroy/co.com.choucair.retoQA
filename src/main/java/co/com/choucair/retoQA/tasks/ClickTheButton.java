package co.com.choucair.retoQA.tasks;

import co.com.choucair.retoQA.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;

import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.*;

public class ClickTheButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPTIONS_EMPLEOS));
        Wait.stopExecution(1000);
        actor.attemptsTo(Click.on(BUTTON_COOKIES));
        actor.attemptsTo(Click.on(BUTTON_IR_AL_PORTAL_DE_EMPLEOS));
    }

    public static ClickTheButton click(){
        return Tasks.instrumented(ClickTheButton.class);
    }
}
