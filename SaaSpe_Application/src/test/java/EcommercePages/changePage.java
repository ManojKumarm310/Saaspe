package EcommercePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class changePage {
	
	WebDriver driver;
	
	// change button
	
	@FindBy (xpath = "(//button[@class='MuiButtonBase-root css-q6ggza'])[4]")
	WebElement change;
	
	// Create New
	@FindBy (xpath = "//button[text()='Create New']")
	WebElement createNew;
	
	// Phone number
	@FindBy (xpath ="(//input[@type='tel'])[1]")
	WebElement phoneNumber;
	
	// Subject
	@FindBy (name = "subject")
	WebElement subject;
	
	// Description
	@FindBy (name = "description")
	WebElement des;
	
	// Impact
	@FindBy (xpath = "(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-2yurte'])[1]")
	WebElement impact;
	
	// Urgency
	@FindBy (xpath = "(//div[@class='MuiFormControl-root css-tzsjye'])[9]")
	WebElement urgency;
	
	// Classfication
	@FindBy (xpath = "(//div[@class='MuiFormControl-root css-kmxkrk'])[14]")
	WebElement classi;
	
	// Methods
	
	public changePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void changeButton() {
		change.click();
	}
	
	public void createNew() {
		createNew.click();
	}
	
	public void phoneNo(String pno) {
		phoneNumber.sendKeys(pno);
	}
	
	public void subject(String sub) {
		subject.sendKeys(sub);
	}
	
	public void description(String desc) {
		Actions d = new Actions(driver);
		d.sendKeys(des,desc );
		d.sendKeys(Keys.ENTER);
		d.perform();
	}
	
	public void impact(String i) {
		impact.click();
		List<WebElement> li = driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']")).findElements(By.tagName("li"));
		for(WebElement imp : li) {
			String text =imp.getText();
			if(text.equalsIgnoreCase(i)) {
				imp.click();
				break;
			}
			
		}
	}
	
	public void urgency(String ur) {
		urgency.click();
		List<WebElement> urg =	driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']")).findElements(By.tagName("li"));
		for(WebElement u : urg) {
			String str = u.getText();
			if(str.equalsIgnoreCase(ur)) {
				u.click();
				break;
			}
		}
	}
	
	public void changeClassfication(String clas) {
		classi.click();
		List<WebElement> cha =driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.tagName("li"));
		for(WebElement change : cha) {
			String text =change.getText();
			if(text.equalsIgnoreCase(clas)){
				change.click();
				break;
			}
		}
	}
	

}
