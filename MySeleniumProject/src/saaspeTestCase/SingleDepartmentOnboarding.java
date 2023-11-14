package saaspeTestCase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import Saaspe.Department;
import reusableMethodsLibrary.Department;
import uttils.appUtils;


public class SingleDepartmentOnboarding extends Department{
	
	@Parameters({ "uname","pwd"} )
	@Test(priority = 0)
	public void test1(String uname, String pwd) throws Throwable
	{
		
		
		
		Department dp = new Department();
		dp.login(uname,pwd);
		
		
	}	
	
	@Parameters({"deptname","budget","bcurrency"})
	@Test(priority = 1)
	public void test2(String deptname, String budget, String bcurrency)
	{
		
		Department dp = new Department();
		dp.departmentDetails(deptname, budget, bcurrency);
	}
	
	
	@Parameters({"fownermail","fownername"})
	@Test(priority = 2)
	public void test3(String fownermail, String fownername)
	{
		Department dp = new Department();
		dp.ownerDetails(fownermail,fownername);
		
		
	}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		


}