package deletePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyhomePageFind extends WebDriverServiceImpl{
 
	/*Identifying the locators*/
  
	@FindBy(linkText = "Leads")
	WebElement  eleLeads;
	
	/*Merging driver and page*/
	public MyhomePageFind(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
	
	/*Perform Technical action */
	
		public MyleadFindPage clickLeads() {
			
			click(eleLeads);
			
			return new MyleadFindPage(driver,test);
		}
			
	}
	

