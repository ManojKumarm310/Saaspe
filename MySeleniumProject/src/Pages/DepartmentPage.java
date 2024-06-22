package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DepartmentPage {
	
	WebDriver driver;
	
	// Department link
		By dept = By.xpath("//span[text()='Departments']");
		
		// Add button
		By dadd = By.xpath("(//button[@type='button'])[2]");
		
		// Single radio
		By sr = By.xpath("//input[@class='ant-radio-input']");
		
		// Department name
		By dn = By.name("departmentName");
		
		// Budget
		By budget = By.name("budget");
		
		// Currency
		By cur = By.xpath("//span[@class='ant-select-selection-item']");
		
		// Owner mail address
		By fowner = By.name("ownerEmailAddress");
		
		// Owner name
		By fname = By.name("ownerName");
		
		// Submit button
		By dsubmit = By.xpath("//button[@type='submit']");
		
		
		// Methods for the department
		
		

		public DepartmentPage(WebDriver driver) {
			
			this.driver = driver;
		}

		public void departmentAdd() {
			
			driver.findElement(dept).click();
			driver.findElement(dadd).click();
			driver.findElement(sr).click();
		}
		
		public void departmentName(String name) {
			
			driver.findElement(dn).sendKeys(name);
		}
		
		public void departmentBudget(String bud) {
			
			driver.findElement(budget).sendKeys(bud);
		}
		
		public void departmentCurrency(String c) {
			
			WebElement currency = driver.findElement(cur);
			currency.click();
			Actions cact = new Actions(driver);
			cact.sendKeys(currency, c);
			cact.sendKeys(Keys.ENTER);
			cact.perform();
		}
		
		public void ownerMail(String owner) {
			
			driver.findElement(fowner).sendKeys(owner);
		}
		
		public void ownerName(String name) {
			
			driver.findElement(fname).sendKeys(name);
		}
		
		public void deptSubmit() {
			
			driver.findElement(dsubmit).click();
			
			//String result ="Your onboarding request is submitted successfully. To view the status of your request, use the  ";
			
			WebElement success = driver.findElement(By.xpath("//div[@class='ant-result ant-result-success']"));
			if(success.isDisplayed()) {
			try {
				//if(success.isDisplayed()) {
					System.out.println("Department Onboarding is successful");
				
			} catch (Exception e) {
				System.out.println("Department Onboarding is failed");
			}
		}

		}

}
