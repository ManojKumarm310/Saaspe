package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BudgetCre {
	
	WebDriver driver;
	
	// Multicloud button
	By mc = By.xpath("//span[normalize-space()='Multicloud']");
	
	// Budget and forecast
	By budget = By.xpath("//span[normalize-space()='Budget & Forecast']");
	
	// Add button
	By addb = By.cssSelector(".ant-btn-primary");
	
	// Budget name
	By bname = By.xpath("//input[@name='budgetName']");
	
	// Reset period
	By rp = By.xpath("//span[@class='ant-select-selection-item']");
	
	// Start date
	By start = By.xpath("(//input[@placeholder='Select date'])[1]");
	
	// End date
	By enddate = By.xpath("(//input[@placeholder='Select date'])[2]");
	
	// Budget amount 
	By ba = By.xpath("//input[@name='budgetAmount']");
	
	// Next button
	By bnext = By.xpath("//span[normalize-space()='Next']");
	
	// Alert type
	By at = By.cssSelector(".ant-select-selection-item");
	
	// Threshold
	By th = By.xpath("//input[@name='alerts[0].threshold']");
	
	// Mail id
	By mail = By.xpath("//input[@name='emailAddress']");
	
	// Alert next button
	By anext = By.cssSelector(".ant-btn.ant-btn-primary");
	
	// Submit button
	By submit = By.xpath("//span[normalize-space()='Submit']");
	
	// Methods for the budget creation
	
	public BudgetCre(WebDriver driver) {
		this.driver = driver;
	}

	public void multicloud() throws InterruptedException {
		
		Thread.sleep(9000);
		driver.findElement(mc).click();
		//Click On Budget And Forecast
		Thread.sleep(2000);
		driver.findElement(budget).click();	
	    //Click On Add Button
		driver.findElement(addb).click();
	}
	
	public void budgetName(String name) {
		
		WebElement nameInput = driver.findElement(bname);
		nameInput.sendKeys(name);
	}

	
	public void resetPeriod() throws InterruptedException {
		
		driver.findElement(rp).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(text(),'Quarterly')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Billing Year')]")).click();
	}
	
	public void budgetStartDate(String sdate) {
		
		WebElement bsd = driver.findElement(start);
		bsd.click();
		Actions asd = new Actions(driver);
		asd.sendKeys(bsd, sdate);
		asd.sendKeys(Keys.ENTER);
		asd.perform();
	}
	
	public void budgetEndDate(String edate) {
		
		WebElement end = driver.findElement(enddate);
		end.click();
		Actions aed = new Actions(driver);
		aed.sendKeys(end, edate);
		aed.sendKeys(Keys.ENTER);
		aed.perform();
	}
	
	public void budgetAmount(String bamount) {
		
		WebElement name1Input = driver.findElement(ba);
		name1Input.sendKeys(bamount);
		driver.findElement(bnext).click();
	}
	
	public void alertType() throws InterruptedException {
		
		driver.findElement(By.cssSelector(".ant-select-selection-item")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("div[title='Actual'] div[class='ant-select-item-option-content']")).click();
	}
	
	public void threshold(String thre) {
		
		 WebElement setInput = driver.findElement(th);
		 setInput.sendKeys(thre);
	}
	
	public void emailAddress(String mid) {
		
		driver.findElement(mail).sendKeys(mid);
		driver.findElement(anext).click();
	}
	
	public void clickSubmit() {
		
		driver.findElement(submit).click();
	}
	
	
	
	
	
	
	
	
}
