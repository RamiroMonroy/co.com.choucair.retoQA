package co.com.choucair.retoQA.questions;

import co.com.choucair.retoQA.models.DataTitle;
import co.com.choucair.retoQA.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.TITLE_OPTIONS;

public class ValidateMessage implements Question<Boolean> {

    DataTitle dataTitle;

    public ValidateMessage(DataTitle dataTitle) {
        this.dataTitle = dataTitle;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Wait.stopExecution(1000);
        String title=TITLE_OPTIONS.of(String.valueOf(dataTitle.getMessage())).resolveFor(actor).getText();
        return title.equals(dataTitle.getMessage());
    }

    public static ValidateMessage isEqual(DataTitle dataTitle){
        return new ValidateMessage(dataTitle);
    }
}
