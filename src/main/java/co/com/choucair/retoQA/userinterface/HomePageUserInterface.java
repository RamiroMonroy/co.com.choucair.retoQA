package co.com.choucair.retoQA.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class HomePageUserInterface {

    public static final Target OPTIONS_MAIN_MENU= Target.the("options_main_menu").locatedBy("//nav[@id='mainnav']/div/ul/li");
    public static final Target TEXT_OPTIONS_MAIN_MENU= Target.the("text_options_main_menu").locatedBy("//nav[@id='mainnav']/div/ul/li/a[contains(text(),'{0}')]");
    public static final Target TITLE_OPTIONS= Target.the("title_options").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target OPTION_JOBS= Target.the("option_jobs").locatedBy("//li[@id='menu-item-550']");
    public static final Target BUTTON_IR_AL_PORTAL_DE_EMPLEOS= Target.the("button_ir_al_porta_de_empleos").locatedBy("//span[contains(text(),'Ir al portal de empleos')]");
    public static final Target ALERT_MESSAGE= Target.the("alert_message").locatedBy("//h2[@class='elementor-heading-title elementor-size-default']");
    public static final Target BUTTON_COOKIES= Target.the("button_cookies").locatedBy("//a[@id='cookie_action_close_header']");
    public static final Target OPTION_CONTACT_US= Target.the("option_contact_us").locatedBy("//li[@id='menu-item-282']");
    public static final Target INPUT_NAME_LASTNAME= Target.the("input_name_lastname").locatedBy("//input[@id='form-field-nombre']");
    public static final Target INPUT_WHATSAPP= Target.the("input_whatsapp").locatedBy("//input[@id='form-field-field_fb71456']");
    public static final Target INPUT_EMAIL= Target.the("input_email").locatedBy("//input[@id='form-field-email']");
    public static final Target INPUT_CITY= Target.the("input_city").locatedBy("//input[@id='form-field-field_c3f91b8']");
    public static final Target INPUT_COMPANY= Target.the("input_company").locatedBy("//input[@id='form-field-empresa']");
    public static final Target SELECT_THEMES_OF_INTEREST= Target.the("select_themes_of_interest").locatedBy("//select[@id='form-field-Tipodeservicio']");
    public static final Target TEXTAREA_MESSAGE= Target.the("textarea_message").locatedBy("//textarea[@id='form-field-message']");
    public static final Target BUTTON_SEND= Target.the("button_send").locatedBy("//button[@class='elementor-button elementor-size-sm']");
    public static final Target CONFIRMATION_MESSAGE= Target.the("confirmation_message").locatedBy("//div[@class='elementor-message elementor-message-success']");
}
