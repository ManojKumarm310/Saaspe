package firstProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// In facebook to select an item from the drop down.


public class statements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\MySeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805016%7Cb%7Cfaceboo0k%7C&placement=&creative=550525805016&keyword=faceboo0k&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302583705995%26loc_physical_ms%3D9181929%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwl8anBhCFARIsAKbbpyQMR9OwwzJGTC9fzKr12gRIu0cCyPbjwEuUCcCYoxfWMNFTpYZGhKUaAt4ZEALw_wcB");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("7");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("6");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		
		
		
		
		
		
		
		
		
				
	}
}
