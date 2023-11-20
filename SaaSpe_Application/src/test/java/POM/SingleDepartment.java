package POM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleDepartment {
	
	WebDriver driver; 
	
	public SingleDepartment(WebDriver driver) {
		
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}

	By dep = By.xpath("//span[text()='Departments']");
	
	// Click on the add button
	By add = By.xpath("(//button[@type='button'])[2]");
	
	// Click on the Single radio button
	By singleRadio = By.xpath("//input[@class='ant-radio-input']");
	
	// Click on the department name
	By dname = By.name("departmentName");
	
	// Click on the department budget
	By dbudget = By.name("budget");
	
	// Click on the department currency
	By deptcurrency = By.xpath("//span[@class='ant-select-selection-item']");
	
	// Click on the first owner mail
	By fowner = By.name("ownerEmailAddress");
	
	// Click on the first owner name
	By fname = By.name("ownerName");
	
	// Click on the submit button
	By dsubmit = By.xpath("//button[@type='submit']");

/*	// Department from side menu
	@FindBy (xpath = "//span[text()='Departments']" )
	WebElement dep;
	
	// Clicking on the Add button
	@FindBy (xpath = "(//button[@type='button'])[2]")
	WebElement add;
	
	// Clicking on the radio button
	@FindBy (xpath ="//input[@class='ant-radio-input']")
	WebElement single;
	
	// Department name
	@FindBy (name = "departmentName")
	WebElement dname;
	
	// Budget
	@FindBy (name = "budget")
	WebElement dbudget;
	
	// Currency
	@FindBy (xpath = "//span[@class='ant-select-selection-item']")
	WebElement currency;
	
	// Owner Mail address
	@FindBy (name = "ownerEmailAddress")
	WebElement fowner;
	
	// Owner Name
	@FindBy (name ="ownerName")
	WebElement fname;
	
	// Submit button
	@FindBy (xpath = "//button[@type='submit']")
	WebElement sbutton; */
	
	// Creating Method for the webelements
	
	
	
	public void department() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.findElement(dep).click();
	}
	
	public void addButton() {
		
		driver.findElement(add).click();
	}
	
	public void singleRadio() {
		
		driver.findElement(singleRadio).click();
	}
	
	public void departmentName(String deptname) {
		
		driver.findElement(dname).sendKeys(deptname);
	}
	
	public void departmentBudget(String budget) {
		
		driver.findElement(dbudget).sendKeys(budget);
	}
	
	 
	  public void departmentCurrency(String bcurrency) {
	 
		  WebElement currency = driver.findElement(deptcurrency);
			currency.click();
			Actions cact = new Actions(driver);
			cact.sendKeys(currency, bcurrency);
			cact.sendKeys(Keys.ENTER);
			cact.perform();
		
	
	} 
	
	public void firstOwnerMail(String fmail) {
		
		driver.findElement(fowner).sendKeys(fmail);
	}
	
	public void firstOwnerName(String firstname) {
		
		driver.findElement(fname).sendKeys(firstname);
	}
	
	public void deptSubmit() {
		
		driver.findElement(dsubmit).click();
	}
	
}
