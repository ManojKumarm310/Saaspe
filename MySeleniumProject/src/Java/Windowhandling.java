package Java;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Realme P1 5g']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		
		Set<String> s = driver.getWindowHandles();
		Object[] w = s.toArray();
		String w1 = w[0].toString();
		String w2 = w[1].toString();
		
		driver.switchTo().window(w2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
		

	}

}
