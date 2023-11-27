package firstProject;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.InvoicePage;
import Pages.LoginOfApplication;

public class InvTestNg {

	public static WebDriver driver;
	public static  String url = "https://dev-app.saaspe.com/auth/login";

		
		@BeforeTest
		public static void launchapp () {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get(url);
			
		}
		
		LoginOfApplication loa; 
		
		
		InvoicePage ip = new InvoicePage(driver);
		
		@Test(priority = 1)
		public void loginPage() {
		
			loa = new LoginOfApplication(driver);
			loa.username("disit59329@unbiex.com");
			loa.password("P@ssword-1");
			loa.clickLogin();
			loa.otp();
			loa.otpSubmitButton();
		}
		
		@Test(priority = 2)
		public void invoiceDetails(String ino, String si, String c, String amt) {
			
			ip = new InvoicePage(driver);
			ip.invoiceButton();
			ip.invoiceAdd();
			ip.invoiceNumber("80341");
			//ip.subId("Qid-417");
			ip.invoiceCurrency("AUD");
			ip.invoiceAmount("12000");
		}
		
		@Test(priority = 3)
		public void invoiceDate(String startd, String endd, String dued) throws AWTException, InterruptedException {
			
			ip = new InvoicePage(driver);
			ip.startDate("22/11/2023");
			ip.endDate("21/11/2024");
			ip.dueDate("21/11/2024");
			ip.uploadInvoice();
			ip.clickSubmit();
		}
		@AfterTest
		public static  void closeapp() {
			
			driver.close();
			
		}
}
