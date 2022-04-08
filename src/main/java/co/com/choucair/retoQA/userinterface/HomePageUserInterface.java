package co.com.choucair.retoQA.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class HomePageUserInterface {

    public static final Target OPTIONS_MAIN_MENU= Target.the("options_main_menu").locatedBy("//nav[@id='mainnav']/div/ul/li");
    public static final Target TEXT_OPTIONS_MAIN_MENU= Target.the("text_options_main_menu").locatedBy("//nav[@id='mainnav']/div/ul/li/a[contains(text(),'{0}')]");
    public static final Target TITLE_OPTIONS= Target.the("title_options").locatedBy("//a[contains(text(),'{0}')]");
}
