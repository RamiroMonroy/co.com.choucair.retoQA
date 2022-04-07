package co.com.choucair.retoQA.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenSource implements Interaction {

    private PageObject page;

    public OpenSource(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenSource on(PageObject page){
        return Tasks.instrumented(OpenSource.class,page);
    }
}
