package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// selecting auto suggestion from google


public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\MySeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> auto = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		for (WebElement suggestion : auto) {
			String a = suggestion.getText();
			if (a.equalsIgnoreCase("selenium testing")) {
				suggestion.click();
			}
		}
	}

}
