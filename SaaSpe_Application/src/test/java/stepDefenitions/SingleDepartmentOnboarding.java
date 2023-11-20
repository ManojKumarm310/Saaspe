package stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.LoginPage;
import POM.SingleDepartment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SingleDepartmentOnboarding  {

	

	public WebDriver driver; 
	
//	LoginPage lp = new LoginPage(driver);
	
//	SingleDepartment sd = new SingleDepartment(driver);
	
	
	
	
	@Given("Open the application {string}")
	public void open_the_application(String url) {
	   
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	LoginPage lp = new LoginPage(driver);
	
	SingleDepartment sd = new SingleDepartment(driver);
	
	@Then("Enter the username as {string}")
	public void enter_the_username_as(String username) {
	    
		lp.username(username);
	}
	
	@Then("Enter the password as {string}")
	public void enter_the_password_as(String password) {
	    
		lp.password(password);
	}
	
	@Then("Click on the login button")
	public void click_on_the_login_button() {
	    
		lp.clickLogin();
	}
	
	
	
	@Then("Enter the otp")
	public void enter_the_otp() {
		
		lp.otp();
		
	}
	@And("Click on the otp submit button")
	public void click_on_the_otp_submit_button() {
		
		lp.otpSubmitButton();
	    
	}
	
	@Then("Click on the Department from the menu")
	public void click_on_the_department_from_the_menu() throws InterruptedException {
	    
		sd.department();
	}
	@Then("Click on the Add button in the page")
	public void click_on_the_add_button_in_the_page() {
	    
		sd.addButton();
	}
	
	@Then("Select the Single Department radio button")
	public void select_the_single_department_radio_button() {
	    
		sd.singleRadio();
	}
	
	@Then("Enter the department name {string}")
	public void enter_the_department_name(String departname) {
	    
		sd.departmentName(departname);
	}
	
	@Then("Enter the department budget {string}")
	public void enter_the_department_budget(String departbudget) {
	    
		sd.departmentBudget(departbudget);
	}
	
	 @Then("Select the department currency {string}")
	public void select_the_department_currency(String departcurrency) {
	    
		sd.departmentCurrency(departcurrency);
	} 
	
	@Then("Enter the First Owner Mail id {string}")
	public void enter_the_first_owner_mail_id(String fownermail) {
	    
		sd.firstOwnerMail(fownermail);
	}
	
	@Then("Enter the First Owner name {string}")
	public void enter_the_first_owner_name(String fownername) {
	    
		sd.firstOwnerName(fownername);
	}
	
	@And("Click on the department submit button")
	public void click_on_the_department_submit_button() {
	    
		sd.deptSubmit();
	}

}
