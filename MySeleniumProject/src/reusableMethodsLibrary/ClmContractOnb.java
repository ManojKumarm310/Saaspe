package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.ClmContractOnboarding;
import Pages.LoginOfApplication;
import uttils.appUtils;

public class ClmContractOnb extends appUtils{

	LoginOfApplication loa;
	ClmContractOnboarding co;
	
	
	@Test
	public void contractOnboarding() throws InterruptedException {
		
		loa = new LoginOfApplication(driver);
		co = new ClmContractOnboarding(driver);
		
		loa.username("rishi.p@mind-graph.com");
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		
		co.clmPage();
		co.selectTemplate("FreshBooks_Template 321");
		co.contractName("Freshteam Contract 1212");
		co.startDate("10/05/2023");
		co.endDate("09/05/2024");
		co.renewalRemainder("30");
		co.documentNextButton();
		co.signerNextButton();
		co.watcherName("Purusotham");
		co.watcherMail("purushotham.b@mind-graph.com");
		co.submitButton();
		
		
		
		
		
		
		
		
	}
}
