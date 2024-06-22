package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.LoginOfApplication;
import Pages.UserRole;
import uttils.appUtils;

public class UserCreation extends appUtils{
	
	LoginOfApplication loa; 
	
	UserRole ur;
	
	@Test
	public void roleCreation() throws InterruptedException {
		
		loa = new LoginOfApplication(driver);
		ur = new UserRole(driver);
		
		loa.username("rogaqoti@tutuapp.bid"); // rogaqoti@tutuapp.bid // neliariane@yopmail.com
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		
		ur.userManagement();
		ur.firstName("Isabella");
		ur.lastName("Kidlat");
		ur.userMail("ticiyo5379@ricoit.com");
		ur.userRole();
		ur.clickSubmit();
		
		
	}

}
