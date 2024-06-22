package uttils;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class appUtils {
	
public static WebDriver driver;
public static  String url = "https://dev-app.saaspe.com/auth/login";

	
	@BeforeTest
	//@BeforeMethod
	public static void launchapp () {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindgraph-MG\\git\\Saaspe\\MySeleniumProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
/*	@AfterTest
	public static  void closeapp() {
		
		driver.close();
		
	} */

}
