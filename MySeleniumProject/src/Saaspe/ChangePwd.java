package Saaspe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePwd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		
		
		driver.findElement(By.name("emailAddress")).sendKeys("disit59329@unbiex.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//input[@name='authenticationcode'])[1]")).sendKeys("3");
		driver.findElement(By.xpath("//input[2]")).sendKeys("3");
		driver.findElement(By.xpath("//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[5]")).sendKeys("3");
		driver.findElement(By.xpath("//input[6]")).sendKeys("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		
		// Click on the Arrow button
		driver.findElement(By.xpath("//*[@class='iconify iconify--ep']")).click();
		
		// Click on the change password
		driver.findElement(By.xpath("//span[@class='ant-dropdown-menu-title-content']")).click();
		
		// Old Password
		driver.findElement(By.name("OldPassword")).sendKeys("P@ssword-1");
		
		// New Password
		driver.findElement(By.name("NewPassword")).sendKeys("P@ssword-1");
		
		// Confirm Password
		driver.findElement(By.name("ConfirmNewPassword")).sendKeys("P@ssword-1");
		
		// Click on the confirm password button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement succ = driver.findElement(By.xpath("//*[@class='iconify iconify--ep']"));
		if (succ.isDisplayed()) {
			System.out.println("Password Change is successful");
		} else {
			System.out.println("Password Change is failed");
		}

	}

}
