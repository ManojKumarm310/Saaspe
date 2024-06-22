package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.LoginOfApplication;
import Pages.ProjectS;
import uttils.appUtils;

public class ProjectOnboarding extends appUtils {
	
	LoginOfApplication loa;
	ProjectS po;
	
	@Test
	public void singleProject() throws InterruptedException {
		
		loa = new LoginOfApplication(driver);
		po = new ProjectS(driver);
		
		loa.username("rishi.p@mind-graph.com"); // rishi.p@mind-graph.com // zasawuze@lyft.live
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		po.projectTab();
		po.projectCode("54201");
		po.projectDescription("New project requirement");
		po.projectName("Global Venture");
		po.projectManager("kumar.talent5@gmail.com");
		po.secondaryManager("");
		po.pCurrency("EUR");
		po.pBudget("14572");
		po.startDate("17/12/2023");
		po.endDate("16/12/2024");
		po.selectApplication("Google Analytics");
		po.applicationType();
		po.pSubmit();
		
	}
	

}
