package firstProject;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

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
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@placeholder='Select date']")).click();
        WebElement cal = driver.findElement(By.className("ant-picker-content"));
        List<WebElement> rows =cal.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
        	List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
        	for (WebElement d : col) {
        		
        		String t = d.getText();
        		if (t.equals("26")) {
					d.click();
				}
				
			}
			
		}
        
        
        
        
        
        
        
        
        
	}

}
