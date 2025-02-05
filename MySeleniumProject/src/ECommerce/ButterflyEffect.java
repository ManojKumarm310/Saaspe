package ECommerce;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ButterflyEffect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://airports-nprod-fe.myairports.com.my/en/klia1");
		Thread.sleep(3000);
		//String s = "Air Travel";
		driver.findElement(By.xpath("(//button[text()='Booking Services'])[1]")).click();
		//driver.findElement(By.xpath("(//button[text()='"+ s +"'])[1]")).click();	
		
		/* Moving to booking service using action class
		WebElement bs = driver.findElement(By.xpath("(//button[text()='Booking Services'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(bs).build().perform(); */
		
		driver.findElement(By.xpath("(//button[@class='ant-btn css-pjsbzo ant-btn-default !bg-mahb-orange !text-white mt-3 w-fit'])[2]")).click();
		
		driver.findElement(By.linkText("here")).click();
		
		// Airport dropdown
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		
		List<WebElement> terminal = driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']")).findElements(By.tagName("div"));
		for (WebElement t : terminal) {
			String ter =t.getText();
			if(ter.equalsIgnoreCase("KLIA Terminal 2")) {
				t.click();
				break;
			}
			
		}
		
		// Full Name
		driver.findElement(By.id("parentFullName")).sendKeys("Ramesh");
		
		// Airline
		driver.findElement(By.id("airline")).sendKeys("Srilanken Airlines");
		
		//Passport number
		driver.findElement(By.id("parentNricPassportNumber")).sendKeys("Aj 673");
		
		//Flight Number
		driver.findElement(By.id("flightNumber")).sendKeys("71036");
		
		// passport issuing country
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		//Thread.sleep(2000);
		
		String cou = "Afghanistan";
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='"+ cou +"']")).click();
		
	/*	List<WebElement> pic = driver.findElement(By.xpath("//div[@role='listbox']")).findElements(By.tagName("div"));
		for (WebElement p : pic) {
			String pass =p.getText();
			if(pass.equalsIgnoreCase("Albania")) {
				p.click();
				break;
			}
		} */
		
		//date of visit
		driver.findElement(By.id("dateOfVisit")).sendKeys("22-02-2025");
		
		//contact number
		driver.findElement(By.xpath("//div[@class='arrow down']")).click();
		Thread.sleep(2000);
		List<WebElement> flag = driver.findElement(By.xpath("//ul[@class='country-list']")).findElements(By.tagName("li"));
		for (WebElement f : flag) {
			String country =f.getText();
			if(country.contains("+ 91")) {
				f.click();
				break;
			}
			
		}  
		
		driver.findElement(By.xpath("//input[@class='form-control w-full']")).sendKeys("8888877777");
		
		// full name
		driver.findElement(By.id("fullName")).sendKeys("Monish");
		
		// Address
		driver.findElement(By.id("address")).sendKeys("Chennai");
		
		//nric or passport number
		driver.findElement(By.id("nricPassportNumber")).sendKeys("202403");
		
		// Address 2
		driver.findElement(By.id("address2")).sendKeys("Tamil Nadu");
		
		// Passport issuing country
		// driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]")).click();
		
		// Gender
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[4]")).click();
		
		List<WebElement> gender = driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])[3]")).findElements(By.tagName("div"));
		for (WebElement g : gender) {
			String gen = g.getText();
			if(gen.equalsIgnoreCase("Male")) {
				g.click();
				break;
			}
		}
		
		// NRIC
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
		
		Actions act = new Actions(driver);
		act.sendKeys(element, "singapore");
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
		// city
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		
		// postal code
		driver.findElement(By.id("zipCode")).sendKeys("600001");
		
		// Age
		driver.findElement(By.id("age")).sendKeys("37");
		
		// Country
		WebElement dd =	driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]"));
		dd.click();
		Actions cv = new Actions(driver);
		Thread.sleep(2000);
		for(int i=1;i<25;i++) {
		cv.sendKeys(dd, Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		cv.build().perform();
		
		} 
		
	/*	WebElement dd =	driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]"));
		dd.click();
		Thread.sleep(3000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		 //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		  WebDriverWait wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Anguilla'])[2]")));
		    js.executeScript("document.querySelector('.ant-select-item-option-content').scrollTop=5000"); */
		
		
		
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Andorra']")).click();
		
	/*	List<WebElement> c = driver.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']//div"));
		for (WebElement co : c) {
			String sc =co.getText();
			System.out.println(sc);
			if(sc.equalsIgnoreCase("china")) {
				Actions a = new Actions(driver);
				a.sendKeys(Keys.ENTER);
				a.build().perform();
			}
		}  */
		
		// Email address
		driver.findElement(By.id("email")).sendKeys("test@gmail.com"); 
		
		// Ackn checkbox
		driver.findElement(By.id("acknowlegment")).click();
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[3]")).click();
		
		
	}

}
