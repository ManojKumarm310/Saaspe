package Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxAmountToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		Thread.sleep(3000);
		
	/*	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click(); */
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		double large = 0;
		for(WebElement p: price) {
		String pr =	p.getText().replace("$", "");
		Double d = Double.parseDouble(pr);
		System.out.println(d);
		if(large<d) {
			large = d;
		}
		System.out.println(d);
		}
		
	 driver.findElement(By.xpath("//div[normalize-space()='$"+large+"']/following-sibling::button")).click();
		
		
	}

}
