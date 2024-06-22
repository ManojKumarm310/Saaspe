package reusableMethodsLibrary;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

import Pages.LoginPage;
import uttils.appUtils;

public class Login extends appUtils {

	LoginPage lop;
	
	@Test(dataProvider = "logindata")
	public void userLogin(String un, String passw) {
		
		lop = new LoginPage(driver);
		
		lop.userMail(un);
		lop.userPassword(passw);
		lop.loginButton();
		lop.enterOtp();
		lop.otpButton();
		//driver.close();
	}
	
	@DataProvider(name = "logindata")
	public Object[][] loginData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "rishi.p@mind-graph.com";
		data[0][1] = "P@ssword-1";
		
		data[1][0] = "rishi.p@mind-graph.com";
		data[1][1] = "P@ssword-12";
		
		return data;
		
	}
	
}
