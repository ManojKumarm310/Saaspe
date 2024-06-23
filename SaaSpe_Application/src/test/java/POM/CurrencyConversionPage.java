package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyConversionPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Administration']")
	WebElement adminlink;
	
	@FindBy(xpath = "//span[text()='Preferences']")
	WebElement preference;
	
	@FindBy(xpath = "//span[@class='ant-select-selection-item']")
	WebElement currency;
	
	@FindBy(xpath = "//button[@value='Save']")
	WebElement save;
	
	public CurrencyConversionPage(WebDriver driver) {
		
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void adminLink() {
		adminlink.click();
	}
	
	public void preferenceLink() {
		preference.click();
	}
	
	public void selectCurrency(String pc) {
		WebElement pre = currency;
		pre.click();
		Actions cu = new Actions(driver);
		cu.sendKeys(pre, pc);
		cu.sendKeys(Keys.ENTER);
		cu.perform();
	}
	
	public void saveButton() throws InterruptedException {
		save.click();
		Thread.sleep(3000);
		 if (!save.isEnabled()) {
	            System.out.println("Currency Conversion is successful");
	        } else {
	            System.out.println("Currency conversion is failed");
	        }
		
	}

}
