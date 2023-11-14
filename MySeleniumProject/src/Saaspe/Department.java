package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Department {

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
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Departments']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='ant-radio-input']")).click();
		driver.findElement(By.name("departmentName")).sendKeys("VLSI");
		driver.findElement(By.name("budget")).sendKeys("12500");
		driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
		List<WebElement> currency = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		for (WebElement curr : currency) {
			String a = curr.getText();
			if (a.equalsIgnoreCase("myr")) {
				curr.click();
				break;
			}
		}
		driver.findElement(By.name("ownerEmailAddress")).sendKeys("fekiby@lyft.live");
		driver.findElement(By.name("ownerName")).sendKeys("Swaroop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
