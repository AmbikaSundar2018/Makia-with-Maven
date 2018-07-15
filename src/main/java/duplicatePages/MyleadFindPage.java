package duplicatePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyleadFindPage extends WebDriverServiceImpl{
  
	@FindBy(linkText = "Find Leads")
	WebElement  eleFindLead;
	
	public MyleadFindPage(EventFiringWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
		public FindingleadtoEdit clickFindLeads() {
			
			click(eleFindLead);
			
			return new FindingleadtoEdit(driver, test);
		}
			
	}
	

