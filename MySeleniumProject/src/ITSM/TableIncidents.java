package ITSM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableIncidents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://stardesk-itsm-ui-dev.myairports.com.my/");
		
		// user name
		driver.findElement(By.name("username")).sendKeys("bhanu");
		
		// password
		driver.findElement(By.name("password")).sendKeys("Test@321");
		
		// Submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[text()='Not now']")).click();
		
		// Incidents
		driver.findElement(By.xpath("//img[@aria-label='Incidents']")).click();
		
		driver.findElement(By.partialLinkText("2049")).click();
		
		WebElement dd = driver.findElement(By.xpath("(//input[@role='combobox'])[1]"));
		dd.click();
		
		Actions a = new Actions(driver);
		a.sendKeys(dd, "AD : Unable to login");
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER);
		a.perform();

	}

}
