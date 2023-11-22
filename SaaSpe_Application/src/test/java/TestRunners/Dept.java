package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\SaaSpe_Application\\src\\test\\java\\FeatureFiles\\InvoiceUpload.feature", 
	glue = "stepDefenitions", dryRun = true)
	public class Dept {
	
}
