package Saaspe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://dev-app.saaspe.com/auth/login");
			
			driver.findElement(By.name("emailAddress")).sendKeys("navya.mallela@mind-graph.com");
			//Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("P@ssword-1");
			driver.findElement(By.cssSelector(".ant-btn")).click();
			//Verify the OTP
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[1]")).click();
			driver.findElement(By.xpath("//input[1]")).sendKeys("7") ;
			driver.findElement(By.xpath("//input[2]")).sendKeys("6") ;
			driver.findElement(By.xpath("//input[3]")).sendKeys("5") ;
			driver.findElement(By.xpath("//input[4]")).sendKeys("4") ;
			driver.findElement(By.xpath("//input[5]")).sendKeys("3") ;
			driver.findElement(By.xpath("//input[6]")).sendKeys("2") ;
			driver.findElement(By.cssSelector(".ant-btn")).click(); 
	        //Click On the Multicloud
			Thread.sleep(9000);
			driver.findElement(By.xpath("//span[normalize-space()='Multicloud']")).click();
			//Click On Budget And Forecast
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Budget & Forecast']")).click();	
		    //Click On Add Button
			driver.findElement(By.cssSelector(".ant-btn-primary")).click();
			WebElement nameInput = driver.findElement(By.xpath("//input[@name='budgetName']"));
			nameInput.sendKeys("Azure Budget 121");
			
			driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Monthly')]")).click();
			Thread.sleep(5000);

	     //   WebElement field1 = driver.findElement(By.cssSelector("#field1Container input[placeholder='Select date']"));
	     //   field1.sendKeys("2024-01-05");
	 /*      List<WebElement> lt = driver.findElements(By.cssSelector("input[placeholder='Select date']"));
	       //System.out.println(lt.size());
	       lt.get(0).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@title='2024-01-01']")).click();
	       lt.get(1).click();
	       try {
	       driver.findElement(By.xpath("//td[@title='2024-01-31']")).click();
	       }
	       catch(Exception e){
	       }
	       lt.get(1).sendKeys("31/01/2024");
	       lt.get(1).sendKeys(Keys.ENTER); */
			
			
			WebElement bsd = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]"));
			bsd.click();
			Actions asd = new Actions(driver);
			asd.sendKeys(bsd, "01/01/2024");
			asd.sendKeys(Keys.ENTER);
			asd.perform();
			
			WebElement end = driver.findElement(By.xpath("(//input[@placeholder='Select date'])[2]"));
			end.click();
			Actions aed = new Actions(driver);
			aed.sendKeys(end, "31/01/2024");
			aed.sendKeys(Keys.ENTER);
			aed.perform();
			
			
			
	       WebElement name1Input = driver.findElement(By.xpath("//input[@name='budgetAmount']"));
			name1Input.sendKeys("5000");
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			//driver.findElement(By.xpath("")).click();
			 driver.findElement(By.cssSelector(".ant-select-selection-item")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("div[title='Actual'] div[class='ant-select-item-option-content']")).click();
			 WebElement setInput = driver.findElement(By.xpath("//input[@name='alerts[0].threshold']"));
			 setInput.sendKeys("60");
			 Thread.sleep(2000);
			 //driver.findElement(By.xpath("//span[normalize-space()='Add another Alert']")).click();	
			 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("saiswaroop.p@mind-graph.com");	
			 driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary")).click();
			 driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();

	}

}
