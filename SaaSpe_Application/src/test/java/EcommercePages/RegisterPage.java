package EcommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//span[text()='My Account']")
	WebElement accountLink;
	
	@FindBy (linkText = "Register")
	WebElement register;
	
	@FindBy (id = "input-firstname")
	WebElement firstname;
	
	@FindBy (id = "input-lastname")
	WebElement lastname;
	
	@FindBy (id = "input-email")
	WebElement email;
	
	@FindBy (id = "input-telephone")
	WebElement phone;
	
	@FindBy (id = "input-password")
	WebElement password;
	
	@FindBy (id = "input-confirm")
	WebElement cPassword;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement submit;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void accountLink() {
		
		accountLink.click();
	}
	
	public void registerButton() {
		
		register.click();
	}
	
	public void firstName(String fn) {
		
		firstname.sendKeys(fn);
	}
	
	public void lastName(String ln) {
		
		lastname.sendKeys(ln);
	}
	
	public void email(String mail) {
		
		email.sendKeys(mail);
	}
	
	public void phoneNo(String pn) {
		
		phone.sendKeys(pn);
	}
	
	public void password(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	public void confirmPassword(String cpwd) {
		
		cPassword.sendKeys(cpwd);
	}
	
	public void checkbox() {
		
		checkbox.click();
	}
	
	public void submitButton() {
		
		submit.click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	}
}
