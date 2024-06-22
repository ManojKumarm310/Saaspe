package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.CurrencyConversionPage;
import Pages.LoginOfApplication;
import uttils.appUtils;

public class CurrencyConversion extends appUtils {

	LoginOfApplication loa; 
	CurrencyConversionPage ccp;
	
	@Test
	public void changePreferredCurrency() throws InterruptedException {
		
		loa = new LoginOfApplication(driver);
		ccp = new CurrencyConversionPage(driver);
		
		loa.username("rogaqoti@tutuapp.bid"); // rogaqoti@tutuapp.bid // neliariane@yopmail.com
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		
		ccp.prefernceLink();
		ccp.preferredCurrency("USD");
		ccp.clickSave();
	}
}
