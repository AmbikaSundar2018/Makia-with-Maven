package createpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;
import pages.ClickingCreateleadlink;

public class ClickingLeadlink2 extends WebDriverServiceImpl{
 
	/*Identifying the locators*/
  
	@FindBy(linkText = "Leads")
	WebElement  eleLeads;
	
	/*Merging driver and page*/
	public ClickingLeadlink2(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
	
	/*Perform Technical action */
	
		public ClickingCreateleadlink clickLeads() {
			
			click(eleLeads);
			
			return new ClickingCreateleadlink(driver,test);
		}
			
	}
	

