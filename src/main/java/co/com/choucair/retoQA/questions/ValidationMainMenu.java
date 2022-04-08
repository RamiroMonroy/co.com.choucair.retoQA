package co.com.choucair.retoQA.questions;

import co.com.choucair.retoQA.models.DataMainMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.retoQA.userinterface.HomePageUserInterface.OPTIONS_MAIN_MENU;

public class ValidationMainMenu implements Question<Boolean> {

    DataMainMenu dataMainMenu, data;

    public ValidationMainMenu(DataMainMenu dataMainMenu) {
        this.dataMainMenu = dataMainMenu;
        data=new DataMainMenu();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        data.setServicios(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(0).getText());
        data.setIndustrias(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(1).getText());
        data.setFormacion(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(2).getText());
        data.setComunidad(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(3).getText());
        data.setEmpleos(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(4).getText());
        data.setNosotros(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(5).getText());
        data.setContactenos(OPTIONS_MAIN_MENU.resolveAllFor(actor).get(6).getText());
        return dataMainMenu.toString().equals(data.toString());
    }
    public static ValidationMainMenu isVisible(DataMainMenu dataMainMenu){
        return new ValidationMainMenu(dataMainMenu);
    }
}
