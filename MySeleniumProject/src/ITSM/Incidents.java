package ITSM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Incidents {

	public static void main(String[] args) throws InterruptedException {
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
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[text()='Not now']")).click();
		
		// Incidents
		driver.findElement(By.xpath("//img[@aria-label='Incidents']")).click();
		
		// Selecting the item from the table
	/*	WebElement table = driver.findElement(By.xpath("//table[@class='MuiTable-root css-1trb3f4']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			for(WebElement c: col) {
				 String ct = c.getText();
				 driver.findElement(By.xpath("//a[normalize-space()='INC-2014']")).click();
			}
			
		} 
		
		 driver.findElement(By.xpath("//a[normalize-space()='INC-2014']")).click();
		 
		driver.findElement(By.xpath("(//div[@class='MuiAutocomplete-endAdornment css-2iz2x6'])[1]")).click(); */
		
		// Click on create new ticket
		driver.findElement(By.xpath("//button[text()='Create New Ticket']")).click();
		
		driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
		
		String rol ="Admin";
		
		List<WebElement> le = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for (WebElement list : le) {
			String t =list.getText();
			if(t.equalsIgnoreCase(rol)) {
				list.click();
				break;
			}
		}
		
		// Next button
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimaryButton MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimaryButton MuiButton-sizeMedium MuiButton-containedSizeMedium css-1hdse2o']")).click();
		Thread.sleep(7000);
		
		// Subject
		driver.findElement(By.name("subject")).sendKeys("test");
		
		// Description
		driver.findElement(By.xpath("(//*[@id='adornment-weight'])[5]")).sendKeys("test");
		
		// Category
		driver.findElement(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1y8gbwp'])[7]")).click();
		List<WebElement> we = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement w : we) {
			String txt = w.getText();
			if(txt.equalsIgnoreCase("CLIENT PC")) {
				w.click();
				break;
			}
		}
		
		// Sub Category
		driver.findElement(By.xpath("(//div[@role='button'])[11]")).click();
		List<WebElement> category = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement ca : category) {
			String text = ca.getText();
			if(text.equalsIgnoreCase("CLIENT")) {
				ca.click();
				break;
			}
		}
		
		// Item Category
		driver.findElement(By.xpath("(//div[@role='button'])[12]")).click();
		List<WebElement> item = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement ic : item) {
			String it = ic.getText();
			if(it.equalsIgnoreCase("SERVER")) {
				ic.click();
				break;
			}
		}
		
		
		
		// Location
		driver.findElement(By.xpath("(//div[@role='button'])[13]")).click();
		List<WebElement> lo = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement l : lo) {
			String lt = l.getText();
			if(lt.equalsIgnoreCase("HQ")) {
				l.click();
				break;
			}
		} 
		
		// Submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		// Success Popup
		WebElement sp = driver.findElement(By.id("alert-dialog-description"));
		if(sp.isDisplayed()) {
			System.out.println("Success popup is displayed.");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}

}
