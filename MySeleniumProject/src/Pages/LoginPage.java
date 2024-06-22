package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
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
	
	// Methods for the login page
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void userMail(String un) {
		
		 driver.findElement(uname).sendKeys(un);
	}
	
	public void userPassword(String pw) {
		
		driver.findElement(pwd).sendKeys(pw);
	}
	
	public void loginButton() {
		
		driver.findElement(login).click();
		WebElement np = driver.findElement(By.xpath("//h2[text()='Verify OTP']"));
		if (np.isDisplayed()) {
			System.out.println("Otp page is displayed");
		} else {
			System.out.println("Otp page is not displayed");
		}
	}
	
	public void enterOtp() {
		
		driver.findElement(otp1).sendKeys("5");
		driver.findElement(otp2).sendKeys("5");
		driver.findElement(otp3).sendKeys("5");
		driver.findElement(otp4).sendKeys("5");
		driver.findElement(otp5).sendKeys("5");
		driver.findElement(otp6).sendKeys("5");
	}
	
	public void otpButton() {
		
		driver.findElement(otpsubmit).click();
		
		WebElement dash = driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[1]"));
		if (dash.isDisplayed()) {
			System.out.println("Login is passed");
		} else {
			System.out.println("Login is failed");
		}
		
		
	}

}
