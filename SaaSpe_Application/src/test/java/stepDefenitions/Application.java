package stepDefenitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Application {
	
	public static WebDriver driver;
	
	@Given("Open the application with the url \"([^\"]*)\"$")
	public void Open_the_application_with_the_url(String url)  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Then("I enter the username as {string}")
	public void i_enter_the_username_as(String username) {
	    
		driver.findElement(By.name("emailAddress")).sendKeys(username);
	}
	
	@Then("I enter the password as {string}")
	public void i_enter_the_password_as(String password) {
	    
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("I click on the login button in the page")
	public void i_click_on_the_login_button_in_the_page() {
	   
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("I select the application option from the menu")
	public void i_select_the_application_option_from_the_menu() {
		
		driver.findElement(By.xpath("(//span[text()='Applications'])[1]")).click();
	  
	}
	
	@Then("I select the Add button")
	public void i_select_the_add_button() {
	    
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	}
	
	@When("I select the application type as {string}")
	public void i_select_the_application_type_as(String Apptype) throws InterruptedException {
	    
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		
		List<WebElement> a = driver.findElement(By.xpath("(//ul[@role='menu'])[3]")).findElements(By.tagName("li"));
		//String type = "New";
		for (WebElement b : a) {
			String ch = b.getText();
			if (ch.equalsIgnoreCase(Apptype)) {
				b.click();
				break;
			}
			
		}
	}
	
	@Then("I will select the application {string}")
	public void i_will_select_the_application(String Application) {
	    
		WebElement name = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
		name.click();
		Actions nact = new Actions(driver);
		nact.sendKeys(name,Application);
		nact.sendKeys(Keys.ENTER);
		nact.perform();
	}
	
	@Then("I will provide the provider name {string}")
	public void i_will_provide_the_provider_name(String Provider) {
	    
		driver.findElement(By.name("application.providerName")).sendKeys(Provider);
	}
	
	@Then("I will select the application category {string}")
	public void i_will_select_the_application_category(String cat) {
	    
		WebElement category = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		category.click();
		Actions cact = new Actions(driver);
		cact.sendKeys(category,cat);
		cact.sendKeys(Keys.ENTER);
		cact.perform();
	}
	
	@Then("I will enter the owner mail address {string}")
	public void i_will_enter_the_owner_mail_address(String powner) {
	   
		WebElement owner = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
		owner.click();
		Actions oact = new Actions(driver);
		oact.sendKeys(owner,powner);
		oact.sendKeys(Keys.ENTER);
		oact.perform();
	}
	
	@Then("I will enter the reason for onboarding {string}")
	public void i_will_enter_the_reason_for_onboarding(String rea) {
	    
		WebElement reason = driver.findElement(By.name("application.reason"));
		reason.click();
		reason.sendKeys("New requirement for the project");
	}
	
	@Then("I will select the project {string}")
	public void i_will_select_the_project(String ProjectName) {
	    
		WebElement project = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
		project.click();
		Actions pact = new Actions(driver);
		pact.sendKeys(project, ProjectName);
		pact.sendKeys(Keys.ENTER);
		pact.perform();
	}
	
	@Then("I will select the currency {string}")
	public void i_will_select_the_currency(String pcu) {
	    
		WebElement currency = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]"));
		currency.click();
		Actions cuact = new Actions(driver);
		cuact.sendKeys(currency, pcu);
		cuact.sendKeys(Keys.ENTER);
		cuact.perform();
	}
	
	@Then("I will enter the product name {string}")
	public void i_will_enter_the_product_name(String product) {
	   
		driver.findElement(By.name("contracts[0].products[0].productName")).sendKeys(product);
	}
	
	@Then("I will select the product type {string}")
	public void i_will_select_the_product_type(String type) {
	   
		WebElement product = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[7]"));
		product.click();
		Actions pro = new Actions(driver);
		pro.sendKeys(product, type);
		pro.sendKeys(Keys.ENTER);
		pro.perform();
	}
	
	@Then("I will enter the unit price {string}")
	public void i_will_enter_the_unit_price(String uprice) {
	    
		WebElement unit = driver.findElement(By.xpath("//input[@type='number']"));
		unit.clear();
		unit.sendKeys(uprice);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[8]")).click();
		driver.findElement(By.xpath("//div[@title='per year']")).click();
	}
	
	@Then("I will enter the quantity {string}")
	public void i_will_enter_the_quantity(String Quantity) {
	    
		driver.findElement(By.name("contracts[0].products[0].quantity")).sendKeys(Quantity);
	}
	
	@When("I click on the Next button")
	public void i_click_on_the_next_button() {
	    
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@When("I click on the choose file")
	public void i_click_on_the_choose_file() throws InterruptedException {
	    
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		Thread.sleep(4000);
	    WebElement pdfElement = driver.findElement(By.xpath("//span[contains(text(), 'PDF')]"));
	    pdfElement.click(); 
	}
	
	@Then("I will provide the supporting document")
	public void i_will_provide_the_supporting_document() throws AWTException, InterruptedException {
	    
		WebDriverWait w = new WebDriverWait(driver, 30);
	    w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ant-modal-body']")))); 
		
		Robot robot = new Robot();

	    // Set the clipboard with the file path
	    StringSelection selection = new StringSelection("C:\\Users\\Mindgraph-MG\\Desktop\\Sample Construction Contract.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	    // Simulate Ctrl+V (paste) to paste the file path into the dialog
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);

	    // Simulate Enter to confirm the file upload
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);

	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='ant-modal-body']"))));
	    
	}
	
	@When("I click on the Next button in  document page")
	public void i_click_on_the_next_button_in_document_page() {
	    
		 driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	}
	
	@Then("In similar application page i click on Next button")
	public void in_similar_application_page_i_click_on_next_button() {
		
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    
	}
	
	@Then("I will click on the submit button")
	public void i_will_click_on_the_submit_button() {
	   
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	}
	
	@When("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
	    
		Thread.sleep(5000);
		driver.close();
	}


}
