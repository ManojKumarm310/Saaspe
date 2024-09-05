package Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveSum {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		driver.findElement(By.name("emailAddress")).sendKeys("rishi.p@mind-graph.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		
		// table
		WebElement table = driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=1; i<=rows.size(); i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			for(WebElement c: col) {
				 String s = c.getText();
				 if (s.equalsIgnoreCase("bugqlm@kzccv.com")) {
					driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
				}
				
			}
		}
		
		
	}
	

}
