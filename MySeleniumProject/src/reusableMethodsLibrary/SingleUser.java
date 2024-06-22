package reusableMethodsLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uttils.appUtils;

public class SingleUser extends appUtils {
	
	//WebDriverWait wait = new WebDriverWait(driver, 30);

	public void appLogin(String username, String password) throws InterruptedException
	{
	driver.findElement(By.name("emailAddress")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
	driver.findElement(By.xpath("//input[2]")).sendKeys("3");
	driver.findElement(By.xpath("//input[3]")).sendKeys("3");
	driver.findElement(By.xpath("//input[4]")).sendKeys("3");
	driver.findElement(By.xpath("//input[5]")).sendKeys("3");
	driver.findElement(By.xpath("//input[6]")).sendKeys("3");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath("//span[text()='Users']")).click();
	Thread.sleep(3000);
    driver.findElement(By.xpath("//div[text()='Add']")).click();
    driver.findElement(By.xpath("//input[@class='ant-radio-input']")).click();
    Thread.sleep(4000);
    
	}
	
	public void userDetails(String fname, String lname, String mail,String rmanager, String dept) throws InterruptedException
	{
		driver.findElement(By.name("userFirstName")).sendKeys(fname);
        driver.findElement(By.name("userLastName")).sendKeys(lname);
        driver.findElement(By.name("userEmailAddress")).sendKeys(mail);
        //driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
       // Thread.sleep(2000);
        WebElement man = driver.findElement(By.name("userReportingManager"));
		man.click();
		man.sendKeys(rmanager);
		
		// Selecting the Department
		WebElement d= driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
		d.click();
		Actions dclick = new Actions(driver);
		dclick.sendKeys(d, dept);
		dclick.sendKeys(Keys.ENTER);
		dclick.perform();
       
	}
	
	public void userType(String jdate,String etype,String role,String se,String pno) throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("userReportingManager")));
		System.out.println("Inside the function name.");
		Thread.sleep(3000);
		//WebElement man = driver.findElement(By.name("userReportingManager"));
		//man.click();
		//Thread.sleep(2000);
		//man.sendKeys(rmanager);
		 // Joining Date
		 WebElement date = driver.findElement(By.xpath("//input[@placeholder='Select date']"));
	        date.click();
	        Actions jact = new Actions(driver);
	        jact.sendKeys(date,jdate);
	        jact.sendKeys(Keys.ENTER);
	        jact.perform();
	     
	     
	  // selecting the Employment type.
	        WebElement type = driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]"));
	        type.click();
	        Thread.sleep(3000);
	        Actions act = new Actions(driver);
	        act.sendKeys(type, etype);
	        act.sendKeys(Keys.ENTER);
	        act.perform();
	        
	   //Selecting the designation.
	        
	        WebElement designation = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
	        designation.click();
	        Actions desi = new Actions(driver);
	        desi.sendKeys(designation, role);
	        desi.sendKeys(Keys.ENTER);
	        desi.perform();
	        
	     // Selecting the Gender.
	        WebElement gender = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
	        gender.click();
	        Actions gen = new Actions(driver);
	        gen.sendKeys(gender, se);
	        gen.sendKeys(Keys.ENTER);
	        gen.perform();
	        
	      // Entering the mobile number
	        driver.findElement(By.name("userMobileNumber")).sendKeys(pno);
	        
	     // Click on the submit button
	        
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        WebElement result = driver.findElement(By.xpath("//div[@class='ant-result-icon']"));
	        
	        if(result.isDisplayed()) {
	        	System.out.println("User onboarding is successful");
	        }else {
	        	System.out.println("User onboarding is failed");
	        }
	        
	
	
	
	}	
}
