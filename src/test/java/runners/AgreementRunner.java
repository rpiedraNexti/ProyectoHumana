package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/convenios_sla.feature",
        glue = "src/test/java/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin ="pretty"
)
public class AgreementRunner {

}
