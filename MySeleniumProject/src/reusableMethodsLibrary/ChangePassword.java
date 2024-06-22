package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.ChangePasswordPage;
import uttils.appUtils;

public class ChangePassword extends appUtils {

	ChangePasswordPage cp;
	
	@Test
	public void changePassword() {
		
		cp = new ChangePasswordPage(driver);
		
		cp.mailId("manoj.km@mind-graph.com");
		cp.password("P@ssword-1");
		cp.loginButton();
		cp.otp();
		cp.submitButton();
		cp.changePassword();
		cp.oldPassword("P@ssword-1");
		cp.newPassword("P@ssword-12");
		cp.confirmPassowrd("P@ssword-12");
		cp.passSubmitButton();
	}
}
