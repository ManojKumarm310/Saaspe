package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
	WebDriver driver;
	
	// Sign Up link
		By signup = By.linkText("Sign Up");
		
		// First name
		By first = By.name("firstName");
		
		// Last name
		By last = By.name("lastName");
		
		// Email address
		By email = By.name("emailAddress");
		
		// Mobile number
		By mn = By.name("userMobileNumber");
		
		// Designation
		By ro = By.xpath("(//span[@class='ant-select-selection-item'])[2]");
		
		// Password
		By pwd = By.name("password");
		
		// Check box
		By cb = By.name("accept");
		
		// Submit 
		By sub = By.xpath("//button[@type='submit']");
		
		
		
		// Methods for the class
		
		public SignUpPage(WebDriver driver) {
			
			this.driver = driver;
		}

		public void signUpLink() {
			
			driver.findElement(signup).click();
		}
		
		public void firstName(String fn) {
			
			driver.findElement(first).sendKeys(fn);
		}
		
		public void lastName(String ln) {
			
			driver.findElement(last).sendKeys(ln);
		}
		
		public void mailAddress(String mail) {
			
			driver.findElement(email).sendKeys(mail);
		}
		
		public void mobileNumber(String no) {
			
			driver.findElement(mn).sendKeys(no);
		}
		
		public void userDesignation(String role) throws InterruptedException {
			
			driver.findElement(ro).click();
			Thread.sleep(2000);
			List<WebElement> designation =  driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
			Thread.sleep(2000);
			for (WebElement drop : designation) {
				String a = drop.getText();
				if (a.equalsIgnoreCase(role)) {
					drop.click();
					break;
				}
			}
		}
		
		public void password(String pass) {
			
			driver.findElement(pwd).sendKeys(pass);
		}
		
		public void checkBox() {
			
			driver.findElement(cb).click();
		}
		
		public void submitButton() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			WebElement spop = driver.findElement(By.xpath("//span[@class='ant-typography']"));
			if (spop.isDisplayed()) {
				
				System.out.println("Sign up is passed");
			} else {
				
				System.out.println("Sign up is failed");
			}
		}

}
