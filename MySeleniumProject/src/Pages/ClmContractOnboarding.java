package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClmContractOnboarding {
	
	WebDriver driver;
	
/*	public ClmContractOnboarding(WebDriver driver) {
		
		this.driver = driver;
	} */
	 
	// Clm
	By clm = By.xpath("//span[text()='CLM']");
	
	// Clm contract
	By contract = By.xpath("(//span[text()='Contracts'])[2]");
	
	// Add button
	By cadd = By.xpath("(//button[@type='button'])[2]");

	// Template
	By template = By.xpath("(//span[@class='ant-select-selection-item'])[1]");
	
	//Contract Name
	By cname = By.name("contractName");
	
	// start date
	By sda = By.xpath("(//input[@placeholder='Select date'])[1]");
	
	// End date
	By eda = By.xpath("(//input[@placeholder='Select date'])[2]");
	
	// Renewal Remainder
	By rr = By.name("renewalReminderNotification");
	
	// Clm page Next button
	By cnext = By.xpath("(//button[@type='button'])[3]");
	
	// Next button in document page
	By dnext = By.xpath("//span[text()='Next']");
	
	// Next button in Signer Page
	By snext = By.xpath("(//button[@type='button'])[6]");
	
	// Watcher Name
	By wname = By.name("watchers[0].name");
	
	// Watcher mail
	By wmail = By.name("watchers[0].email");
	
	// Watcher Next button
	By wnext = By.xpath("(//button[@type='button'])[5]");
	
	// Submit Button
	By sub = By.xpath("//button[@type='submit']");
	
	// Creating Method
	
	public ClmContractOnboarding(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public void clmPage() {
		
		driver.findElement(clm).click();
		driver.findElement(contract).click();
		driver.findElement(cadd).click();
		
	}
	
	public void selectTemplate(String t) {
		
		WebElement tem = driver.findElement(template);
		tem.click();
		Actions atem = new Actions(driver);
		atem.sendKeys(tem, t);
		atem.sendKeys(Keys.ENTER);
		atem.perform();
	}
	
	public void contractName(String cn) throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(cname).sendKeys(cn);
	}
	
	public void startDate(String sd) {
		
		WebElement csd = driver.findElement(sda);
		csd.click();
		Actions sact = new Actions(driver);
		sact.sendKeys(csd, sd);
		sact.sendKeys(Keys.ENTER);
		sact.perform();
	}
	
	public void endDate(String ed) {
		WebElement ced = driver.findElement(eda);
		ced.click();
		Actions ea = new Actions(driver);
		ea.sendKeys(ced, ed);
		ea.sendKeys(Keys.ENTER);
		ea.perform();

	}
	
	public void renewalRemainder(String rrn) {
		
		driver.findElement(rr).sendKeys(rrn);
		driver.findElement(cnext).click();
	}
	
	public void documentNextButton() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(dnext).click();
		
	}
	
	public void signerNextButton() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(snext).click();
	}
	
	public void watcherName(String wn) {
		
		driver.findElement(wname).sendKeys(wn);
	}
	
	public void watcherMail(String wm) throws InterruptedException {
		
		driver.findElement(wmail).sendKeys(wm);
		Thread.sleep(3000);
		driver.findElement(wnext).click();
	}
	
	public void submitButton() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(sub).click();
	}
	
	
}
