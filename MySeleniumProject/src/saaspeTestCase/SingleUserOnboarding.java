package saaspeTestCase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reusableMethodsLibrary.SingleUser;
import uttils.appUtils;

public class SingleUserOnboarding extends SingleUser  {

	//public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
	
/*@Test	
public void userTest() throws InterruptedException {
		
		
		SingleUser user = new SingleUser();
		user.appLogin("rishi.p@mind-graph.com", "P@ssword-1");
		user.userDetails("Neptuno", "Rahul", "xiwonequ@lyft.live","Kishore", "HR");
		user.userType( "13/03/2023", "Permanent", "Team Lead", "Male", "9622137954"); 
		} */
	
	@Parameters({"uname","pwd"})
	@Test(priority = 1)
	public void userTest1(String uname, String pwd) throws InterruptedException {
		
		SingleUser user = new SingleUser();
		user.appLogin(uname, pwd);
	}	
	
	@Parameters({"fname","lname","mail","rmanager","dept"})
	@Test(priority = 2)
	public void userTest2(String fname, String lname, String mail,String rmanager, String dept) throws InterruptedException
	{
		
		SingleUser user = new SingleUser();
		user.userDetails(fname, lname, mail, rmanager, dept);
		
	}
	
	@Parameters({"jdate","etype","role","se","pno"})
	@Test(priority = 3)
	public void userTest3(String jdate,String etype,String role,String se,String pno) throws InterruptedException {

		SingleUser user = new SingleUser();
		user.userType(jdate, etype, role, se, pno);
	
	}	 
}

