package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserRole {
	
	WebDriver driver;
	
	// Administrator link
	By admin = By.xpath("//span[text()='Administration']");
	
	// User Management
	By us = By.xpath("//span[text()='User Management']");
	
	// First Name
	By fn = By.name("firstName");
	
	// Last Name
	By ln = By.name("lastName");
	
	// Mail id
	By mid = By.name("userEmail");
	
	// Role
	By role = By.xpath("//span[@class='ant-select-selection-item']");
	
	// Mobile number
	By mn = By.name("userMobileNumber");
	
	// Submit button
	By sb = By.xpath("//span[normalize-space()='Submit']");
	
	
	// Method for the fields
	
	public UserRole(WebDriver driver) {
		
		this.driver= driver;
	}

	public void userManagement() {
		
		driver.findElement(admin).click();
		driver.findElement(us).click();
		driver.findElement(By.cssSelector(".ant-btn-primary")).click();
	}
	
	public void firstName(String first) {
		
		driver.findElement(fn).sendKeys(first);
	}
	
	public void lastName(String last) {
		
		driver.findElement(ln).sendKeys(last);
	}
	
	public void userMail(String umail) {
		
		driver.findElement(mid).sendKeys(umail);
	}
	
	public void userRole() throws InterruptedException {
		
		WebElement dd= driver.findElement(role);
		dd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Approver')]")).click();  // Approver // Super admin
		Thread.sleep(3000);															// Reviewer	
		String role =dd.getText();
		if(role.equalsIgnoreCase("Contributor")) {
			Thread.sleep(3000);
			driver.findElement(mn).sendKeys("8092317658");
		}
	}
	
	public void clickSubmit() {
		
		driver.findElement(sb).click();
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		if (search.isDisplayed()) {
			System.out.println("User creation is success");
		} else {
			System.out.println("User creation is fail");
		}
	}
	
	
	

}
