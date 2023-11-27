package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOfApplication {
	
	WebDriver driver;
	
	public LoginOfApplication(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By uname = By.name("emailAddress");
	By pwd = By.name("password");
	By login = By.xpath("//button[@type='submit']");
	By otp1 = By.xpath("(//input[@name='authenticationcode'])[1]");
	By otp2 = By.xpath("//input[2]");
	By otp3 = By.xpath("//input[3]");
	By otp4 = By.xpath("//input[4]");
	By otp5 = By.xpath("//input[5]");
	By otp6 = By.xpath("//input[6]");
	By otpsubmit = By.xpath("//button[@type='submit']");
		
		public void username(String usrname) {
			
			
			
			
			 driver.findElement(uname).sendKeys(usrname);
		}
		
		public void password(String pass) {
			
			
			driver.findElement(pwd).sendKeys(pass);
			
			 
		}
		
		
		
		public void clickLogin() {
			
			driver.findElement(login).click();
		}
		
		public void otp() {
			
			driver.findElement(otp1).sendKeys("5");
			driver.findElement(otp2).sendKeys("5");
			driver.findElement(otp3).sendKeys("5");
			driver.findElement(otp4).sendKeys("5");
			driver.findElement(otp5).sendKeys("5");
			driver.findElement(otp6).sendKeys("5");
			
		}
		
		public void otpSubmitButton() {
			
			driver.findElement(otpsubmit).click();
		}
	
}
