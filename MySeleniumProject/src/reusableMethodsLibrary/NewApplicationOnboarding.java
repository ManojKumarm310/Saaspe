package reusableMethodsLibrary;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.LoginOfApplication;
import Pages.NewApplicationPage;
import Pages.ProjectS;
import uttils.appUtils;

public class NewApplicationOnboarding extends appUtils {

	LoginOfApplication loa;
	NewApplicationPage na;
	
	@Test
	public void newApplication() throws InterruptedException, AWTException {
		
		loa = new LoginOfApplication(driver);
		na = new NewApplicationPage(driver);
		
		loa.username("rishi.p@mind-graph.com"); // rishi.p@mind-graph.com // zasawuze@lyft.live
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		
		na.addApplication();
		na.selectApplication("Bitbucket");
		na.providerName("Google");
		na.selectCategory("Project Management");
		na.firstOwnerMail("becejyjy@clout.wiki");
		na.reasonForOnboarding();
		na.project("Trailblazer Techniques");
		na.selectCurrency("PHP");
		na.productName("Standard");
		na.productType("License");
		na.unitPrice("80");
		na.quantity("10");
		na.appNextButton();
		na.chooseFile();
		na.docuNextButton();
		na.similarAppPage();
		na.submitButton();
		
	}
}
