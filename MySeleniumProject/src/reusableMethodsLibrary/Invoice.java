package reusableMethodsLibrary;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pages.InvoicePage;
import Pages.LoginOfApplication;
import uttils.appUtils;

public class Invoice extends appUtils {
	
	

	LoginOfApplication loa; 
	
	InvoicePage ip;
	
	
	@Test
	public void invoiceTest() throws AWTException, InterruptedException {
		
		loa = new LoginOfApplication(driver);
		ip = new InvoicePage(driver);
		
		
		loa.username("disit59329@unbiex.com"); // disit59329@unbiex.com  // neliariane@yopmail.com
		loa.password("P@ssword-1");
		loa.clickLogin();
		loa.otp();
		loa.otpSubmitButton();
		ip.invoiceButton();
		ip.invoiceAdd();
		ip.invoiceNumber("783221");
		ip.subId();
		
		
		ip.invoiceCurrency("EUR");
		ip.invoiceAmount("8631.50");
		ip.startDate("15/10/2022");
		ip.endDate("14/10/2023");
		ip.dueDate("14/10/2023");
		ip.uploadInvoice();
		ip.clickSubmit();
	}
	
	
	

} 
