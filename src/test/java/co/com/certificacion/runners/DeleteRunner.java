package co.com.certificacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/delete.feature",
        glue = {"co/com/certificacion/stepdefinitions/hook",
                "co/com/certificacion/stepdefinitions"
        }
)
public class DeleteRunner {
}
