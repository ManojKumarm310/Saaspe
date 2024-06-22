package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProjectS {
	
	WebDriver driver;
	
	// Department link
	By dlink = By.xpath("//span[text()='Departments']");
	
	// Select Department
	By dept = By.xpath("//*[text()='Voice Process']");
	
	// Project tab
	By project = By.xpath("//div[text()='Projects']");
	
	// Add button
	By ab = By.xpath("(//button[@type='button'])[2]");
	
	// Single radio
	By sr = By.xpath("(//input[@type='radio'])[1]");
	
	// Project code
	By pc = By.name("projectCode");
	
	// Project Description
	By pd = By.name("projectDescription");
	
	// Project Name
	By pname = By.name("projectName");
	
	// Project manager
	By pm = By.xpath("(//span[@class='ant-select-selection-item'])[1]");
	
	// Secondary Manager
	By sm = By.xpath("//span[@title='-- Please Select --']");
	
	// Currency
	By pcu = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
	
	// Budget
	By bud = By.name("budget");
	
	// Start date
	By stdate = By.xpath("(//input[@placeholder='Select date'])[1]");
	
	// End date
	By end = By.xpath("(//input[@placeholder='Select date'])[2]");
	
	// Application
	By appli = By.xpath("(//span[@class='ant-select-selection-item'])[4]");
	
	// Application type
	By atype = By.xpath("(//span[@class='ant-select-selection-item'])[5]");
	
	// Submit
	By psubmit = By.xpath("//button[@type='submit']");
	
	// Methods for the project
	
	public ProjectS(WebDriver driver) {
		
		this.driver=driver;
	}

	public void projectTab() throws InterruptedException {
		
		driver.findElement(dlink).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[text()='Voice Process']")).click(); 
		//driver.findElement(By.xpath("//*[text()='Marketing']")).click();
		driver.findElement(By.xpath("//*[text()='Sales']")).click();
		Thread.sleep(3000);		
		driver.findElement(project).click();
		driver.findElement(ab).click();
		driver.findElement(sr).click();
	}
	
	public void projectCode(String code) {
		
		driver.findElement(pc).sendKeys(code);
	}
	
	public void projectDescription(String des) {
		
		driver.findElement(pd).sendKeys(des);
	}
	
	public void projectName(String name) {
		
		driver.findElement(pname).sendKeys(name);
	}
	
	public void projectManager(String manager) throws InterruptedException {
		
		WebElement pmanager = driver.findElement(pm);
		pmanager.click();
		Thread.sleep(3000);
		Actions pact = new Actions(driver);
		pact.sendKeys(pmanager, manager);
		pact.sendKeys(Keys.ENTER);
		pact.perform();
	}
	
	public void secondaryManager(String sman) {
		
		WebElement smanager = driver.findElement(sm);
		smanager.click();
		Actions sact = new Actions(driver);
		sact.sendKeys(smanager, sman);
		sact.sendKeys(Keys.ENTER);
		sact.perform();
	}
	
	public void pCurrency(String curr) {
		
		WebElement currency = driver.findElement(pcu);
		currency.click();
		Actions cact = new Actions(driver);
		cact.sendKeys(currency, curr);
		cact.sendKeys(Keys.ENTER);
		cact.perform();
	}
	
	public void pBudget(String bu) {
		
		driver.findElement(bud).sendKeys(bu);
	}
	
	public void startDate(String sd) {
		
		WebElement sdate = driver.findElement(stdate);
		sdate.click();
		Actions stact = new Actions(driver);
		stact.sendKeys(sdate, sd);
		stact.sendKeys(Keys.ENTER);
		stact.perform();
	}
	
	public void endDate(String endd) {
		
		WebElement edate = driver.findElement(end);
		edate.click();
		Actions eact = new Actions(driver);
		eact.sendKeys(edate, endd);
		eact.sendKeys(Keys.ENTER);
		eact.perform();
	}
	
	public void selectApplication(String application) throws InterruptedException {
		
		WebElement app = driver.findElement(appli);
		app.click();
		Thread.sleep(300);
		Actions aact = new Actions(driver);
		aact.sendKeys(app, application);
		aact.sendKeys(Keys.ENTER);
		aact.perform();
	}
	
	public void applicationType() throws InterruptedException {
		
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='New']")).click();
	}
	
	public void pSubmit() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement result = driver.findElement(By.xpath("//div[@class='ant-result-icon']"));
		if(result.isDisplayed()) {
			System.out.println("Project Onboarding is Successful");
		}else {
			System.out.println("Project Onboarding is Failed");
		}
	}

}
