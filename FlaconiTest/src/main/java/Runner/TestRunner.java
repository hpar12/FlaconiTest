package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Hariharan/Desktop/EW/FlaconiTest/src/main/java/Features/BuyPerfume.feature", glue = {
		"stepDefinitions" }, plugin = { "pretty", "html:target/test-output" })

public class TestRunner {

}
