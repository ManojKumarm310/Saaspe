package reusableMethodsLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uttils.appUtils;

public class Department extends appUtils {
	
	
	public void login(String uname, String pwd) throws InterruptedException {
		
		driver.findElement(By.name("emailAddress")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Departments']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='ant-radio-input']")).click();
		
	}
	
	

	public void departmentDetails(String dname, String budget, String budcur) {
		
		driver.findElement(By.name("departmentName")).sendKeys(dname);
		driver.findElement(By.name("budget")).sendKeys(budget);
		driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
		List<WebElement> currency = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		for (WebElement curr : currency) {
			String a = curr.getText();
			if (a.equalsIgnoreCase(budcur)) {
				curr.click();
				break;
			}
		}
	}
	
	
	
	public void ownerDetails(String fownermail, String fownername) {
		
		driver.findElement(By.name("ownerEmailAddress")).sendKeys(fownermail);
		driver.findElement(By.name("ownerName")).sendKeys(fownername);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
		
		
		
		
		
		
		
		
		
		
	
	

}
