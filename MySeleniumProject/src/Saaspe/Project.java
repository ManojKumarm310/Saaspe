package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		driver.findElement(By.name("emailAddress")).sendKeys("rishi.p@mind-graph.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Departments']")).click();
		//driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(4000);
		
//		WebElement dtable = driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']"));
//		String dname = "BPO";
//		List<WebElement> rows = dtable.findElements(By.tagName("tr"));
//		for (int i = 1; i < rows.size(); i++) {
//			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
//			for (WebElement dep : cols) {
//				 String a = dep.getText();
//				 if (a.equalsIgnoreCase(dname)) {
//					dep.click();
//					break;
//				}
//			}
//		 String DeptNeeded = "BPO";
		
		//driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("IT");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Voice Process']")).click(); 
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//div[text()='Projects']")).click();
		
		// Click on the Add button
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		// Click on the Single Radio Button.
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		// Entering the Project Code
		
		driver.findElement(By.name("projectCode")).sendKeys("PC-9430");
		
		// Enter the Project Description
		
		driver.findElement(By.name("projectDescription")).sendKeys("New Project Requirements");
		
		// Entering the project Name
		
		driver.findElement(By.name("projectName")).sendKeys("Payment Gateway System");
		
		// Entering the project Manager
		
		WebElement pmanager = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
		pmanager.click();
		Actions pact = new Actions(driver);
		pact.sendKeys(pmanager, "megamo@afia.pro");
		pact.sendKeys(Keys.ENTER);
		pact.perform();
		
		// Selecting the secondary owner mail address.
		
	/*	WebElement smanager = driver.findElement(By.xpath("//span[@title='-- Please Select --']"));
		smanager.click();
		Actions sact = new Actions(driver);
		sact.sendKeys(smanager, "megamo@afia.pro");
		sact.sendKeys(Keys.ENTER);
		sact.perform(); */
		
		// Selecting the currency
		
		WebElement currency = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
		currency.click();
		Actions cact = new Actions(driver);
		cact.sendKeys(currency, "AUD");
		cact.sendKeys(Keys.ENTER);
		cact.perform();
		
		// Entering the Budget
		
		driver.findElement(By.name("budget")).sendKeys("10000");
		
		// Entering the Project Start Date.
		
		WebElement sdate = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]"));
		sdate.click();
		Actions stact = new Actions(driver);
		stact.sendKeys(sdate, "15/05/2023");
		stact.sendKeys(Keys.ENTER);
		stact.perform();
		
		// Entering the project End Date.
		
		WebElement edate = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[2]"));
		edate.click();
		Actions eact = new Actions(driver);
		eact.sendKeys(edate, "14/05/2024");
		eact.sendKeys(Keys.ENTER);
		eact.perform();
		
		// Selecting the Application
		
		WebElement app = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
		app.click();
		Actions aact = new Actions(driver);
		aact.sendKeys(app, "Freshbooks");
		aact.sendKeys(Keys.ENTER);
		aact.perform();
		
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		Thread.sleep(2000);
	/*	List<WebElement> type =driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder']")).findElements(By.tagName("div"));
		
		for (WebElement atype : type) {
			 String atext = atype.getText();
			 if (atext.equalsIgnoreCase("new")) {
				atype.click();
				break;
			}
		} */
		
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='New']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	
		

     
		
		
		
		
		
     }
	}
		
		
		
	        
	        

	


