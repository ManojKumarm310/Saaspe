package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.SingleDepartment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SingleDepartmentOnboarding extends SingleDepartment {

	WebDriver driver = new ChromeDriver();
	SingleDepartment sd = PageFactory.initElements(driver, SingleDepartment.class);
	
	
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
	
	/* @Then("Select the department currency {string}")
	public void select_the_department_currency(String departcurrency) {
	    
		sd.departmentCurrency(departcurrency);
	} */
	
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
