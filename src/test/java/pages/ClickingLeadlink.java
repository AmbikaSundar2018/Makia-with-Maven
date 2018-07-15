package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class ClickingLeadlink extends WebDriverServiceImpl{
 
	/*Identifying the locators*/
  
	@FindBy(linkText = "Leads")
	WebElement  eleLeads;
	
	/*Merging driver and page*/
	
	public ClickingLeadlink(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
	
	@And("Click on Leads button")
	
		public ClickingCreateleadlink clickLeads() {
			
			click(eleLeads);
			
			return new ClickingCreateleadlink(driver,test);
		}
			
	}
	

