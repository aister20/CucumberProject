package runners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}, glue= {"stepDefinitions"}
				, plugin = {"pretty","html:test-output"} 
				, dryRun = true, monochrome = true)
public class TestRunner {

}
