package ITSM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

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
		
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-1a8f3b'])[2]")).click();
		
		Thread.sleep(2000);
		
		String monyear = driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")).getText();
		System.out.println(monyear);
		
		String month =monyear.split(" ")[0].trim();
		String year =monyear.split(" ")[1].trim();
		
	/*	while(!((month.equalsIgnoreCase("january") && (year.equals("2023"))))) {
			driver.findElement(By.xpath("//button[@title='Previous month']")).click();
			monyear = driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")).getText();
			month =monyear.split(" ")[0].trim();
			year =monyear.split(" ")[1].trim();
		}
		
		List<WebElement> date = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-v59i29']"));
		for(WebElement d: date) {
			 String dates =d.getText();
			 if(dates.equalsIgnoreCase("20")) {
				 d.click();
				 break;
			 }
		} */
		
		
		
	}

}
