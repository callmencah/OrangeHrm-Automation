package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDef",
        plugin = {"pretty", "html:target/cucumber.html"},
        monochrome = true
)
public class runAll {
}
