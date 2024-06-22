package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewApplicationPage {
	
	WebDriver driver;
	
	// Application link
		By ap = By.xpath("(//span[text()='Applications'])[1]");
		
		// Add button
		By add = By.xpath("(//button[@type='button'])[2]");
		
		// Application type
		By atype = By.xpath("(//button[@type='button'])[2]");
		
		// Application drop down
		By apd = By.xpath("//span[@class='ant-select-selection-item']");
		
		// Provider Name
		By provider = By.name("application.providerName");
		
		// Category
		By cat = By.xpath("(//span[@class='ant-select-selection-item'])[2]");
		
		// Owner mail address
		By fowner = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
		
		// Reason for onboarding
		By req = By.name("application.reason");
		
		// Project
		By pro = By.xpath("(//span[@class='ant-select-selection-item'])[4]");
		
		// Currency
		By curr = By.xpath("(//span[@class='ant-select-selection-item'])[6]");
		
		// Product Name
		By pn = By.name("contracts[0].products[0].productName");
		
		// Product type
		By ptype = By.xpath("(//span[@class='ant-select-selection-item'])[7]");
		
		// Unit Price
		By up = By.xpath("//input[@type='number']");
		
		// Unit price type
		By upt = By.xpath("(//div[@class='ant-select-selector'])[8]");
		
		// Quantity
		By quantity = By.name("contracts[0].products[0].quantity");
		
		// Application Next button
		By anb = By.xpath("//button[@type='submit']");
		
		// Choose file
		By cf = By.xpath("//span[text()='Choose file']");
		
		// supporting document next button
		By snb = By.xpath("(//button[@type='button'])[4]");
		
		// Similar application next button
		By sanb = By.xpath("(//button[@type='button'])[3]");
		
		// Submit button
		By submit = By.xpath("(//button[@type='button'])[3]");
		
		// Methods for the New application
		
		public NewApplicationPage(WebDriver driver) {
			
			this.driver = driver;
		}

		public void addApplication() throws InterruptedException {
			
			Thread.sleep(9000);
			driver.findElement(ap).click();
			driver.findElement(add).click();
			// Selecting the type of the application.
			driver.findElement(atype).click();
			Thread.sleep(3000);
			List<WebElement> a = driver.findElement(By.xpath("(//ul[@role='menu'])[3]")).findElements(By.tagName("li"));
			String type = "New";
			for (WebElement b : a) {
				String ch = b.getText();
				if (ch.equalsIgnoreCase(type)) {
					b.click();
					break;
				}
				
			}
		}
		
		public void selectApplication(String application) {
			
			WebElement name = driver.findElement(apd);
			name.click();
			Actions nact = new Actions(driver);
			nact.sendKeys(name,application);
			nact.sendKeys(Keys.ENTER);
			nact.perform();
		}
		
		public void providerName(String provider) {
			
			driver.findElement(By.name("application.providerName")).sendKeys(provider);
		}
		
		public void selectCategory(String ctype) {
			
			WebElement category = driver.findElement(cat);
			category.click();
			Actions cact = new Actions(driver);
			cact.sendKeys(category,ctype);
			cact.sendKeys(Keys.ENTER);
			cact.perform();
		}
		
		public void firstOwnerMail(String fo) throws InterruptedException {
			
			WebElement owner = driver.findElement(fowner);
			owner.click();
			Thread.sleep(3000);
			Actions oact = new Actions(driver);
			oact.sendKeys(owner,fo);
			oact.sendKeys(Keys.ENTER);
			oact.perform();
		}
		
		public void reasonForOnboarding() {
			
			WebElement reason = driver.findElement(req);
			reason.click();
			reason.sendKeys("New requirement for the project");
		}
		
		public void project(String p) throws InterruptedException {
			
			WebElement project = driver.findElement(pro);
			project.click();
			Thread.sleep(3000);
			Actions pact = new Actions(driver);
			pact.sendKeys(project, p);
			pact.sendKeys(Keys.ENTER);
			pact.perform();
		}
		
		public void selectCurrency(String c) {
			
			WebElement currency = driver.findElement(curr);
			currency.click();
			Actions cuact = new Actions(driver);
			cuact.sendKeys(currency, c);
			cuact.sendKeys(Keys.ENTER);
			cuact.perform();
		}
		
		public void productName(String pname) {
			
			driver.findElement(pn).sendKeys(pname);
		}
		
		public void productType(String pt) {
			
			WebElement product = driver.findElement(ptype);
			product.click();
			Actions pro = new Actions(driver);
			pro.sendKeys(product, pt);
			pro.sendKeys(Keys.ENTER);
			pro.perform();
		}
		
		public void unitPrice(String price) {
			
			WebElement unit = driver.findElement(up);
			unit.clear();
			unit.sendKeys(price);
			driver.findElement(upt).click();
			driver.findElement(By.xpath("//div[@title='per year']")).click();
		}
		
		public void quantity(String q) {
			
			driver.findElement(quantity).sendKeys(q);
		}
		
		public void appNextButton() {
			
			driver.findElement(anb).click();
		}
		
		public void chooseFile() throws InterruptedException, AWTException {
			
			driver.findElement(cf).click();
			Thread.sleep(4000);
		    WebElement pdfElement = driver.findElement(By.xpath("//span[contains(text(), 'PDF')]"));
		    pdfElement.click(); 
		    
		   
		    
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
		
		public void docuNextButton() {
			
			 driver.findElement(snb).click();
		}
		
		public void similarAppPage() {
			
			driver.findElement(sanb).click();
		}
		
		public void submitButton() {
			
			driver.findElement(submit).click(); 
			 WebElement sp = driver.findElement(By.xpath("//div[@class='ant-result-icon']"));
			    if (sp.isDisplayed()) {
					
			    	System.out.println("New application onboard is successful");
				} else {
					System.out.println("New application onboard is failed");
				}
		}
		
}
