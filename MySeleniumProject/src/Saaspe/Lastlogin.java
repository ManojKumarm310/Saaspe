package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lastlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		
		
		driver.findElement(By.name("emailAddress")).sendKeys("nagarjuna.s@mind-graph.com");
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
		
		// Click on the Workflow
		driver.findElement(By.xpath("//span[text()='Workflows']")).click();
		
		// Create Workflow
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		// Selecting the application
		WebElement rd = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
		rd.click();
		Thread.sleep(5000);
		
		Actions aa = new Actions(driver);
		aa.sendKeys(rd, "JIRA (Finance)");	
		aa.sendKeys(Keys.ENTER);
		aa.perform();
		
		// Radio button
		driver.findElement(By.xpath("//input[@value='91']")).click(); 
		
		//Subject field
		driver.findElement(By.name("subject")).sendKeys("User last login");
		
		// Message field
		driver.findElement(By.name("message")).sendKeys("User last login");
		
		// Submit button
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		if(submit.isEnabled()) {
			submit.click();
		}else
		{
			System.out.println("Submit button is disabled");
		} 
		
		
	}

}
