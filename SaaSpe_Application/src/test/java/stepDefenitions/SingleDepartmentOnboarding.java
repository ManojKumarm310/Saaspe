package stepDefenitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import EcommercePages.RegisterPage;
import EcommercePages.changePage;
import EcommercePages.login;
import POM.ChangePasswordPage;
import POM.CurrencyConversionPage;
import POM.Invoice;
import POM.Lastlogin;
import POM.LoginPage;
import POM.SingleDepartment;
import POM.UserCreationPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.plugin.event.Node.Scenario;

public class SingleDepartmentOnboarding  {

	

	public WebDriver driver; 
	LoginPage lp;
	SingleDepartment sd;
	Invoice in; 
	Lastlogin ll;
	ChangePasswordPage cp;
	UserCreationPage uc;
	CurrencyConversionPage cc;
	RegisterPage rp;
	login l;
	changePage c;
	
//	LoginPage lp = new LoginPage(driver);
	
//	SingleDepartment sd = new SingleDepartment(driver);
	
 @AfterStep
	    public void tearDown(io.cucumber.java.Scenario scenario) throws IOException {
	        if (scenario.isFailed()) {
	            // Take a screenshot
	            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	             
	             
	             // File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            File des = new File("C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\Screenshot\\result.png");
	              // FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\Screenshot\\" + scenario.getName() + ".png"));
	            FileHandler.copy(screenshot, des);
	        }
	        } 
	
	
	
	
	
	
	@Given("Open the application {string}")
	public void open_the_application(String url) {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\SaaSpe_Application\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	
//	LoginPage lp = new LoginPage(driver);
//	lp.
	
	//SingleDepartment sd = new SingleDepartment(driver);
	
	@Then("Enter the username as {string}")
	public void enter_the_username_as(String usrname) {
	    
		lp = new LoginPage(driver);
		lp.username(usrname);
		
	}
	
	@Then("Enter the password as {string}")
	public void enter_the_password_as(String upassword) {
		
		lp = new LoginPage(driver);
		lp.password(upassword);
		
	}
	
	@Then("Click on the login button")
	public void click_on_the_login_button() {
		
		lp = new LoginPage(driver);
		lp.clickLogin();
	}
	
	
	
	@Then("Enter the otp")
	public void enter_the_otp() {
		
		lp = new LoginPage(driver);
		lp.otp();
		
	}
	@And("Click on the otp submit button")
	public void click_on_the_otp_submit_button() {
		
		lp = new LoginPage(driver);
		lp.otpSubmitButton();
	    
	}
	
/*	@Then("Click on the invoice button")
	public void Click_on_the_invoice_button() {
		
		inv = new Invoice(driver);
		inv.invoiceButton1().click();
	
	} */
	
	@Then("Click on the Department from the menu")
	public void click_on_the_department_from_the_menu() throws InterruptedException {
	    
		sd = new SingleDepartment(driver);
		sd.department();
	}
	@Then("Click on the Add button in the page")
	public void click_on_the_add_button_in_the_page() {
	    
		sd = new SingleDepartment(driver);
		sd.addButton();
	}
	
	@Then("Select the Single Department radio button")
	public void select_the_single_department_radio_button() {
	    
		sd = new SingleDepartment(driver);
		sd.singleRadio();
	}
	
	@Then("Enter the department name {string}")
	public void enter_the_department_name(String departname) {
	    
		sd = new SingleDepartment(driver);
		sd.departmentName(departname);
	}
	
	@Then("Enter the department budget {string}")
	public void enter_the_department_budget(String departbudget) {
	    
		sd = new SingleDepartment(driver);
		sd.departmentBudget(departbudget);
	}
	
	 @Then("Select the department currency {string}")
	public void select_the_department_currency(String departcurrency) {
	    
		 sd = new SingleDepartment(driver);
		sd.departmentCurrency(departcurrency);
	} 
	
	@Then("Enter the First Owner Mail id {string}")
	public void enter_the_first_owner_mail_id(String fownermail) {
	    
		sd = new SingleDepartment(driver);
		sd.firstOwnerMail(fownermail);
	}
	
	@Then("Enter the First Owner name {string}")
	public void enter_the_first_owner_name(String fownername) {
	    
		sd = new SingleDepartment(driver);
		sd.firstOwnerName(fownername);
	}
	
	@And("Click on the department submit button")
	public void click_on_the_department_submit_button() {
	    
		sd = new SingleDepartment(driver);
		sd.deptSubmit();
	}

// -----------------------------------------------------------------------------------------------------------------------//
// Invoice Onboarding
	
		@Then("Click on the invoice button")
	public void Click_on_the_invoice_button() {
		
		in = new Invoice(driver);
		in.invoiceButton().click();
	
	} 
	
	@Then("Click on the invoice add button")
	public void click_on_the_invoice_add_button() {
	    
		in = new Invoice(driver);
		in.invoiceAdd();
	}
	
	@Then("Enter the invoice number {string}")
	public void enter_the_invoice_number(String ino) {
	   
		in = new Invoice(driver);
		in.invoiceNumber(ino);
	}
	
	@Then("Select the subscription id {string}")
	public void select_the_subscription_id(String subsid) throws InterruptedException {
	    
	/*	in = new Invoice(driver);
		in.subId(subsid); */
		
		WebElement id = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
		id.click();
		Thread.sleep(3000);
		Actions aid = new Actions(driver);
		aid.sendKeys(id, "Id7249");
		aid.sendKeys(Keys.ENTER);
		aid.perform();
	}
	
	@Then("Select the invoice currency {string}")
	public void select_the_invoice_currency(String ic) {
	    
		in = new Invoice(driver);
		in.invoiceCurrency(ic);
		
	}
	
	@Then("Enter the invoice amount {string}")
	public void enter_the_invoice_amount(String ia) {
	    
		in = new Invoice(driver);
		in.invoiceAmount(ia);
	}
	
	@Then("Select the start date {string}")
	public void select_the_start_date(String start) {
	    
		in = new Invoice(driver);
		in.startDate(start);
	}
	
	@Then("Select the end date {string}")
	public void select_the_end_date(String end) {
	    
		in = new Invoice(driver);
		in.endDate(end);
	}
	
	@Then("Select the due date {string}")
	public void select_the_due_date(String due) {
	    
		in = new Invoice(driver);
		in.dueDate(due);
	}
	
	@Then("Upload the invoice document")
	public void upload_the_invoice_document() throws AWTException {
	    
		/* in = new Invoice(driver);
		in.uploadInvoice(); */
		
driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

Robot robot = new Robot();		
StringSelection selection = new StringSelection("C:\\IN-1452563.pdf");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

// Delay to ensure the file upload dialog is in focus
robot.delay(1000);

// Simulate Ctrl+V (paste) to paste the file path into the dialog
robot.keyPress(KeyEvent.VK_CONTROL);
robot.delay(500);  // Adjust the delay as needed
robot.keyPress(KeyEvent.VK_V);
robot.delay(500);  // Adjust the delay as needed
robot.keyRelease(KeyEvent.VK_V);
robot.delay(500);  // Adjust the delay as needed
robot.keyRelease(KeyEvent.VK_CONTROL);

// Delay before simulating Enter to confirm the file upload
robot.delay(500);  // Adjust the delay as needed

// Simulate Enter to confirm the file upload
robot.keyPress(KeyEvent.VK_ENTER);
robot.delay(500);  // Adjust the delay as needed
robot.keyRelease(KeyEvent.VK_ENTER);

	}
	
	@Then("Click on the invoice submit button")
	public void click_on_the_invoice_submit_button() throws InterruptedException {
	    
		in = new Invoice(driver);
		in.clickSubmit();
	} 

//---------------------------------------------------------------------------------------------------
// Workflow

@Then("Click on the workflow button")
public void click_on_the_workflow_button() {
   
	ll = new Lastlogin(driver);
	ll.workflow();
}

@Then("Click on the create workfow button")
public void click_on_the_create_workfow_button() {
    
	ll = new Lastlogin(driver);
	ll.wButton();
}

@Then("Select the application")
public void select_the_application() throws InterruptedException {
   
	ll = new Lastlogin(driver);
	ll.selectApplication();
}

@Then("Select the date range")
public void select_the_date_range() {
    
	ll = new Lastlogin(driver);
	ll.dateRange();
}

@Then("Enter the Subject {string}")
public void enter_the_subject(String str) {
    
	ll = new Lastlogin(driver);
	ll.enterSubject(str);
}

@Then("Enter the Message {string}")
public void enter_the_message(String mess) {
    
	ll = new Lastlogin(driver);
	ll.enterMessage(mess);
}

@Then("Click on the workflow submit button")
public void click_on_the_workflow_submit_button() {
	
	ll = new Lastlogin(driver);
	ll.clickSubmit();
    
}
//Change Password-----------------------------------------------------------
@Then("Click on the user information button")
public void click_on_the_user_information_button() {
    
	cp = new ChangePasswordPage(driver);
	cp.arrowButton();
}
@Then("Click on the change password")
public void click_on_the_change_password() {
    
	cp = new ChangePasswordPage(driver);
	cp.changePassword();
}
@Then("Enter the old password {string}")
public void enter_the_old_password(String old) {
    
	cp = new ChangePasswordPage(driver);
	cp.oldPassword(old);
}
@Then("Enter the new password {string}")
public void enter_the_new_password(String newp) {
    
	cp = new ChangePasswordPage(driver);
	cp.newPassword(newp);
}
@Then("Enter the confirm password {string}")
public void enter_the_confirm_password(String confirm) {
   
	cp = new ChangePasswordPage(driver);
	cp.confirmPassowrd(confirm);
}
@And("Click on the change password button")
public void click_on_the_change_password_button() {
	
	cp = new ChangePasswordPage(driver);
	cp.passSubmitButton();
}

// User Creation------------------------------------------------------------------------
@Then("Click on the Administraction link")
public void click_on_the_administraction_link() {
	
	uc = new UserCreationPage(driver);
    uc.adminLink();
}

@Then("Click on the User Management link")
public void click_on_the_user_management_link() {
	
	uc = new UserCreationPage(driver);
	uc.userManagementLink();
   
}

@Then("Click on the Add button")
public void click_on_the_add_button() {
	
	uc = new UserCreationPage(driver);
	uc.addButton();
   
}

@Then("Enter the user first name {string}")
public void enter_the_user_first_name(String f) {
	
	uc = new UserCreationPage(driver);
	uc.firstName(f);
}

@Then("Enter the user last name {string}")
public void enter_the_user_last_name(String lname) {
	
	uc = new UserCreationPage(driver);
    uc.lastName(lname);
}

@Then("Enter the user Email Address {string}")
public void enter_the_user_email_address(String um) {
	
	uc = new UserCreationPage(driver);
    uc.userMail(um);
}

@Then("Select the role")
public void select_the_role() throws InterruptedException {
	
	uc = new UserCreationPage(driver);
    uc.userRole();
}

@And("Click on the User Management Submit button")
public void click_on_the_user_management_submit_button() {
	
	uc = new UserCreationPage(driver);
	uc.clickSubmit();
    
}

// Currency Convertor ----------------------------------------------------------------

@Then("Click on the Administration link")
public void click_on_the_administration_link() {
	
	cc = new CurrencyConversionPage(driver);
    cc.adminLink();
}
@Then("Click on the preference link")
public void click_on_the_preference_link() {
	
	cc = new CurrencyConversionPage(driver);
    cc.preferenceLink();
}
@Then("Select the preferred currency {string}")
public void select_the_preferred_currency(String c) {
    
	cc = new CurrencyConversionPage(driver);
	cc.selectCurrency(c);
}
@And("Click on the Save button")
public void click_on_the_save_button() throws InterruptedException {
    
	cc = new CurrencyConversionPage(driver);
	cc.saveButton();
}

//---------E-commerce Register Page-----------------

@Given("Open the E-Commerce website with the url {string}")
public void open_the_e_commerce_website_with_the_url(String url) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\SaaSpe_Application\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(url);
    
}

@Then("Click on the My Account link")
public void click_on_the_my_account_link() {
	
	rp = new RegisterPage(driver);
	rp.accountLink();
    
}

@Then("Click on the Register Button")
public void click_on_the_register_button() {
	
	rp = new RegisterPage(driver);
	rp.registerButton();
    
}

@Then("Enter the first name as {string}")
public void enter_the_first_name_as(String first) {
    
	rp = new RegisterPage(driver);
	rp.firstName(first);
}

@Then("Enter the last name as {string}")
public void enter_the_last_name_as(String last) {
	
	rp = new RegisterPage(driver);
	rp.lastName(last);
    
}

@Then("Enter user email address {string}")
public void enter_user_email_address(String mail) {
	
	rp = new RegisterPage(driver);
	rp.email(mail);
    
}

@Then("Enter the user phone number {string}")
public void enter_the_user_phone_number(String pno) {
	
	rp = new RegisterPage(driver);
	rp.phoneNo(pno);
    
}

@Then("Enter the user password as {string}")
public void enter_the_user_password_as(String pass) {
    
	
	rp = new RegisterPage(driver);
	rp.password(pass);
}

@Then("Enter the confirm password as {string}")
public void enter_the_confirm_password_as(String cpass) {
	
	rp = new RegisterPage(driver);
	rp.confirmPassword(cpass);
   
}

@Then("Click on the Checkbox")
public void click_on_the_checkbox() {
	
	rp = new RegisterPage(driver);
	rp.checkbox();
   
}

@And("click on continue button")
public void click_on_continue_button() {
	
	rp = new RegisterPage(driver);
	rp.submitButton();
    
}

// Changes-----------------------------------------------------------------------
@Given("url {string}")
public void url(String string) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://stardesk-itsm-ui-dev.myairports.com.my/");
	Thread.sleep(3000);
}

