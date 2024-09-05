package EcommercePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Incidents {
	
	WebDriver driver;
	
	// Submit button
	@FindBy(xpath = "//button[@type='submit']")
	WebElement sb;
	
	// Incidents
	@FindBy(xpath = "//img[@aria-label='Incidents']")
	WebElement incident;
	
	// New Ticket
	@FindBy (xpath = "//button[text()='Create New Ticket']")
	WebElement nt;
	
	// role
	@FindBy (xpath = "(//div[@role='button'])[2]")
	WebElement role;
	
	// Next button
	@FindBy (xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimaryButton MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimaryButton MuiButton-sizeMedium MuiButton-containedSizeMedium css-1hdse2o']")
	WebElement nbutton;
	
	// Subject
	@FindBy (name = "subject" )
	WebElement sub;
	
	// Description
	@FindBy (xpath = "(//*[@id='adornment-weight'])[5]")
	WebElement des;
	
	// Category
	@FindBy (xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1y8gbwp'])[7]")
	WebElement cate;
	
	// Sub Category
	@FindBy (xpath ="(//div[@role='button'])[11]")
	WebElement sc;
	
	//Item Category
	@FindBy (xpath = "(//div[@role='button'])[12]")
	WebElement item;
	
	// Location
	@FindBy (xpath = "(//div[@role='button'])[13]")
	WebElement location;
	
	// Submit button
	@FindBy (xpath = "//button[text()='Submit']")
	WebElement sbutton;
	
	// Popup
	@FindBy (id ="alert-dialog-description" )
	WebElement spopup;
	
	// Methods
	
	public Incidents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void incidentsButton() {
		
		incident.click();
	}
	
	public void createNewTicket() {
		nt.click();
	}
	
	public void selectRole(String r) {
		role.click();
		String rol = r;
		
		List<WebElement> le = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for (WebElement list : le) {
			String t =list.getText();
			if(t.equalsIgnoreCase(rol)) {
				list.click();
				break;
			}
		}
	}
	
	public void nextButton() throws InterruptedException {
		nbutton.click();
		Thread.sleep(7000);
	}
	
	public void enterSubject(String sk) {
		
		sub.sendKeys(sk);
	}
	
	public void description(String ds) {
		
		des.sendKeys(ds);
	}
	
	public void category(String cl) {
		
		cate.click();
		List<WebElement> we = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement w : we) {
			String txt = w.getText();
			if(txt.equalsIgnoreCase(cl)) {
				w.click();
				break;
			}
		}
	}
	
	public void subCategory(String suc) {
		
		sc.click();
		List<WebElement> category = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement ca : category) {
			String text = ca.getText();
			if(text.equalsIgnoreCase(suc)) {
				ca.click();
				break;
			}
		}
	}
	
	public void itemCategory(String i) {
		
		item.click();
		List<WebElement> item = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement ic : item) {
			String it = ic.getText();
			if(it.equalsIgnoreCase(i)) {
				ic.click();
				break;
			}
		}
	}
	
	public void location(String loc) {
		
		location.click();
		List<WebElement> lo = driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement l : lo) {
			String lt = l.getText();
			if(lt.equalsIgnoreCase(loc)) {
				l.click();
				break;
			}
		} 
	}
	
	public void clickSubmit() throws InterruptedException {
		
		sbutton.click();
		Thread.sleep(5000);
	}
	
	public void successPopup() {
		
		WebElement sp = driver.findElement(By.id("alert-dialog-description"));
		if(sp.isDisplayed()) {
			System.out.println("Success popup is displayed.");
		}else {
			System.out.println("Fail");
		}
		
	}
	
	
}



