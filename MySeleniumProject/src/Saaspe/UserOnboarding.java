package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserOnboarding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\MySeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://dev-app.saaspe.com/auth/login");
		driver.findElement(By.name("emailAddress")).sendKeys("rishi.p@mind-graph.com");
		driver.findElement(By.name("password")).sendKeys("P@ssword-1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Users']")).click();
        driver.findElement(By.xpath("//div[text()='Add']")).click();
        driver.findElement(By.xpath("//input[@class='ant-radio-input']")).click();
        Thread.sleep(4000);
       
        
        WebElement date = driver.findElement(By.xpath("//input[@placeholder='Select date']"));
        date.click();
        Actions jact = new Actions(driver);
        jact.sendKeys(date,"27/03/2023");
        jact.sendKeys(Keys.ENTER);
        jact.perform();
        
        
        
        
        driver.findElement(By.name("userFirstName")).sendKeys("Nedelka");
        driver.findElement(By.name("userLastName")).sendKeys("Kris");
        driver.findElement(By.name("userEmailAddress")).sendKeys("zufowu@afia.pro");
        driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
        List<WebElement> department = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
        for (WebElement selection : department) {
        	  String s = selection.getText();
        	  if (s.equalsIgnoreCase("HR")) {
        		  selection.click();
        driver.findElement(By.name("userReportingManager")).sendKeys("Richeard");
        driver.findElement(By.name("userMobileNumber")).sendKeys("9500330478");
        // selecting the contract type.
        WebElement type = driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]"));
        type.click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys(type, "Contract");
        act.sendKeys(Keys.ENTER);
        act.perform();
        
        //Selecting the designation.
        
        WebElement designation = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
        designation.click();
        Actions desi = new Actions(driver);
        desi.sendKeys(designation, "Team Lead");
        desi.sendKeys(Keys.ENTER);
        desi.perform();
        
        // Selecting the Gender.
        WebElement gender = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
        gender.click();
        Actions gen = new Actions(driver);
        gen.sendKeys(gender, "Male");
        gen.sendKeys(Keys.ENTER);
        gen.perform();
        
        // Click on the submit button
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        
        
        
        
			}
			
		}
        
        
        
        
        
        
        
	}

}
