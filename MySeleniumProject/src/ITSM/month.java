package ITSM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class month {

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
		
		Thread.sleep(4000);
		
		// Group dropdown
		driver.findElement(By.xpath("//div[@role='button']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> dd = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for (WebElement drop : dd) {
			String s = drop.getText();
			if (s.equalsIgnoreCase("DEVELOPMENT")) {
				drop.click();
				break;
			}
			
		}  
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		
		// Select month
		List<WebElement> month = driver.findElement(By.xpath("//div[@class='MuiMonthPicker-root css-1616glu']")).findElements(By.tagName("button"));
		for (WebElement m : month) {
		String text =m.getText();
		if(text.equalsIgnoreCase("Feb")) {
			m.click();
			break;
		}
			
		}
		
		driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
		
		// Select Year
		List<WebElement> year = driver.findElement(By.xpath("//div[@class='MuiYearPicker-root css-f09ynp']")).findElements(By.tagName("div"));
		for(WebElement y : year) {
			String ytext = y.getText();
			if(ytext.equalsIgnoreCase("2023")) {
				y.click();
				break;
			}
			
		}
		
		// Click ok button
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		// From date
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1a8f3b'])[2]")).click();
		
		// drop down button
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall MuiPickersCalendarHeader-switchViewButton css-w54ew9']")).click();
		
	/*	List<WebElement> fdate = driver.findElement(By.xpath("//div[@class='MuiMonthPicker-root css-1616glu']")).findElements(By.tagName("button"));
		
		for(WebElement sd : fdate) {
			String st =sd.getText();
			if(st.equalsIgnoreCase("Jan")) {
				sd.click();
				break;
			}
		} */
		
		String fdate = driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")).getText();
		System.out.println(fdate);
		
		
		while(!(fdate.equalsIgnoreCase("Jan 2024"))) {
			
			driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[4]"));
			//fdate = driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")).getText();
		} 
		
		
	}

}
