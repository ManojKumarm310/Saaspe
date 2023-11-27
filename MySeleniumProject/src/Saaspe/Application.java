package Saaspe;

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
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Application {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		driver.findElement(By.name("emailAddress")).sendKeys("rishi.p@mind-graph.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//span[text()='Applications'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		// Selecting the type of the application.
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
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
		
		//driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		// Entering the application.
		
		WebElement name = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
		name.click();
		Actions nact = new Actions(driver);
		nact.sendKeys(name,"Jira");
		nact.sendKeys(Keys.ENTER);
		nact.perform();
		
		//Entering the provider name in the field.
		
		driver.findElement(By.name("application.providerName")).sendKeys("Atlasian");
		
		// Selecting the category.
		
		WebElement category = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		category.click();
		Actions cact = new Actions(driver);
		cact.sendKeys(category,"Project Management");
		cact.sendKeys(Keys.ENTER);
		cact.perform();
		
		// Entering the owner mail address.
		
		WebElement owner = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
		owner.click();
		Actions oact = new Actions(driver);
		oact.sendKeys(owner,"becejyjy@clout.wiki");
		oact.sendKeys(Keys.ENTER);
		oact.perform();
		
		// Reason for Onboarding.
		
		WebElement reason = driver.findElement(By.name("application.reason"));
		reason.click();
		reason.sendKeys("New requirement for the project");
		
		// Entering the Project
		
		WebElement project = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
		project.click();
		Actions pact = new Actions(driver);
		pact.sendKeys(project, "Trailblazer Techniques");
		pact.sendKeys(Keys.ENTER);
		pact.perform();
		
		// Selecting the Currency
		
		WebElement currency = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]"));
		currency.click();
		Actions cuact = new Actions(driver);
		cuact.sendKeys(currency, "MYR");
		cuact.sendKeys(Keys.ENTER);
		cuact.perform();
		
		// Entering the Product Name
		
		driver.findElement(By.name("contracts[0].products[0].productName")).sendKeys("Standard");
		
		// Selecting Product Type
		
		WebElement product = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[7]"));
		product.click();
		Actions pro = new Actions(driver);
		pro.sendKeys(product, "License");
		pro.sendKeys(Keys.ENTER);
		pro.perform();
		
		// Entering the unit price
		
		WebElement unit = driver.findElement(By.xpath("//input[@type='number']"));
		unit.clear();
		unit.sendKeys("500");
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[8]")).click();
		driver.findElement(By.xpath("//div[@title='per year']")).click();
		
		// Entering the Quantity
		
		driver.findElement(By.name("contracts[0].products[0].quantity")).sendKeys("10");
		
		// Clicking next button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Clicking choose file button
		
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		Thread.sleep(4000);
	    WebElement pdfElement = driver.findElement(By.xpath("//span[contains(text(), 'PDF')]"));
	    pdfElement.click(); 
	    
	   /* WebDriverWait w = new WebDriverWait(driver, 30);
	    w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ant-modal-body']")))); */
	    
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
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click(); 
	









	    
	 
        
	    

	    
	    
	   
	





	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
