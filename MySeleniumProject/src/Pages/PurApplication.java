package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PurApplication {
	
	public WebDriver driver;
	
	// Application in side menu
	By app = By.xpath("(//span[text()='Applications'])[1]");
	
	// Add button
	By addbu = By.xpath("(//button[@type='button'])[2]");
	
	// Radio button
	By sradio = By.xpath("(//input[@type='radio'])[1]");
	
	// Application dropdown
	By ad = By.xpath("(//span[@class='ant-select-selection-item'])[1]");
	
	// Subscription id
	By sid = By.name("application.subscriptionId");
	
	// Subscription name
	By sname = By.name("application.subscriptionName");
	
	// Category
	By cat = By.xpath("(//span[@class='ant-select-selection-item'])[2]");
	
	// Owner mail address
	By omail = By.xpath("(//span[@class='ant-select-selection-item'])[3]");
	
	// Provider name
	By pn = By.name("application.providerName");
	
	// Project name
	By project = By.xpath("(//span[@class='ant-select-selection-item'])[5]");
	
	// Contract type
	By ctype = By.xpath("(//span[@class='ant-select-selection-item'])[6]");
	
	// Contract name
	By cname = By.name("contracts[0].name");
	
	// Contract tenure
	By ctenure = By.name("contracts[0].contractTenure");
	
	// start date
	By startdate = By.xpath("(//input[@placeholder='Select date'])[1]");
	
	// Billing frequency
	By billf = By.id("rc_select_9");
	
	// Currency
	By bcurrency = By.xpath("(//span[@class='ant-select-selection-item'])[8]");
	
	// Product name
	By productname = By.name("contracts[0].products[0].productName");
	
	// Product type
	By ptype = By.xpath("(//span[@class='ant-select-selection-item'])[9]");
	
	// Unit price
	By up = By.xpath("(//input[@type='number'])[2]");
	
	// Quantity
	By quantity = By.name("contracts[0].products[0].quantity");
	
	// Next button
	By appnext = By.xpath("//button[@type='submit']");
	
	
	
	
	
	
	
	
	
	
	// Create Method
	
	public void applicationPage() {
		
		driver.findElement(app).click();
		driver.findElement(addbu).click();
		driver.findElement(sradio).click();
	}
	
	public void selectApplication(String application) throws InterruptedException {
		
		WebElement app = driver.findElement(ad);
		app.click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.sendKeys(app, application);
		a.sendKeys(Keys.ENTER);
		a.perform();

	}
	
	public void subscriptionId(String sub) {
		
		driver.findElement(sid).sendKeys(sub);
	}
	
	public void subscriptionName(String sn) {
		
		driver.findElement(sname).sendKeys(sn);
	}
	
	public void category(String category) throws InterruptedException {
		
		WebElement ca = driver.findElement(cat);
		ca.click();
		Thread.sleep(1000);
		Actions cact = new Actions(driver);
		cact.sendKeys(ca, category);
		cact.sendKeys(Keys.ENTER);
		cact.perform();
	}
	
	public void fOwnerMail(String fom) throws InterruptedException {
		
		WebElement om = driver.findElement(omail);
		om.click();
		Thread.sleep(9000);
		Actions oa = new Actions(driver);
		oa.sendKeys(om, fom);
		oa.sendKeys(Keys.ENTER);
		oa.perform(); 
	}
	
	public void providerName(String provider) {
		
		driver.findElement(pn).sendKeys(provider);
	}
	
	public void projectName(String pname) throws InterruptedException {
		
		WebElement proj = driver.findElement(project);
		proj.click();
		Thread.sleep(2000);
		Actions pa = new Actions(driver);
		pa.sendKeys(proj, pname);
		pa.sendKeys(Keys.ENTER);
		pa.perform();
	}
	
	public void contractType(String contype) throws InterruptedException {
		
		WebElement con = driver.findElement(ctype);
		con.click();
		Thread.sleep(1000);
		Actions can = new Actions(driver);
		can.sendKeys(con, contype);
		can.sendKeys(Keys.ENTER);
		can.perform();
	}
	
	public void contractName(String conname) {
		
		driver.findElement(cname).sendKeys(conname);
	}
	
	public void contractTenure(String tenure) {
		
		driver.findElement(ctenure).sendKeys(tenure);
	}
	
	public void conStartDate(String s) {
		
		WebElement start = driver.findElement(startdate);
		start.click();
		Actions sd = new Actions(driver);
		sd.sendKeys(start, s);
		sd.sendKeys(Keys.ENTER);
		sd.perform();
	}
	
	public void billingFrequency(String f) {
		
		WebElement bill = driver.findElement(billf);
		bill.click();
		Actions ba = new Actions(driver);
		ba.sendKeys(bill, f);
		ba.sendKeys(Keys.ENTER);
		ba.perform();
	}
	
	public void appCurrency(String c) {
		
		WebElement currency = driver.findElement(bcurrency);
		currency.click();
		Actions curr = new Actions(driver);
		curr.sendKeys(currency, c);
		curr.sendKeys(Keys.ENTER);
		curr.perform(); 
	}
	
	public void productName(String na) {
		
		driver.findElement(productname).sendKeys(na);
	}
	
	public void productType() {
		
		WebElement pt = driver.findElement(ptype);
		pt.click();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Licenses']")).click();
	}
	
	public void unitPrice(String u) {
		
		WebElement unit = driver.findElement(up);
		unit.sendKeys(u);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[10]")).click();
		driver.findElement(By.xpath("//div[@title='per year']")).click(); 
	}
	
	public void quantity(String qu) {
		
		driver.findElement(quantity).sendKeys(qu);
	}
	
	public void appNextButton() {
		
		driver.findElement(appnext).click();
	}
	
	
	
	

}
