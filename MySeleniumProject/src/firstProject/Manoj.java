package firstProject;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manoj {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mohan");
		driver.findElement(By.name("lastName")).sendKeys("Kishore");
		driver.findElement(By.name("emailAddress")).sendKeys("mohan@gmail.com");
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]")).click();
		Thread.sleep(4000);
		
		

	}

}
