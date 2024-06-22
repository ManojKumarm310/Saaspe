package ECommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		// Click on the My account 
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		// click on register button
		driver.findElement(By.linkText("Register")).click();
		
		// first name
		driver.findElement(By.id("input-firstname")).sendKeys("Ashok");
		
		// Last name
		driver.findElement(By.id("input-lastname")).sendKeys("Kumar");
		
		// Mail
		driver.findElement(By.id("input-email")).sendKeys("mmanojmk94@gmail.com");
		
		// phone no
		driver.findElement(By.id("input-telephone")).sendKeys("9935416872");
		
		// password
		driver.findElement(By.id("input-password")).sendKeys("Pass@123");
		
		// confirm password
		driver.findElement(By.id("input-confirm")).sendKeys("Pass@123");
		
		// check box
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		// Continue
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
			
			

	}

}
