package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;

public class ClickingCreateleadlink extends WebDriverServiceImpl{
  
	@FindBy(linkText = "Create Lead")
	WebElement  eleMyLead;
	
	public ClickingCreateleadlink(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
	
	 @And ("Click on create Lead")
		public CreateleadPage1 clickCreateLeads() {
			
			click(eleMyLead);
			
			return new CreateleadPage1(driver, test);
		}
			
	}
	

