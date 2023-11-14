package saaspeTestCase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reusableMethodsLibrary.SignUp;

public class UserSignUp extends SignUp {

	/*public void details() throws InterruptedException {
		
		SignUp su = new SignUp();
		su.userDetails("Artemio", "Irene", "qebawuxa@lyft.live", "7803124596");
		su.uDetails("Manager", "P@ssword-1");
			
	} */
	
	@Parameters({"firname","lasname","mailid","phoneno"})
	@Test(priority = 1)
	public void accDetails(String firname, String lasname, String mailid, String phoneno) {
		
		SignUp su = new SignUp();
		su.userDetails(firname, lasname, mailid, phoneno);
	}
	
	
	@Parameters({"role","pwd"})
	@Test(priority = 2)
	public void usrDetails(String role, String pwd) throws InterruptedException {
		SignUp su = new SignUp();
		su.uDetails(role, pwd);
	}
	
}
