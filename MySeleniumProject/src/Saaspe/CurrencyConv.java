package Saaspe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CurrencyConv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		
			
			driver.get("https://dev-app.saaspe.com/auth/login");
			driver.manage().window().maximize();
	 
			//To perform login operation
			driver.findElement(By.name("emailAddress")).sendKeys("disit59329@unbiex.com");
			//Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("P@ssword-1");
			driver.findElement(By.cssSelector(".ant-btn")).click();
			//Verify the OTP
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[1]")).click();
			driver.findElement(By.xpath("//input[1]")).sendKeys("7") ;
			driver.findElement(By.xpath("//input[2]")).sendKeys("6") ;
			driver.findElement(By.xpath("//input[3]")).sendKeys("5") ;
			driver.findElement(By.xpath("//input[4]")).sendKeys("4") ;
			driver.findElement(By.xpath("//input[5]")).sendKeys("3") ;
			driver.findElement(By.xpath("//input[6]")).sendKeys("2") ;
			driver.findElement(By.cssSelector(".ant-btn")).click();
			//Click On the Administration
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Administration']")).click();
			
			// Click on preference tab
			driver.findElement(By.xpath("//span[text()='Preferences']")).click();
			Thread.sleep(3000);
			
			// Selecting the currency
			WebElement pre = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
			pre.click();
			Actions cu = new Actions(driver);
			cu.sendKeys(pre, "MYR");
			cu.sendKeys(Keys.ENTER);
			cu.perform();
			
			// Click on the Save button
			WebElement save = driver.findElement(By.xpath("//button[@value='Save']"));
			save.click();
			Thread.sleep(3000);
			 if (!save.isEnabled()) {
		            System.out.println("Currency Conversion is successful");
		        } else {
		            System.out.println("Currency conversion is failed");
		        }
			

	}

}
