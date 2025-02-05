package ECommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import configuration.propertyDetails;

public class AmazonCart {

	//public static String browsername;

	public static void main(String[] args) throws InterruptedException, IOException {
		
	  /*  String browsername = null;
		WebDriver driver = null;
		propertyDetails.getProperties();
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver = new ChromeDriver();
		}else {

			if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "chromedriver.exe");
				// driver = new ChromeDriver();
		} */
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\src\\configuration\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		String browsername =p.getProperty("browser");
		System.out.println(browsername);
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
		}
		
	/*	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); */
	/*	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/"); 
		
		Thread.sleep(2000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("ap_email")).sendKeys("7200094953");
		driver.findElement(By.xpath("//input[contains(@id ,'ap_email')]")).sendKeys("7200094953")
;		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Pass@321");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		List<WebElement> pcost = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
		int sum =0;
		for(WebElement pc : pcost) {
			String product =pc.getText();
			
			 String c = product.replaceAll("[₹,]", "").trim();
			 int number = Integer.parseInt(c);
			 sum = sum + number;
			
		}
		System.out.println(sum); 

	} */

}
}
