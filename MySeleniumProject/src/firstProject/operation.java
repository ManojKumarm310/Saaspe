package firstProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Click on the application link in the saaspe
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://sit-app.saaspe.com/auth/login");
		driver.findElement(By.name("emailAddress")).sendKeys("rishi.p@mind-graph.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//span[text()='Applications'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		
	
		
		
		
		
	

	}

}
