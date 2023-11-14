package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium\\SaaSpe_Application\\src\\test\\java\\FeatureFiles\\Department.feature", 
glue = "stepDefenitions", dryRun = true)
public class Login {

}
