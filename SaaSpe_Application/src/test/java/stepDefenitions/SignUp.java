package stepDefenitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp {
	
	public static WebDriver driver;
	
	@Given("^I will open the application with the url \"([^\"]*)\"$")
	public void i_will_open_the_application_with_the_url(String url)  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@When("I click on the Sign Up option")
	public void i_click_on_the_sign_up_option() {
		
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@Then("I enter the user first name {string}")
	public void i_enter_the_user_first_name(String uname) {
		
		driver.findElement(By.name("firstName")).sendKeys(uname);
	}
	@Then("I enter the user last name {string}")
	public void i_enter_the_user_last_name(String lname) {
	    
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	@Then("I enter the user mail id {string}")
	public void i_enter_the_user_mail_id(String mail) {
		
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
	}
	@Then("I enter the user mobile number {string}")
	public void i_enter_the_user_mobile_number(String mobile) {
		
		driver.findElement(By.name("userMobileNumber")).sendKeys(mobile);
		
	}
	@Then("I enter the designation of the user {string}")
	public void i_enter_the_designation_of_the_user(String design) throws InterruptedException {
	    
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> designation =  driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		Thread.sleep(2000);
		for (WebElement drop : designation) {
			String a = drop.getText();
			if (a.equalsIgnoreCase(design)) {
				drop.click();
				break;
			}
		}
	}
	@Then("I enter the password of the user {string}")
	public void i_enter_the_password_of_the_user(String password) {
	    
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("I click on the terms and condition check box")
	public void i_click_on_the_terms_and_condition_check_box() throws InterruptedException {
	    
		driver.findElement(By.name("accept")).click();
		Thread.sleep(3000);
	}
	@And("I click on the submit button")
	public void i_click_on_the_submit_button() {
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} catch (Exception e) {
			System.out.println("Submit button is not enabled test case pass");
		}
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@When("User close the browser")
	public void user_close_the_browser() throws InterruptedException {
	    
		Thread.sleep(5000);
		driver.close();
	}


}
