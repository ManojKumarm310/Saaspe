package EcommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	WebDriver driver;
	
/*	// Username
	
	@FindBy (name = "username")
	WebElement uname;
	
	// Password
	@FindBy (name = "password")
	WebElement pword;
	
	// Submit
	@FindBy (xpath = "//button[@type='submit']")
	WebElement submit; */
	
	By un = By.name("username");
	By pw = By.name("password");
	By sub = By.xpath("//button[@type='submit']");
	
	// Methods
	
	 public login(WebDriver driver) {
	        this.driver = driver;
	       
	    }

	public void userName(String name) {
		driver.findElement(un).sendKeys("bhanu");
	}
	
	public void password(String pwrd) {
		driver.findElement(pw).sendKeys("Test@321");
	}
	
	public void submitButton() {
		driver.findElement(sub).click();
	}

}
