package Saaspe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PurchasedApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		
		
		driver.findElement(By.name("emailAddress")).sendKeys("xyzycuse@socam.me");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//span[text()='Applications'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		// Single radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		// Application
		WebElement app = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
		app.click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.sendKeys(app, "Freshbooks");
		a.sendKeys(Keys.ENTER);
		a.perform();
		
		// Subscription Id
		driver.findElement(By.name("application.subscriptionId")).sendKeys("6174");
		
		// Subscription Name
		driver.findElement(By.name("application.subscriptionName")).sendKeys("Fsub 1312");
		
		// Category
		WebElement ca = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		ca.click();
		Thread.sleep(1000);
		Actions cact = new Actions(driver);
		cact.sendKeys(ca, "Project Management");
		cact.sendKeys(Keys.ENTER);
		cact.perform();
		
		// Owner mail address
		WebElement om = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
		om.click();
		Thread.sleep(9000);
		Actions oa = new Actions(driver);
		oa.sendKeys(om, "lumasofy@lyft.live");
		oa.sendKeys(Keys.ENTER);
		oa.perform(); 
		// driver.findElement(By.xpath("//div[text()='lumasofy@lyft.live']")).click();
		
		// Provider name
		driver.findElement(By.name("application.providerName")).sendKeys("Freshbooks");
		
		// Project Name
		WebElement proj = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]"));
		proj.click();
		Thread.sleep(2000);
		Actions pa = new Actions(driver);
		pa.sendKeys(proj, "Tungston");
		pa.sendKeys(Keys.ENTER);
		pa.perform();
		
		// Contract type
		WebElement con = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]"));
		con.click();
		Thread.sleep(1000);
		Actions can = new Actions(driver);
		can.sendKeys(con, "Annual");
		can.sendKeys(Keys.ENTER);
		can.perform();
		
		// Contract Name
		driver.findElement(By.name("contracts[0].name")).sendKeys("Fcon 1312");
		
		// Contract tenure
		driver.findElement(By.name("contracts[0].contractTenure")).sendKeys("1");
		
		// Start date
		WebElement start = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]"));
		start.click();
		Actions sd = new Actions(driver);
		sd.sendKeys(start, "22/07/2023");
		sd.sendKeys(Keys.ENTER);
		sd.perform();
		
		// Billing Frequency
		WebElement bill = driver.findElement(By.id("rc_select_9"));
		bill.click();
		Actions ba = new Actions(driver);
		ba.sendKeys(bill, "OneTime");
		ba.sendKeys(Keys.ENTER);
		ba.perform();
		
		// Currency
		WebElement currency = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[8]"));
		currency.click();
		Actions curr = new Actions(driver);
		curr.sendKeys(currency, "MYR");
		curr.sendKeys(Keys.ENTER);
		curr.perform();  
		
		// Product Name
		driver.findElement(By.name("contracts[0].products[0].productName")).sendKeys("Standard");
		
		// product type
		
		WebElement pt = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[9]"));
		pt.click();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Licenses']")).click();
		
			
		// Unit price
		
		WebElement unit = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		unit.sendKeys("300");
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[10]")).click();
		driver.findElement(By.xpath("//div[@title='per year']")).click(); 
		
		// Quantity
		
		driver.findElement(By.name("contracts[0].products[0].quantity")).sendKeys("10");
		
		// Next button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
	}

}
