package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/teste_de_login.feature"
        ,glue = {"steps"}
        ,plugin = {"json:target/cucumber.json"}
)

public class TestRunner {
}
