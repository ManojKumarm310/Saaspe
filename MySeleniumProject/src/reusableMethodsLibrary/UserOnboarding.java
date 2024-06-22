package reusableMethodsLibrary;

import org.testng.annotations.Test;

import Pages.LoginOfApplication;
import Pages.ProjectS;
import Pages.UserPage;
import uttils.appUtils;

public class UserOnboarding extends appUtils {
	
	LoginOfApplication loa;
	UserPage up;
	
	@Test
	public void singleUser() throws InterruptedException {
		
		loa = new LoginOfApplication(driver);
		up = new UserPage(driver);
		
		loa.username("rishi.p@mind-graph.com"); // rishi.p@mind-graph.com // zasawuze@lyft.live
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		
		up.userAdd();
		up.firstName("Manny");
		up.lastName("Meine");
		up.mailAddress("fatenam26@molyg.com");
		up.department("HR");
		up.reportingManager("Smith");
		up.joiningDate("19/03/2023");
		up.employmentType("Permanent");
		up.designation("Team Lead");
		up.gender("Male");
		up.phoneNumber("8506243179");
		up.userSubmit();
	}

}
