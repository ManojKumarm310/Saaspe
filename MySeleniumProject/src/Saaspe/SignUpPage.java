package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mohan");
		driver.findElement(By.name("lastName")).sendKeys("Kishore");
		driver.findElement(By.name("emailAddress")).sendKeys("mohan@gmail.com");
		driver.findElement(By.name("userMobileNumber")).sendKeys("9533178302");

		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> designation =  driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		Thread.sleep(2000);
		for (WebElement drop : designation) {
			String a = drop.getText();
			if (a.equalsIgnoreCase("Manager")) {
				drop.click();
				break;
			}
		}
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.name("accept")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
