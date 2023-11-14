package POM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SingleDepartment {
	
	WebDriver driver = new ChromeDriver();
	
	// Entering the Username
	@FindBy (name = "emailAddress")
	WebElement uname;
	
	// Entering the password
	@FindBy (name = "password")
	WebElement pwd;
	
	// Click on the login button
	@FindBy (xpath = "//button[@type='submit']")
	WebElement login;

	// Department from side menu
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
	WebElement dcurrency;
	
	// Owner Mail address
	@FindBy (name = "ownerEmailAddress")
	WebElement fowner;
	
	// Owner Name
	@FindBy (name ="ownerName")
	WebElement fname;
	
	// Submit button
	@FindBy (xpath = "//button[@type='submit']")
	WebElement sbutton;
	
	// Creating Method for the webelements
	
	public void username(String uid) {
		
		uname.sendKeys(uid);
	}
	
	public void password(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void clickLogin() {
		
		login.click();
	}
	
	public void department() throws InterruptedException {
		
		Thread.sleep(8000);
		dep.click();
	}
	
	public void addButton() {
		
		add.click();
	}
	
	public void singleRadio() {
		
		single.click();
	}
	
	public void departmentName(String deptname) {
		
		dname.sendKeys(deptname);
	}
	
	public void departmentBudget(String budget) {
		
		dbudget.sendKeys(budget);
	}
	
	/* 
	 * public void departmentCurrency(String bcurrency) {
		
		dcurrency.click();
		//driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
		List<WebElement> currency = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		for (WebElement curr : currency) {
			String a = curr.getText();
			if (a.equalsIgnoreCase(bcurrency)) {
				curr.click();
				break;
			}
		}
	} */
	
	public void firstOwnerMail(String fmail) {
		
		fowner.sendKeys(fmail);	
	}
	
	public void firstOwnerName(String firstname) {
		
		fname.sendKeys(firstname);
	}
	
	public void deptSubmit() {
		
		sbutton.click();
	}
	
}
