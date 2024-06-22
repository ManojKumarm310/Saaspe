package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.DepartmentPage;
import Pages.LoginOfApplication;
import Pages.SignUpPage;
import uttils.appUtils;

public class SignUpUser extends appUtils {

	 
	SignUpPage su;
	
	
	@Test
	public void userSignUp() throws InterruptedException {
		
		su = new SignUpPage(driver);
		
		su.signUpLink();
		su.firstName("Silja");
		su.lastName("Bilal");
		su.mailAddress("gadilob51@molyg.com");
		su.mobileNumber("9157230486");
		su.userDesignation("PMO");
		su.password("P@ssword-1");
		su.checkBox();
		su.submitButton();
		
	}
}
