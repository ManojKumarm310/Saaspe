package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InvoicePage {

	WebDriver driver;
	
	public InvoicePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	// Invoice button
		private By invoice = By.xpath("//span[text()='Invoices']");
		
		// Add button
		private By addbutton = By.xpath("(//button[@type='button'])[2]");
		
		// Invoice number
		private By inumber = By.name("invoiceNumber");
		
		// Subscription Id
		private By subid = By.xpath("(//span[@class='ant-select-selection-item'])[1]");
		
		// Invoice Currency
		private By icurrency = By.xpath("(//span[@class='ant-select-selection-item'])[2]");
		
		// Invoice Amount
		private By iamt = By.xpath("//input[@type='number']");
		
		// Start Date
		private By sda = By.xpath("//input[@placeholder='Start date']");
		
		// End Date
		private By eda = By.xpath("//input[@placeholder='End date']");
		
		// Due Date
		private By dda = By.xpath("//input[@placeholder='Select date']");
		
		// Upload Invoice
		private By ui = By.xpath("(//button[@type='button'])[2]");
		
		// Submit button
		private By sub = By.xpath("//button[@type='submit']");
		
		// Methods for the Invoice
		
		public void invoiceButton() {
			
			driver.findElement(invoice).click();
		}
		
		public void invoiceAdd() {
			
			driver.findElement(addbutton).click();
		}
		
		public void invoiceNumber(String ivn) {
			
			driver.findElement(inumber).sendKeys(ivn);
		}
		
		public void subId() {
			
			WebElement sid = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
			sid.click();
			driver.findElement(By.xpath("//div[contains(text(),'id3180')]")).click();
			//driver.findElement(By.xpath("//div[contains(text(),'T941')]")).click();
			//driver.findElement(By.xpath("//div[contains(text(),'Id903')]")).click();
		}
		
		public void invoiceCurrency(String cu) {
			
			WebElement icur = driver.findElement(icurrency);
			icur.click();
			Actions iact = new Actions(driver);
			iact.sendKeys(icur, cu);
			iact.sendKeys(Keys.ENTER);
			iact.perform();
		}
		
		public void invoiceAmount(String amount) {
			
			driver.findElement(iamt).sendKeys(amount);
		}
		
		public void startDate(String sdate) {
			
			WebElement sd = driver.findElement(sda);
			sd.click();
			Actions sact = new Actions(driver);
			sact.sendKeys(sd, sdate);
			sact.sendKeys(Keys.ENTER);
			sact.perform();
		}
		
		public void endDate(String edate) {
			
			WebElement ed = driver.findElement(eda);
			ed.click();
			Actions eact = new Actions(driver);
			eact.sendKeys(ed, edate);
			eact.sendKeys(Keys.ENTER);
			eact.perform();
		}
		
		public void dueDate(String ddate) {
			
			WebElement dd = driver.findElement(dda);
			dd.click();
			Actions dact = new Actions(driver);
			dact.sendKeys(dd, ddate);
			dact.sendKeys(Keys.ENTER);
			dact.perform();
		}
		
		
		public void uploadInvoice() throws AWTException {
			
			WebElement u= driver.findElement(ui);
			u.click();
			
			 Robot robot = new Robot();

	            // Set the clipboard with the file path
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
		
		
		public void clickSubmit() throws InterruptedException {
			
			Thread.sleep(6000);
		    driver.findElement(sub).click();
		    WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		    if (search.isDisplayed()) {
				System.out.println("Invoice test is passed");
			} else {
				System.out.println("Invoice test is failed");
			}
		}
		
}
