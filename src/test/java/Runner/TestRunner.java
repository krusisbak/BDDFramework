package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\Software\\BDDFramework\\src\\test\\java\\feature\\Login.feature",
        glue={"stepDefinitions"},
        format = {"pretty","html:html","json:json/cucumber.json","junit:junit/cucumber.xml"},
        dryRun = false
    //  monochrome = true,
    //  strict = true
)

public class TestRunner {
}
