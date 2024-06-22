package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CurrencyConversionPage {
	
	WebDriver driver;
	
	// Admin Link
	By admin = By.xpath("//span[text()='Administration']");
	
	// Preference link
	By prefernce = By.xpath("//span[text()='Preferences']");
	
	// Select currency
	By selectcurrency = By.xpath("//span[@class='ant-select-selection-item']");
	
	// Save Button
	By save = By.xpath("//button[@value='Save']");
	
	// Methods for the currency conversion
	
	public CurrencyConversionPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void prefernceLink() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(admin).click();
		driver.findElement(prefernce).click();
		Thread.sleep(3000);
	}
	
	public void preferredCurrency(String pc) {
		
		WebElement pre = driver.findElement(selectcurrency);
		pre.click();
		Actions cu = new Actions(driver);
		cu.sendKeys(pre, pc);
		cu.sendKeys(Keys.ENTER);
		cu.perform();
	}
	
	public void clickSave() throws InterruptedException {
		
		WebElement save = driver.findElement(By.xpath("//button[@value='Save']"));
		save.click();
		Thread.sleep(3000);
		 if (!save.isEnabled()) {
	            System.out.println("Currency Conversion is successful");
	        } else {
	            System.out.println("Currency conversion is failed");
	        }
		
	}

}
