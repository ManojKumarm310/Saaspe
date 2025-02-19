package Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CLM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://esign-nprod.myairports.com.my/auth/login");
		
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-ghost ant-btn-lg ant-btn-block']")).click();
		driver.findElement(By.name("loginfmt")).sendKeys("nageshwar@naditek-myairports.my");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Azure.12345*");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("idSIButton9")).click();
		//profile arrow
		driver.findElement(By.xpath("//*[@class='iconify iconify--ep']")).click();
		Thread.sleep(2000);
		List<WebElement> role = driver.findElements(By.xpath("//ul[@class='ant-dropdown-menu ant-dropdown-menu-root ant-dropdown-menu-vertical ant-dropdown-menu-light']//li"));
		for (WebElement r : role) {
			String rr = r.getText();
			if(rr.equalsIgnoreCase("LOA Creator")) {
				r.click();
			}
		}
		
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[3]")).click();
		String text = "UI Path Tender";
		driver.findElement(By.xpath("//*[normalize-space()='"+ text +"']")).click();
		
		// edit button
		driver.findElement(By.xpath("(//*[@class='doc-icon iconify iconify--carbon'])[1]")).click();
		
		WebElement pop = driver.findElement(By.xpath("//div[@class='ant-modal-title']"));
		
		if(pop.isDisplayed()) {
			System.out.println("Edit loa popup is displayed");
		}
		
		
	}

}
