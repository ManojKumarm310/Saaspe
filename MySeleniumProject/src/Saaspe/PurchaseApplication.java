package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PurchaseApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.name("emailAddress")).sendKeys("manoj.km@mind-graph.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.name("authenticationcode")).sendKeys("969674");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Applications'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		// Entering the application.
		
		WebElement name = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
		name.click();
		Actions nact = new Actions(driver);
		nact.sendKeys(name,"Jira");
		nact.sendKeys(Keys.ENTER);
		nact.perform();
		
		// Entering the Subscription Id
		
		driver.findElement(By.name("application.subscriptionId")).sendKeys("73012");
		
		// Entering the Subscription Name
		
		driver.findElement(By.name("application.subscriptionName")).sendKeys("Jira 0211" );
		
		//Entering the provider name in the field.
		
		driver.findElement(By.name("application.providerName")).sendKeys("Atlasian");
		
		// Selecting the category.
		
		WebElement category = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		category.click();
		Actions cact = new Actions(driver);
		cact.sendKeys(category,"Project Management");
		cact.sendKeys(Keys.ENTER);
		cact.perform();
		
		// Entering the owner mail address.
		
		Thread.sleep(3000);
		WebElement fowner = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
		fowner.click();
		Actions fact = new Actions(driver);
		fact.sendKeys(fowner, "cygeqidu@lyft.live").sendKeys(Keys.ENTER).build().perform();
		//fact.sendKeys(Keys.ENTER);
	//	fact.perform();
		
		// Entering the Project
		
		WebElement project = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]"));
		project.click();
		Actions pact = new Actions(driver);
		pact.sendKeys(project, "Urban cloud");
		pact.sendKeys(Keys.ENTER);
		pact.perform(); 
		
		// Selecting the Contract Type
		
		WebElement ctype = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]"));
		ctype.click();
		Actions atype = new Actions(driver);
		atype.sendKeys(ctype, "Annual");
		atype.sendKeys(Keys.ENTER);
		atype.perform();
		
		// Entering the Contract Name
		
		driver.findElement(By.name("contracts[0].name")).sendKeys("Jira Contract 0211");
		
		// Entering the Contract Tenure
		
		driver.findElement(By.name("contracts[0].contractTenure")).sendKeys("1");
		
		// Entering the Start Date
		
		WebElement sdate = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]"));
		sdate.click();
		Actions adate = new Actions(driver);
		adate.sendKeys(sdate, "02/02/2023");
		adate.sendKeys(Keys.ENTER);
		adate.perform();
		
		// Selecting Billing Frequency
		
		WebElement bill = driver.findElement(By.id("rc_select_9"));
		bill.click();
		Actions abill = new Actions(driver);
		abill.sendKeys(bill, "Monthly");
		abill.sendKeys(Keys.ENTER);
		abill.perform();
		
	/*	// Clicking the auto renewal
		
		driver.findElement(By.xpath("//div[@class='ant-switch-handle']")).click();
		
		// Selecting the Cancellation Notice
		
		driver.findElement(By.name("contracts[0].autoRenewalCancellation")).sendKeys("30");
		
		// Selecting the Renewal Date
		
		driver.findElement(By.xpath("(//input[@placeholder='Select date'])[3]")).sendKeys("02/02/2024");
		
		// Selecting the Payment Method
		
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[7]")).click();
		Thread.sleep(2000);
		String met = "credit/Debit card";
		List<WebElement> pay = driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])[2]")).findElements(By.tagName("div"));
		for (WebElement payment : pay) {
			String p = payment.getText();
			if (p.equalsIgnoreCase(met)) {
				payment.click();
			}
			
		} */
		
		
		
		// Selecting the Currency
		
		WebElement currency = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[7]"));
		currency.click();
		Actions cuact = new Actions(driver);
		cuact.sendKeys(currency, "USD");
		cuact.sendKeys(Keys.ENTER);
		cuact.perform(); 
		
		// Entering the product name
		
		driver.findElement(By.name("contracts[0].products[0].productName")).sendKeys("Standard");
		
		// Entering the product type
		
		WebElement ptype = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[8]"));
		ptype.click();
		Actions ptact = new Actions(driver);
		ptact.sendKeys(ptype, "License");
		ptact.sendKeys(Keys.ENTER);
		ptact.build().perform();
		
		
		
	}

}