@Then("username {string}")
public void username(String string) {
	l = new login(driver);
    l.userName(string);
}
@Then("password {string}")
public void password(String string) {
	l = new login(driver);
    l.password(string);
    l.submitButton();
}
@Then("Click on the Changes button in the side menu")
public void click_on_the_changes_button_in_the_side_menu() {
	c = new changePage(driver);
    c.changeButton();
}

@Then("Click on the Create New button")
public void click_on_the_create_new_button() {
	c = new changePage(driver);
    c.createNew();
}

@Then("Enter the phone number {string}")
public void enter_the_phone_number(String string) {
	c = new changePage(driver);
    c.phoneNo(string);
}

@Then("Enter subject {string}")
public void enter_subject(String string) {
	c = new changePage(driver);
    c.subject(string);
}

@Then("Enter the description {string}")
public void enter_the_description(String string) {
   c.description(string);
}

@Then("Select the impact {string}")
public void select_the_impact(String string) {
	c = new changePage(driver);
    c.impact(string);
}

@Then("Select the urgency {string}")
public void select_the_urgency(String string) {
	c = new changePage(driver);
   c.urgency(string);
}

@Then("Select classfication {string}")
public void select_classfication(String string) {
	c = new changePage(driver);
    c.changeClassfication(string);
}








}
