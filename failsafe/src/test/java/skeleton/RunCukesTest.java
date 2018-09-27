package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        plugin = { "json:target/cucumber-report-composite.json", "pretty",
                "html:target/cucumber/","rerun:target/rerun_featureName.txt" })
public class RunCukesTest {
}
