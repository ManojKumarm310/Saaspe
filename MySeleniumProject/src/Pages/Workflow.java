package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Workflow {
	
	WebDriver driver;
	
	public Workflow(WebDriver driver) {
		this.driver = driver;
	}
	
	// Workflow button
	By wf = By.xpath("//span[text()='Workflows']");
	
	// Create workflow button
	By wb = By.xpath("(//button[@type='button'])[2]");
	
	// Selecting the application
	By application = By.xpath("//span[@class='ant-select-selection-item']");
	
	// Radio button
	By radio = By.xpath("//input[@value='91']");
	
	// Subject field
	By sub = By.name("subject");
	
	// Message field
	By message = By.name("message");
	
	// Submit button
	By subm = By.xpath("//button[@type='submit']");
	
	// Methods for the workflow
	
	public void workflow() {
		driver.findElement(wf).click();
		driver.findElement(wb).click();
	}

	public void selectApplication() throws InterruptedException {
		WebElement rd = driver.findElement(application);
		rd.click();
		Thread.sleep(12000);
		
		Actions aa = new Actions(driver);
		aa.sendKeys(rd, "JIRA (Finance)");	
		aa.sendKeys(Keys.ENTER);
		aa.perform();
	}
	
	public void dateRange() {
		driver.findElement(radio).click(); 
	}
	
	public void enterSubject(String s) {
		driver.findElement(sub).sendKeys(s);
	}
	
	public void enterMessage(String m) {
		driver.findElement(message).sendKeys(m);
	}
	
	public void clickSubmit() {
		WebElement submit = driver.findElement(subm);
		
		
		if(submit.isEnabled()) {
			submit.click();
		}else
		{
			System.out.println("Submit button is disabled");
		} 
		
		WebElement success = driver.findElement(By.xpath("//div[@class='ant-result-icon']"));
		if (success.isDisplayed()) {
			System.out.println("Test Case is Passed");
		}

	}
}
