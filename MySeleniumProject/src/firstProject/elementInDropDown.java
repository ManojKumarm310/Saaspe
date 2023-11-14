package firstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// To select an element from the drop down and implemented exception handling.


public class elementInDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\MySeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Select drop = new Select(driver.findElement(By.id("searchDropdownBox")));
		try {
			drop.selectByVisibleText("Pen");
		} catch (Exception e) {
			System.out.println("Item is not present in the drop down.");
		}
	}

}
