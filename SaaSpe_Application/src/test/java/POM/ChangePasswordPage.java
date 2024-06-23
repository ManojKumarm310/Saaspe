package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	
 WebDriver driver;
 
 public ChangePasswordPage(WebDriver driver) {
		
		this.driver = driver;
	}
	

	/* public ChangePasswordPage(){
	 PageFactory.initElements(driver, this);
	 }
	  */
	
	
	
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
	
	// Arrow Button
	//By arrow = By.xpath("//*[@class='iconify iconify--ep']");
	By arrow = By.xpath("(//*[@class='iconify iconify--ep'])[1]");
	
	// Change Password
	By cp = By.xpath("//span[@class='ant-dropdown-menu-title-content']");
	
	// Old Password
	By op = By.name("OldPassword");
	
	// New Password
	By np = By.name("NewPassword");
	
	// Confirm Password
	By confirm = By.name("ConfirmNewPassword");
	
	// Confirm Button
	By cbutton = By.xpath("//button[@type='submit']");
	
	// Methods for the change password
	
/*	public ChangePasswordPage(WebDriver driver) {
		
		this.driver = driver;
	} */
 
	/*public ChangePasswordPage(WebDriver driver) {
		
		this.driver = driver;
	} */

	public void mailId(String mail) {
		
		driver.findElement(uname).sendKeys(mail);
	}
	
	public void password(String pass) {
		
		driver.findElement(pwd).sendKeys(pass);
	}
	
	public void loginButton() {
		
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

	public void submitButton() {
		
		driver.findElement(otpsubmit).click();
	}
	
	public void arrowButton() {
		driver.findElement(arrow).click();
		
	}
	
	public void changePassword() {
		
		//driver.findElement(arrow).click();
		driver.findElement(cp).click();
	}
	
	public void oldPassword(String opass) {
		
		driver.findElement(op).sendKeys(opass);
	}
	
	public void newPassword(String npass) {
		
		driver.findElement(np).sendKeys(npass);
	}
	
	public void confirmPassowrd(String cpass) {
		
		driver.findElement(confirm).sendKeys(cpass);
	}
	
	public void passSubmitButton() {
		
		driver.findElement(cbutton).click();
		
		WebElement succ = driver.findElement(By.xpath("//*[@class='iconify iconify--ep']"));
		if (succ.isDisplayed()) {
			System.out.println("Password Change is successful");
		} else {
			System.out.println("Password Change is failed");
		}
	}

}
