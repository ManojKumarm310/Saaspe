package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\SaaSpe_Application\\src\\test\\java\\FeatureFiles\\Incidents.feature", 
	glue = "stepDefenitions", dryRun = false,
	plugin = { "pretty","html:target/cucumber-reports.html" }
	)
	
	public class Dept {
	
}
