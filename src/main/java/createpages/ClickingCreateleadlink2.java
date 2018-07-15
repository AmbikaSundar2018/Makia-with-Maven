package createpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;
import pages.CreateleadPage1;

public class ClickingCreateleadlink2 extends WebDriverServiceImpl{
  
	@FindBy(linkText = "Create Lead")
	WebElement  eleMyLead;
	
	public ClickingCreateleadlink2(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
		public CreateleadPage1 clickCreateLeads() {
			
			click(eleMyLead);
			
			return new CreateleadPage1(driver, test);
		}
			
	}
	

