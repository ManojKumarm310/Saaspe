package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.BudgetCre;
import Pages.LoginOfApplication;
import uttils.appUtils;

public class BudgetCreation extends appUtils{
	
	LoginOfApplication loa; 
	
	BudgetCre bc;
	
	@Test
	public void budgetCreation() throws InterruptedException {
		
		loa = new LoginOfApplication(driver);
		bc = new BudgetCre(driver);
		
		loa.username("disit59329@unbiex.com"); // disit59329@unbiex.com  // neliariane@yopmail.com
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		
		bc.multicloud();
		bc.budgetName("Microsoft Budget 2102");
		bc.resetPeriod();
		bc.budgetStartDate("13/04/2023");
		bc.budgetEndDate("12/04/2024");
		bc.budgetAmount("55000");
		bc.alertType();
		bc.threshold("80");
		bc.emailAddress("manoj.km@mind-graph.com");
		bc.clickSubmit();
	}

}
