package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Hariharan/git/FlaconiTest/FlaconiTest/src/main/java/customerJourney", glue = {
		"stepDefinitions" }, plugin = { "pretty", "html:target/test-output" }, monochrome = true, // display
																									// the
																									// console
																									// output
																									// in
																									// a
																									// proper
																									// readable
																									// format
		// strict = true, // it will check if any step is not defined in step
		// definition file
		dryRun = false, // to check the mapping is proper between feature file
						// and step def file)
		tags = { "@Tag4" })

public class TestRunner {

}
