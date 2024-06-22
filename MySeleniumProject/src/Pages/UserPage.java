package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserPage {
	
	WebDriver driver;
	
	// user link
		By ulink = By.xpath("//span[text()='Users']");
		
		// Add button
		By uadd = By.xpath("//div[text()='Add']");
		
		// Radio button
		By sradio = By.xpath("//input[@class='ant-radio-input']");
		
		// First name
		By fname = By.name("userFirstName");
		
		// Last name
		By lname = By.name("userLastName");
		
		// Mail address
		By umail = By.name("userEmailAddress");
		
		// Date
		By join = By.xpath("//input[@placeholder='Select date']");
		
		// Department
		By dept = By.xpath("(//span[@class='ant-select-selection-item'])[1]");
		
		// Reporting Manager
		By manager = By.name("userReportingManager");
		
		// Mobile number
		By mobile = By.name("userMobileNumber");
		
		// Employment type
		By etype = By.xpath("(//div[@class='ant-select-selector'])[2]");
		
		// Designation
		By role = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
		
		// Gender
		By gen = By.xpath("(//span[@class='ant-select-selection-item'])[4]");
		
		// Submit
		By usubmit = By.xpath("//button[@type='submit']");
		
		// Methods for the user onboarding
		
		

		public UserPage(WebDriver driver) {
			
			this.driver = driver;
		}

		public void userAdd() throws InterruptedException {
			
			Thread.sleep(9000);
			driver.findElement(ulink).click();
	        driver.findElement(uadd).click();
	        driver.findElement(sradio).click();
	        Thread.sleep(4000);
		}
		
		public void firstName(String first) {
			
			 driver.findElement(fname).sendKeys(first);
		}
		
		public void lastName(String last) {
			
			driver.findElement(lname).sendKeys(last);
		}
		
		public void mailAddress(String mail) {
			
			driver.findElement(umail).sendKeys(mail);
		}
		
		public void department(String dep) {
			
			 WebElement d= driver.findElement(dept);
				d.click();
				Actions dclick = new Actions(driver);
				dclick.sendKeys(d, dep);
				dclick.sendKeys(Keys.ENTER);
				dclick.perform();
		}
		
		public void reportingManager(String rman) {
			
			driver.findElement(manager).sendKeys(rman);
		}
		
		public void joiningDate(String jdate) {
			
			 WebElement date = driver.findElement(join);
		        date.click();
		        Actions jact = new Actions(driver);
		        jact.sendKeys(date,jdate);
		        jact.sendKeys(Keys.ENTER);
		        jact.perform();
		}
		
		public void employmentType(String emtype) throws InterruptedException {
			
			WebElement type = driver.findElement(etype);
	        type.click();
	        Thread.sleep(3000);
	        Actions act = new Actions(driver);
	        act.sendKeys(type, emtype);
	        act.sendKeys(Keys.ENTER);
	        act.perform();
		}

		public void designation(String de) {
			
			 WebElement designation = driver.findElement(role);
		        designation.click();
		        Actions desi = new Actions(driver);
		        desi.sendKeys(designation, de);
		        desi.sendKeys(Keys.ENTER);
		        desi.perform();
		}
		
		public void gender(String s) {
			
			WebElement gender = driver.findElement(gen);
	        gender.click();
	        Actions gen = new Actions(driver);
	        gen.sendKeys(gender, s);
	        gen.sendKeys(Keys.ENTER);
	        gen.perform();
		}
		
		public void phoneNumber(String no) {
			
			 driver.findElement(mobile).sendKeys(no);
		}
		
		public void userSubmit() {
			
			driver.findElement(usubmit).click();
	        
	        WebElement result = driver.findElement(By.xpath("//div[@class='ant-result-icon']"));
	        
	        if(result.isDisplayed()) {
	        	System.out.println("User onboarding is successful");
	        }else {
	        	System.out.println("User onboarding is failed");
	        }
		}

}
