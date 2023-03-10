package co.com.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features/get.feature",
        glue = {"co/com/certificacion/stepdefinitions/hook",
                "co/com/certificacion/stepdefinitions"
        }
)

public class GetRunner {
}
