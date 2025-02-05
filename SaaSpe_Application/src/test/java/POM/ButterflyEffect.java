package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButterflyEffect {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//button[@class='ant-btn css-pjsbzo ant-btn-default !bg-mahb-orange !text-white mt-3 w-fit'])[2]")
	WebElement bs;
	
	@FindBy(linkText = "here")
	WebElement here;
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
	WebElement add;
	
	@FindBy(id ="parentFullName")
	WebElement fullname;
	
	@FindBy(id ="airline")
	WebElement airlines;
	
	@FindBy(id ="parentNricPassportNumber")
	WebElement passportNumber;
	
	@FindBy (id ="flightNumber")
	WebElement flightnumber;
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[5]")
	WebElement issuingCountry;
	
	@FindBy (id ="dateOfVisit")
	WebElement dov;
	
	@FindBy (xpath = "//div[@class='arrow down']")
	WebElement arrow;
	
	@FindBy (xpath = "//input[@class='form-control w-full']")
	WebElement cn;
	
	@FindBy(id ="fullName")
	WebElement fn;
	
	@FindBy(id ="address")
	WebElement address;
	
	@FindBy (id = "nricPassportNumber")
	WebElement nric;
	
	@FindBy (id = "address2")
	WebElement address2;
	
	@FindBy (xpath = "(//div[@class='ant-select-selector'])[4]")
	WebElement gender;
	
	@FindBy (xpath = "(//span[@class='ant-select-selection-item'])[3]")
	WebElement gnric;
	
	
	

}
