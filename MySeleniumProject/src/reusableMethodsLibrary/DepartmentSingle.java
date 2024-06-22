package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.DepartmentPage;
import Pages.InvoicePage;
import Pages.LoginOfApplication;
import uttils.appUtils;

public class DepartmentSingle extends appUtils {

	LoginOfApplication loa; 
	DepartmentPage dp;
	
	@Test
	public void singleDepartment() {
		
		loa = new LoginOfApplication(driver);
		dp = new DepartmentPage(driver);
		
		
		loa.username("rishi.p@mind-graph.com"); 
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		dp.departmentAdd();
		dp.departmentName("ETL Developer");
		dp.departmentBudget("12000");
		dp.departmentCurrency("MYR");
		dp.ownerMail("xywu@imagepot.net");
		dp.ownerName("John");
		dp.deptSubmit();
	}
}
