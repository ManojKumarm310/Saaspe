package reusableMethodsLibrary;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Invoice;

public class In {

	 private WebDriver driver;
	    private Invoice invoicePage;

	    @BeforeClass
	    public void setUp() throws InterruptedException {
	       // System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\lenovo\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\chromedriver.exe");
	        driver = new ChromeDriver();
	        invoicePage = new Invoice(driver);
	        driver.get("https://dev-app.saaspe.com/auth/login");
	        driver.manage().window().maximize();

	        driver.findElement(By.name("emailAddress")).sendKeys("navya.mallela@mind-graph.com");
	       // Thread.sleep(5000);
	        driver.findElement(By.name("password")).sendKeys("P@ssword-1");
	        driver.findElement(By.cssSelector(".ant-btn")).click();
	        Thread.sleep(5000);

	        // Verify the OTP
	      /*  driver.findElement(By.xpath("//input[1]")).click();
	        driver.findElement(By.xpath("//input[1]")).sendKeys("7");
	        driver.findElement(By.xpath("//input[2]")).sendKeys("6");
	        driver.findElement(By.xpath("//input[3]")).sendKeys("5");
	        driver.findElement(By.xpath("//input[4]")).sendKeys("4");
	        driver.findElement(By.xpath("//input[5]")).sendKeys("3");
	        driver.findElement(By.xpath("//input[6]")).sendKeys("2");
	        driver.findElement(By.cssSelector(".ant-btn")).click(); */
	        
	        driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
			driver.findElement(By.xpath("//input[2]")).sendKeys("3");
			driver.findElement(By.xpath("//input[3]")).sendKeys("3");
			driver.findElement(By.xpath("//input[4]")).sendKeys("3");
			driver.findElement(By.xpath("//input[5]")).sendKeys("3");
			driver.findElement(By.xpath("//input[6]")).sendKeys("3");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(5000);
	        // Perform login or any prerequisite steps if needed
	    }

	    @Test
	    public void testInvoiceCreation() throws AWTException, InterruptedException {
	        invoicePage.invoiceButton();
	        Thread.sleep(5000);
	        invoicePage.invoiceAdd();
	        Thread.sleep(5000);
	        invoicePage.invoiceNumber("INV-001");
	        Thread.sleep(5000);
	        invoicePage.subId("12345");
	        Thread.sleep(5000);
	        invoicePage.invoiceCurrency("USD");
	        Thread.sleep(5000);
	        invoicePage.invoiceAmount("1000");
	        Thread.sleep(5000);
	        invoicePage.startDate("2023-11-24");
	        invoicePage.sendKeys(Keys.ENTER);
	        invoicePage.perform();

	        Thread.sleep(5000);
	        invoicePage.endDate("2023-12-24");
	        invoicePage.sendKeys(Keys.ENTER);
	        invoicePage.perform();
	        Thread.sleep(5000);
	        invoicePage.dueDate("2023-12-30");
	        invoicePage.sendKeys(Keys.ENTER);
	        invoicePage.perform();
	        Thread.sleep(5000);
	        invoicePage.uploadInvoice();
	        Thread.sleep(5000);
	        invoicePage.clickSubmit();
	        
	        // Add assertions or verification steps here
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
}
