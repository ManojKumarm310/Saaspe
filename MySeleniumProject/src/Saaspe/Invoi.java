package Saaspe;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invoi {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		
		
		driver.findElement(By.name("emailAddress")).sendKeys("disit59329@unbiex.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		
		// Click on the Invoice button from side menu
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		
		// Add button
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		// Invoice number
		driver.findElement(By.name("invoiceNumber")).sendKeys("IV-61805");
		
		// Subscription Id
		WebElement sid = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]"));
		sid.click();
		driver.findElement(By.xpath("//div[contains(text(),'id3180')]")).click();
		
		
		/*Actions suact = new Actions(driver);
		suact.sendKeys(sid, "id3180");
		suact.sendKeys(Keys.ENTER);
		suact.perform(); */
		
		// Invoice Currency
		WebElement icur = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		icur.click();
		Actions iact = new Actions(driver);
		iact.sendKeys(icur, "MYR");
		iact.sendKeys(Keys.ENTER);
		iact.perform();
		
		// Invoice Amount
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("10000");
		
		// Start Date
		WebElement sd = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
		sd.click();
		Actions sact = new Actions(driver);
		sact.sendKeys(sd, "05/05/2023");
		sact.sendKeys(Keys.ENTER);
		sact.perform();
		
		// End Date
		WebElement ed = driver.findElement(By.xpath("//input[@placeholder='End date']"));
		ed.click();
		Actions eact = new Actions(driver);
		eact.sendKeys(ed, "04/05/2024");
		eact.sendKeys(Keys.ENTER);
		eact.perform();
		
		// Due Date
		WebElement dd = driver.findElement(By.xpath("//input[@placeholder='Select date']"));
		dd.click();
		Actions dact = new Actions(driver);
		dact.sendKeys(dd, "04/05/2024");
		dact.sendKeys(Keys.ENTER);
		dact.perform();
		
		// Upload Invoice
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		Robot robot = new Robot();

	    // Set the clipboard with the file path
	    StringSelection selection = new StringSelection("C:\\IN-1452563.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	    // Simulate Ctrl+V (paste) to paste the file path into the dialog
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);

	    // Simulate Enter to confirm the file upload
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	//   WebDriverWait wait = new WebDriverWait(driver, 20);
	    
	 //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		// Click on the Submit button
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	 
		//driver.close();  
		
	}

}
