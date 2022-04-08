package co.com.choucair.retoQA.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class HomePageUserInterface {

    public static final Target OPTIONS_MAIN_MENU= Target.the("options_main_menu").locatedBy("//nav[@id='mainnav']/div/ul/li");
    public static final Target TEXT_OPTIONS_MAIN_MENU= Target.the("text_options_main_menu").locatedBy("//nav[@id='mainnav']/div/ul/li/a[contains(text(),'{0}')]");
    public static final Target TITLE_OPTIONS= Target.the("title_options").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target OPTIONS_EMPLEOS= Target.the("options_empleos").locatedBy("//li[@id='menu-item-550']");
    public static final Target BUTTON_IR_AL_PORTAL_DE_EMPLEOS= Target.the("button_ir_al_porta_de_empleos").locatedBy("//span[contains(text(),'Ir al portal de empleos')]");
    public static final Target ALERT_MESSAGE= Target.the("alert_message").locatedBy("//h2[@class='elementor-heading-title elementor-size-default']");
    public static final Target BUTTON_COOKIES= Target.the("button_cookies").locatedBy("//a[@id='cookie_action_close_header']");
}
