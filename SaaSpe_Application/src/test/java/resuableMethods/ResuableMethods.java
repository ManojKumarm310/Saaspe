package resuableMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResuableMethods {
	
	WebDriver driver = null;
	
	public void sendKeys(WebElement w, String s) {
		
		w.click();
		w.clear();
		w.sendKeys(s);
	}
	
	public void click(WebElement web) {
		web.click();
	}
	
	public void actionClassSendkeys(WebElement we, String cou) {
		
		Actions act = new Actions(driver);
		act.sendKeys(we, cou);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	}

}
