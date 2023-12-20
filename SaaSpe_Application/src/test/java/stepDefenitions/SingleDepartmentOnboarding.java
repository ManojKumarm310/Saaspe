package stepDefenitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import POM.Invoice;
import POM.Lastlogin;
import POM.LoginPage;
import POM.SingleDepartment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SingleDepartmentOnboarding  {

	

	public WebDriver driver; 
	LoginPage lp;
	SingleDepartment sd;
	Invoice in; 
	Lastlogin ll;
	
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
    
}}
