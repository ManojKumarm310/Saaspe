package firstProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstProgram {

	// To find the last link in the page and get the text of the link.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\MySeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
	   List<WebElement> link =driver.findElements(By.tagName("a"));
	   int count = link.size();
	   String s = link.get(count-1).getText();
	   System.out.println(s);
	   System.out.println(count);
		
	}
}
