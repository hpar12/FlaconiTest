package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Hariharan/git/FlaconiTest/FlaconiTest/src/main/java/customerJourney", glue = {
		"stepDefinitions" }, plugin = { "pretty",
				"html:target/test-output" }, monochrome = true, dryRun = false, tags = { "@AddToCart, @BuyPerfume" })

public class TestRunner {

}
