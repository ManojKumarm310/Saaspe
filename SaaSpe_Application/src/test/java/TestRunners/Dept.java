package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\SaaSpe_Application\\src\\test\\java\\FeatureFiles\\ButterflyEffect.feature", 
	glue = "stepDefenitions", dryRun = true,
	plugin = { "pretty","html:target/cucumber-reports.html" }
	)
	
	public class Dept {
	
}
