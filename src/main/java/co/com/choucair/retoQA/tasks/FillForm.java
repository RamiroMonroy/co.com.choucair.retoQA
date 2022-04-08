package co.com.choucair.retoQA.tasks;

import co.com.choucair.retoQA.models.ShippingForm;
import co.com.choucair.retoQA.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.*;
import static co.com.choucair.retoQA.utils.Constants.CONSTANTS_TIME;

public class FillForm implements Task {

    ShippingForm shippingForm;

    public FillForm(ShippingForm shippingForm) {
        this.shippingForm = shippingForm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPTION_CONTACT_US));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Enter.theValue(shippingForm.getNameAndLastName()).into(INPUT_NAME_LASTNAME));
        actor.attemptsTo(Enter.theValue(shippingForm.getWhatsApp()).into(INPUT_WHATSAPP));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(Enter.theValue(shippingForm.getEmail()).into(INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue(shippingForm.getCity()).into(INPUT_CITY));
        actor.attemptsTo(Enter.theValue(shippingForm.getCompany()).into(INPUT_COMPANY));
        Wait.stopExecution(CONSTANTS_TIME);
        actor.attemptsTo(SelectFromOptions.byVisibleText(shippingForm.getThemesOfInterest()).from(SELECT_THEMES_OF_INTEREST));
        actor.attemptsTo(Enter.theValue(shippingForm.getMessage()).into(TEXTAREA_MESSAGE));
        actor.attemptsTo(Click.on(BUTTON_SEND));
        Wait.stopExecution(CONSTANTS_TIME);
    }

    public static FillForm fillOut(ShippingForm shippingForm){
        return Tasks.instrumented(FillForm.class,shippingForm);
    }
}
