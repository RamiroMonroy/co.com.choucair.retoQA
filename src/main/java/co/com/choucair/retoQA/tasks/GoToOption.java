package co.com.choucair.retoQA.tasks;

import co.com.choucair.retoQA.models.DataTitle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.TEXT_OPTIONS_MAIN_MENU;

public class GoToOption implements Task {

    DataTitle dataTitle;

    public GoToOption(DataTitle dataTitle) {
        this.dataTitle = dataTitle;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(TEXT_OPTIONS_MAIN_MENU.of(dataTitle.getOption())));
    }

    public static GoToOption go(DataTitle dataTitle){
        return Tasks.instrumented(GoToOption.class,dataTitle);
    }
}
