package reusableMethodsLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uttils.appUtils;

public class SignUp extends appUtils {
	
	public void userDetails(String fname, String lname, String mail, String pno) {
		
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
		driver.findElement(By.name("userMobileNumber")).sendKeys(pno);
		
	}

	public void uDetails(String desig, String pword) throws InterruptedException {
		
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> designation =  driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		Thread.sleep(2000);
		for (WebElement drop : designation) {
			String a = drop.getText();
			if (a.equalsIgnoreCase(desig)) {
				drop.click();
				break;
			}
		}
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.name("accept")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
}
