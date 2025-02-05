package ECommerce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("chennai");
		Thread.sleep(2000);
		List<WebElement> dd = driver.findElements(By.xpath("//p[@class='searchedResult font14 blackText appendBottom5']"));
		for (WebElement from : dd) {
			String f =from.getText();
			if(f.contains("Chennai")) {
				from.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for(WebElement d: days) {
			String date =d.getText();
			if(date.contains("22")) {
				d.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();

	}

}
