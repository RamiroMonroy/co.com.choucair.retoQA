package co.com.choucair.retoQA.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\home_page.feature",
        glue = "co.com.choucair.retoQA.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@CP-001,@CP-002,@CP-004,@CP-006"
)
public class HomePage {
}
