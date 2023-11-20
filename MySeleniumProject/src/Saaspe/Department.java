package Saaspe;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		//Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Departments']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='ant-radio-input']")).click();
		driver.findElement(By.name("departmentName")).sendKeys("VLSI");
		driver.findElement(By.name("budget")).sendKeys("12500");
		/*driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
		List<WebElement> currency = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		for (WebElement curr : currency) {
			String a = curr.getText();
			if (a.equalsIgnoreCase("myr")) {
				curr.click();
				break;
			}
		} */
		
		WebElement currency = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
		currency.click();
		Actions cact = new Actions(driver);
		cact.sendKeys(currency, "MYR");
		cact.sendKeys(Keys.ENTER);
		cact.perform();
		
		driver.findElement(By.name("ownerEmailAddress")).sendKeys("fekiby@lyft.live");
		driver.findElement(By.name("ownerName")).sendKeys("Swaroop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
