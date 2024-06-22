package reusableMethodsLibrary;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.InvoicePage;
import Pages.LoginOfApplication;
import Pages.Workflow;
import uttils.appUtils;

public class WorkflowUser extends appUtils {
	
	LoginOfApplication loa;
	Workflow wf;
	
	
	@Test
	public void userLastLogin() throws InterruptedException {
		
	
	loa = new LoginOfApplication(driver);
	wf = new Workflow(driver);
	
	loa.username("nagarjuna.s@mind-graph.com"); // nagarjuna.s@mind-graph.com // emmaolyvia@yopmail.com
	loa.password("P@ssword-1");
	loa.clickLogin();
	loa.otp();
	loa.otpSubmitButton();
	
	wf.workflow();
	wf.selectApplication();
	wf.dateRange();
	wf.enterSubject("Last login details");
	wf.enterMessage("User last login details");
	wf.clickSubmit();

}
	}
