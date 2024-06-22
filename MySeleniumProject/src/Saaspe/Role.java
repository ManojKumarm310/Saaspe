package Saaspe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Role {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		
			
			driver.get("https://dev-app.saaspe.com/auth/login");
			driver.manage().window().maximize();
	 
			//To perform login operation
			driver.findElement(By.name("emailAddress")).sendKeys("disit59329@unbiex.com");
			//Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("P@ssword-1");
			driver.findElement(By.cssSelector(".ant-btn")).click();
			//Verify the OTP
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[1]")).click();
			driver.findElement(By.xpath("//input[1]")).sendKeys("7") ;
			driver.findElement(By.xpath("//input[2]")).sendKeys("6") ;
			driver.findElement(By.xpath("//input[3]")).sendKeys("5") ;
			driver.findElement(By.xpath("//input[4]")).sendKeys("4") ;
			driver.findElement(By.xpath("//input[5]")).sendKeys("3") ;
			driver.findElement(By.xpath("//input[6]")).sendKeys("2") ;
			driver.findElement(By.cssSelector(".ant-btn")).click();
			//Click On the Administration
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Administration']")).click();
			//Click On the User Management
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='User Management']")).click();
			Thread.sleep(5000);
			//Click On AddButton
			driver.findElement(By.cssSelector(".ant-btn-primary")).click();
			Thread.sleep(5000);
			//Create User 
			driver.findElement(By.name("firstName")).sendKeys("Poppy");
			driver.findElement(By.name("lastName")).sendKeys("Amelia");
			driver.findElement(By.name("userEmail")).sendKeys("lyqojyla@imagepoet.net");
			WebElement dd= driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
			dd.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Approver')]")).click();
			Thread.sleep(3000);
			String role =dd.getText();
			if(role.equalsIgnoreCase("Contributor")) {
				Thread.sleep(3000);
				driver.findElement(By.name("userMobileNumber")).sendKeys("7092314658");
			}
			
			driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
			
			// Validation of the created user
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			if (search.isDisplayed()) {
				System.out.println("User creation is success");
			} else {
				System.out.println("User creation is fail");
			}

	}

}
