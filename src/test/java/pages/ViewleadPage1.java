package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class ViewleadPage1 extends WebDriverServiceImpl{
  
	@FindBy(id = "viewLead_firstName_sp")
	WebElement  eleMyLead;
	@FindBy(linkText="Edit")
	WebElement  Editbutton;
	
	public ViewleadPage1(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		
	}
		public ViewleadPage1 verifyPartialText(String Fname) {
			
			verifyExactText(eleMyLead, Fname);
			System.out.println(Fname);
			return this;
		}

		
	}
	

