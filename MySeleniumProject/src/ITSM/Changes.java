package ITSM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://stardesk-itsm-ui-dev.myairports.com.my/");
		
		// user name
		driver.findElement(By.name("username")).sendKeys("bhanu");
		
		// password
		driver.findElement(By.name("password")).sendKeys("Test@321");
		
		// Submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Changes button
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root css-q6ggza'])[4]")).click();
		
		// Create New button
		driver.findElement(By.xpath("//button[text()='Create New']")).click();
		
		// Phone number
		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("54354356457600");
		
		// Subject
		driver.findElement(By.name("subject")).sendKeys("Change Requirement");
		
		// Description
		WebElement des = driver.findElement(By.name("description"));
		
		Actions d = new Actions(driver);
		d.sendKeys(des,"Ok" );
		d.sendKeys(Keys.ENTER);
		d.perform();
		
		// Impact
		driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-2yurte'])[1]")).click();
		
		List<WebElement> li = driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']")).findElements(By.tagName("li"));
		for(WebElement imp : li) {
			String text =imp.getText();
			if(text.equalsIgnoreCase("1. High")) {
				imp.click();
				break;
			}
			
		}
		
		// Urgency
		driver.findElement(By.xpath("(//div[@class='MuiFormControl-root css-tzsjye'])[9]")).click();
		
		List<WebElement> urg =	driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']")).findElements(By.tagName("li"));
		for(WebElement u : urg) {
			String str = u.getText();
			if(str.equalsIgnoreCase("2. Medium")) {
				u.click();
				break;
			}
		}
		
		// change classfication
		driver.findElement(By.xpath("(//div[@class='MuiFormControl-root css-kmxkrk'])[14]")).click();
		
	List<WebElement> cha =driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement change : cha) {
			String text =change.getText();
			if(text.equalsIgnoreCase("Urgent")){
				change.click();
				break;
			}
		}
		
		// Risk
		driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1y8gbwp'])[5]")).click();
		List<WebElement> risk = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement ri : risk) {
			String rtext =ri.getText();
			if(rtext.equalsIgnoreCase("2. Major")) {
				ri.click();
				break;
			}
		}
		
		// Change type
		driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1y8gbwp'])[6]")).click();
		List<WebElement> change = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement ct : change) {
			String cte = ct.getText();
			if(cte.equalsIgnoreCase("Maintenance")) {
				ct.click();
				break;
			}
		}
		
		// Start Date
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1q5k7z'])[3]")).click();
		driver.findElement(By.name("planned_start_date")).sendKeys("06062024");
		
		// Start Time
		driver.findElement(By.name("planned_start_time")).sendKeys("1010");
		
	/*	// End Date
		driver.findElement(By.name("planned_end_date")).sendKeys("11112024");
		
		// End Time
		driver.findElement(By.name("planned_end_time")).sendKeys("1200"); */
		
		// Category
		driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1y8gbwp'])[8]")).click();
		List<WebElement> gor = driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']")).findElements(By.tagName("li"));
		for(WebElement ct : gor) {
			String tt =ct.getText();
			if(tt.equalsIgnoreCase("BUSINESS APPLICATION")) {
				ct.click();
				break;
			}
			
		}
		
		// Before Change
		driver.findElement(By.name("before_change")).sendKeys("Issue need to be resolved");
		
		// After Change
		driver.findElement(By.name("after_change")).sendKeys("Issue solved");
		
		// Location
		driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1y8gbwp'])[11]")).click();
		List<WebElement> loc = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement location: loc) {
			String lt =location.getText();
			if(lt.equalsIgnoreCase("Mulu")) {
				location.click();
				break;
			}
		}
		
	}
	
	

}
