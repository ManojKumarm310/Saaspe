package stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogin {
	
	public static WebDriver driver;

	/*@Given("^I will open the application with the url \"([^\"]*)\"$")
	public void i_will_open_the_application_with_the_url(String url)  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}  */

	@When("^I enter the username \"([^\"]*)\"$")
	public void i_enter_the_username(String uname)  {
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}

	@When("^I enter the password \"([^\"]*)\"$")
	public void i_enter_the_password(String pwd)  {
		
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}

	@When("^I click the login button$")
	public void i_click_the_login_button()  {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@When("I will click on the Welcome link")
	public void i_will_click_on_the_welcome_link() {
	    
		driver.findElement(By.id("welcome")).click();
	}
	@When("I will click on the logout button")
	public void i_will_click_on_the_logout_button() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();
	}
	
	@Then("I will close the browser")
	public void i_will_close_the_browser() {
	    driver.close();
	}

}
