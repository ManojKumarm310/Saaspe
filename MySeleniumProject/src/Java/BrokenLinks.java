package Java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=18133162793019743256&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9183971&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement ab : link) {
		String m =	ab.getAttribute("href");
			URL al = new URL(m);
			HttpURLConnection con = (HttpURLConnection)  al.openConnection();
			con.connect();
			int rc =con.getResponseCode();
			
			if(rc>=400) {
				System.out.println(link + "-" + "is a boken link" );
			
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
