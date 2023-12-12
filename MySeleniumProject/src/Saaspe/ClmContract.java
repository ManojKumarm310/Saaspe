package Saaspe;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClmContract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://dev-app.saaspe.com/auth/login");
			
			
			driver.findElement(By.name("emailAddress")).sendKeys("rishi.p@mind-graph.com");
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
			
			// Click on the CLM
			driver.findElement(By.xpath("//span[text()='CLM']")).click();
			
			// Click on the Contract
			driver.findElement(By.xpath("(//span[text()='Contracts'])[2]")).click();
			
			// Click on the Add button
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			
			// Select Template
			WebElement tem = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
			tem.click();
			Actions atem = new Actions(driver);
			atem.sendKeys(tem, "FreshBooks_Template 321");
			atem.sendKeys(Keys.ENTER);
			atem.perform();
			
			// Contract Name
			Thread.sleep(5000);
			driver.findElement(By.name("contractName")).sendKeys("Freshbook Contract 1112");
			
			// Contract Start date
			WebElement csd = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]"));
			csd.click();
			Actions sact = new Actions(driver);
			sact.sendKeys(csd, "06/07/2023");
			sact.sendKeys(Keys.ENTER);
			sact.perform();
			
			// Contract End date
			WebElement ced = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[2]"));
			ced.click();
			Actions ea = new Actions(driver);
			ea.sendKeys(ced, "05/07/2024");
			ea.sendKeys(Keys.ENTER);
			ea.perform();
			
			// Renewal remainder notification
			driver.findElement(By.name("renewalReminderNotification")).sendKeys("30");
			
			// Next button
			driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
			
			// Next button in the document page
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			// Next button in signer page
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
			
			// Watchers Name
			driver.findElement(By.name("watchers[0].name")).sendKeys("Sathick");
			
			// Watchers Mail id
			driver.findElement(By.name("watchers[0].email")).sendKeys("sathik.b@mind-graph.com");
			
			// Next button in watchers page
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
			
			// Submit button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
			
	}

}
